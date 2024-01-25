import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!gd")
public final class Class413 {

	@OriginalMember(owner = "loader!gd", name = "d", descriptor = "Ljava/lang/String;")
	private static String aString146;

	@OriginalMember(owner = "loader!gd", name = "a", descriptor = "Ljava/lang/String;")
	private static String aString147;

	@OriginalMember(owner = "loader!gd", name = "b", descriptor = "I")
	private static int anInt11299;

	@OriginalMember(owner = "loader!gd", name = "c", descriptor = "Z")
	private static boolean aBoolean970 = false;

	@OriginalMember(owner = "loader!gd", name = "e", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable9 = new Hashtable(16);

	@OriginalMember(owner = "loader!gd", name = "a", descriptor = "(Ljava/lang/String;BI)V")
	public static void method9886(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		aString146 = arg0;
		anInt11299 = arg1;
		try {
			aString147 = System.getProperty("user.home");
			if (aString147 != null) {
				aString147 = aString147 + "/";
			}
		} catch (@Pc(29) Exception local29) {
		}
		if (aString147 == null) {
			aString147 = "~/";
		}
		aBoolean970 = true;
	}

	@OriginalMember(owner = "loader!gd", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/io/File;")
	public static File method9887(@OriginalArg(0) String arg0) {
		return method9888(aString146, arg0, anInt11299);
	}

	@OriginalMember(owner = "loader!gd", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IZ)Ljava/io/File;")
	private static File method9888(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		if (!aBoolean970) {
			throw new RuntimeException("");
		}
		@Pc(12) File local12 = (File) aHashtable9.get(arg1);
		if (local12 != null) {
			return local12;
		}
		@Pc(51) String[] local51 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString147, "/tmp/", "" };
		@Pc(76) String[] local76 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
		for (@Pc(78) int local78 = 0; local78 < 2; local78++) {
			for (@Pc(85) int local85 = 0; local85 < local76.length; local85++) {
				for (@Pc(91) int local91 = 0; local91 < local51.length; local91++) {
					@Pc(129) String local129 = local51[local91] + local76[local85] + "/" + (arg0 == null ? "" : arg0 + "/") + arg1;
					@Pc(131) RandomAccessFile local131 = null;
					try {
						@Pc(136) File local136 = new File(local129);
						if (local78 != 0 || local136.exists()) {
							@Pc(147) String local147 = local51[local91];
							if (local78 != 1 || local147.length() <= 0 || (new File(local147)).exists()) {
								(new File(local51[local91] + local76[local85])).mkdir();
								if (arg0 != null) {
									(new File(local51[local91] + local76[local85] + "/" + arg0)).mkdir();
								}
								local131 = new RandomAccessFile(local136, "rw");
								@Pc(211) int local211 = local131.read();
								local131.seek(0L);
								local131.write(local211);
								local131.seek(0L);
								local131.close();
								aHashtable9.put(arg1, local136);
								return local136;
							}
						}
					} catch (@Pc(230) Exception local230) {
						try {
							if (local131 != null) {
								local131.close();
							}
						} catch (@Pc(240) Exception local240) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}
}
