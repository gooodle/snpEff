package ca.mcgill.mcb.pcingola.snpEffect.testCases.integration;

import org.junit.Assert;
import org.junit.Test;

import ca.mcgill.mcb.pcingola.util.Gpr;

/**
 * Test random SNP changes
 *
 * @author pcingola
 */
public class TestCasesHgvs {

	boolean debug = false;
	boolean verbose = false;

	//	@Test
	//	public void test_02() {
	//		Gpr.debug("Test");
	//		String genomeName = "testHg3775Chr1";
	//		String vcf = "tests/hgvs_1.vep.vcf";
	//		CompareToVep comp = new CompareToVep(genomeName, verbose);
	//		comp.setCompareHgvs();
	//		comp.compareVep(vcf);
	//		if (verbose) System.out.println(comp);
	//		Assert.assertTrue("No comparissons were made!", comp.checkComapred());
	//	}
	//
	//	@Test
	//	public void test_03() {
	//		Gpr.debug("Test");
	//		String genomeName = "testHg3775Chr1";
	//		String vcf = "tests/ensembl_hgvs_intron.1.vep.vcf";
	//		CompareToVep comp = new CompareToVep(genomeName, verbose);
	//		comp.setCompareHgvs();
	//		comp.setStrict(true);
	//		comp.setOnlyProtein(true);
	//		comp.compareVep(vcf);
	//		if (verbose) System.out.println(comp);
	//		Assert.assertTrue("No comparissons were made!", comp.checkComapred());
	//	}
	//
	//	@Test
	//	public void test_04() {
	//		Gpr.debug("Test");
	//		String genomeName = "testHg3775Chr1";
	//		String vcf = "tests/ensembl_hgvs_intron.outsideCds.vep.vcf";
	//		CompareToVep comp = new CompareToVep(genomeName, verbose);
	//		comp.setCompareHgvs();
	//		comp.setStrict(true);
	//		comp.setOnlyProtein(true);
	//		comp.compareVep(vcf);
	//		if (verbose) System.out.println(comp);
	//		Assert.assertTrue("No comparissons were made!", comp.checkComapred());
	//	}
	//
	//	@Test
	//	public void test_05() {
	//		Gpr.debug("Test");
	//		String genomeName = "testHg3775Chr1";
	//		String vcf = "tests/ensembl_hgvs_intron.vep.vcf";
	//		CompareToVep comp = new CompareToVep(genomeName, verbose);
	//		comp.setCompareHgvs();
	//		comp.setStrict(true);
	//		comp.setOnlyProtein(true);
	//		comp.compareVep(vcf);
	//		if (verbose) System.out.println(comp);
	//		Assert.assertTrue("No comparissons were made!", comp.checkComapred());
	//	}
	//
	//	@Test
	//	public void test_06() {
	//		Gpr.debug("Test");
	//		String genomeName = "testHg3775Chr1";
	//		String vcf = "tests/ensembl_hgvs_intron.within_cds.vep.vcf";
	//		CompareToVep comp = new CompareToVep(genomeName, verbose);
	//		comp.setCompareHgvs();
	//		comp.setStrict(true);
	//		comp.setOnlyProtein(true);
	//		comp.compareVep(vcf);
	//		if (verbose) System.out.println(comp);
	//		Assert.assertTrue("No comparissons were made!", comp.checkComapred());
	//	}

	@Test
	public void test_10_MixedVep_HGVS() {
		Gpr.debug("Test");
		String genome = "testHg3775Chr1";
		String vcf = "tests/mixed_10_hgvs.vep.vcf";
		CompareToVep comp = new CompareToVep(genome, verbose);
		comp.setCompareHgvs();
		comp.setOnlyProtein(true);
		comp.compareVep(vcf);
		if (verbose) System.out.println(comp);
		Assert.assertTrue("No comparissons were made!", comp.checkComapred());
	}

	//	@Test
	//	public void test_11_Hg19Hgvs() {
	//		Gpr.debug("Test");
	//		String genome = "testHg19Hgvs";
	//		String vcf = "tests/hgvs_counsyl.vcf";
	//		CompareToVep comp = new CompareToVep(genome, verbose);
	//		comp.setCompareHgvs();
	//		comp.setCompareHgvsProt(false);
	//		comp.compareVep(vcf);
	//		if (verbose) System.out.println(comp);
	//		Assert.assertTrue("No comparissons were made!", comp.checkComapred());
	//	}

	//	/**
	//	 * Using non-standard splice size (15 instead of 2)
	//	 * may cause some HGVS annotations issues
	//	 */
	//	@Test
	//	public void test_12_BRCA_Splice_15_Hgvs() {
	//		Gpr.debug("Test");
	//		int spliceSize = 15;
	//		String genome = "test_BRCA";
	//		String vcf = "tests/test_BRCA_splice_15.vcf";
	//
	//		// Create SnpEff
	//		String args[] = { genome, vcf };
	//		SnpEffCmdEff snpeff = new SnpEffCmdEff();
	//		snpeff.parseArgs(args);
	//		snpeff.setDebug(debug);
	//		snpeff.setVerbose(verbose);
	//		snpeff.setSupressOutput(!verbose);
	//
	//		// The problem appears when splice site is large (in this example)
	//		snpeff.setSpliceSiteSize(spliceSize);
	//		snpeff.setUpDownStreamLength(0);
	//
	//		// Run & get result (single line)
	//		List<VcfEntry> results = snpeff.run(true);
	//		VcfEntry ve = results.get(0);
	//
	//		// Make sure the spleice site is annotatted as "c.1909+12delT" (instead of "c.1910delT")
	//		boolean ok = false;
	//		for (VcfEffect veff : ve.parseEffects())
	//			ok |= veff.getTranscriptId().equals("ENST00000544455") && veff.getHgvsDna().equals("c.1909+12delT");
	//
	//		Assert.assertTrue(ok);
	//	}
	//
	//	/**
	//	 * Using non-standard splice size (15 instead of 2)
	//	 * may cause some HGVS annotations issues
	//	 */
	//	@Test
	//	public void test_14_splice_region_Hgvs() {
	//		Gpr.debug("Test");
	//		String genome = "testHg19Chr1";
	//		String vcf = "tests/hgvs_splice_region.vcf";
	//
	//		// Create SnpEff
	//		String args[] = { genome, vcf };
	//		SnpEffCmdEff snpeff = new SnpEffCmdEff();
	//		snpeff.parseArgs(args);
	//		snpeff.setDebug(debug);
	//		snpeff.setVerbose(verbose);
	//		snpeff.setSupressOutput(!verbose);
	//
	//		// The problem appears when splice site is large (in this example)
	//		snpeff.setUpDownStreamLength(0);
	//
	//		// Run & get result (single line)
	//		List<VcfEntry> results = snpeff.run(true);
	//		VcfEntry ve = results.get(0);
	//
	//		// Make sure the spleice site is annotatted as "c.1909+12delT" (instead of "c.1910delT")
	//		boolean ok = false;
	//		for (VcfEffect veff : ve.parseEffects()) {
	//			if (verbose) System.out.println("\t" + veff + "\t" + veff.getEffectsStr() + "\t" + veff.getHgvsDna());
	//			ok |= veff.getEffectsStr().equals("SPLICE_SITE_REGION") //
	//					&& veff.getTranscriptId().equals("NM_001232.3") //
	//					&& veff.getHgvsDna().equals("c.420+6T>C");
	//		}
	//
	//		Assert.assertTrue(ok);
	//	}

}
