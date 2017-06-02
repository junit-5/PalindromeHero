import static org.junit.jupiter.api.Assertions.fail;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class PalindromeHeroTest {

	private static List<String> data;

	@BeforeAll
	static void beforeAll() throws Exception {
		data = FileUtils.readLines(new File(PalindromeHeroTest.class.getResource("/data/palindromes.txt").toURI()),
				StandardCharsets.UTF_8);
	}

	@Disabled
	@Test
	void disabledTest() {
		fail("example test");
	}

}
