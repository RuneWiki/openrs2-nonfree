import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!br")
public final class Class382 {

	@OriginalMember(owner = "loader!br", name = "e", descriptor = "Ljava/lang/String;")
	private static String aString129;

	@OriginalMember(owner = "loader!br", name = "a", descriptor = "I")
	private static int anInt11098;

	@OriginalMember(owner = "loader!br", name = "b", descriptor = "Ljava/lang/String;")
	private static String aString130;

	@OriginalMember(owner = "loader!br", name = "d", descriptor = "Z")
	private static boolean aBoolean755 = false;

	@OriginalMember(owner = "loader!br", name = "c", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable8 = new Hashtable(16);

	@OriginalMember(owner = "loader!br", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;)Ljava/io/File;")
	private static File method9256(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		if (!aBoolean755) {
			throw new RuntimeException("");
		}
		@Pc(12) File local12 = (File) aHashtable8.get(arg1);
		if (local12 != null) {
			return local12;
		}
		@Pc(52) String[] local52 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString129, "/tmp/", "" };
		@Pc(77) String[] local77 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
		for (@Pc(79) int local79 = 0; local79 < 2; local79++) {
			for (@Pc(84) int local84 = 0; local84 < local77.length; local84++) {
				for (@Pc(90) int local90 = 0; local90 < local52.length; local90++) {
					@Pc(129) String local129 = local52[local90] + local77[local84] + "/" + (arg2 == null ? "" : arg2 + "/") + arg1;
					@Pc(131) RandomAccessFile local131 = null;
					try {
						@Pc(136) File local136 = new File(local129);
						if (local79 != 0 || local136.exists()) {
							@Pc(147) String local147 = local52[local90];
							if (local79 != 1 || local147.length() <= 0 || (new File(local147)).exists()) {
								(new File(local52[local90] + local77[local84])).mkdir();
								if (arg2 != null) {
									(new File(local52[local90] + local77[local84] + "/" + arg2)).mkdir();
								}
								local131 = new RandomAccessFile(local136, "rw");
								@Pc(216) int local216 = local131.read();
								local131.seek(0L);
								local131.write(local216);
								local131.seek(0L);
								local131.close();
								aHashtable8.put(arg1, local136);
								return local136;
							}
						}
					} catch (@Pc(235) Exception local235) {
						try {
							if (local131 != null) {
								local131.close();
							}
						} catch (@Pc(243) Exception local243) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "loader!br", name = "a", descriptor = "(ILjava/lang/String;)Ljava/io/File;")
	public static File method9257(@OriginalArg(1) String arg0) {
		return method9256(anInt11098, arg0, aString130);
	}

	@OriginalMember(owner = "loader!br", name = "a", descriptor = "(BLjava/lang/String;I)V")
	public static void method9258(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		anInt11098 = arg1;
		aString130 = arg0;
		try {
			aString129 = System.getProperty("user.home");
			if (aString129 != null) {
				aString129 = aString129 + "/";
			}
		} catch (@Pc(29) Exception local29) {
		}
		aBoolean755 = true;
		if (aString129 == null) {
			aString129 = "~/";
		}
	}
}
