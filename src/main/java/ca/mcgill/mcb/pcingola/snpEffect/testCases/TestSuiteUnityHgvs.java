package ca.mcgill.mcb.pcingola.snpEffect.testCases;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import ca.mcgill.mcb.pcingola.snpEffect.testCases.integration.TestCasesHgvs;
import ca.mcgill.mcb.pcingola.snpEffect.testCases.integration.TestCasesHgvsDnaDupIntegration;
import ca.mcgill.mcb.pcingola.snpEffect.testCases.integration.TestCasesHgvsExon;
import ca.mcgill.mcb.pcingola.snpEffect.testCases.integration.TestCasesHgvsIntron;
import ca.mcgill.mcb.pcingola.snpEffect.testCases.unity.TestCasesHgvsDnaDup;
import ca.mcgill.mcb.pcingola.snpEffect.testCases.unity.TestCasesHgvsDnaDupNegative;
import ca.mcgill.mcb.pcingola.snpEffect.testCases.unity.TestCasesHgvsProtDup;

/**
 * Invoke all test cases for SnpEff
 *
 * @author pcingola
 */
@RunWith(Suite.class)
@SuiteClasses({ TestCasesHgvsExon.class, //
		TestCasesHgvsIntron.class, //
		TestCasesHgvsDnaDup.class, //
		TestCasesHgvsDnaDupNegative.class, //
		TestCasesHgvsProtDup.class, //
		TestCasesHgvs.class, //
		TestCasesHgvsDnaDupIntegration.class //
})
public class TestSuiteUnityHgvs {

}
