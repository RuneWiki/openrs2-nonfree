import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!bi")
public final class Class396 {

	@OriginalMember(owner = "loader!bi", name = "a", descriptor = "Ljava/lang/String;")
	private static String aString124;

	@OriginalMember(owner = "loader!bi", name = "d", descriptor = "I")
	private static int anInt10900;

	@OriginalMember(owner = "loader!bi", name = "c", descriptor = "Ljava/lang/String;")
	private static String aString125;

	@OriginalMember(owner = "loader!bi", name = "b", descriptor = "Z")
	private static boolean aBoolean927 = false;

	@OriginalMember(owner = "loader!bi", name = "e", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable8 = new Hashtable(16);

	@OriginalMember(owner = "loader!bi", name = "a", descriptor = "(ILjava/lang/String;)Ljava/io/File;")
	public static File method9062(@OriginalArg(1) String arg0) {
		return method9063(aString125, anInt10900, arg0);
	}

	@OriginalMember(owner = "loader!bi", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;I)Ljava/io/File;")
	private static File method9063(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		if (!aBoolean927) {
			throw new RuntimeException("");
		}
		@Pc(11) File local11 = (File) aHashtable8.get(arg2);
		if (local11 != null) {
			return local11;
		}
		@Pc(51) String[] local51 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString124, "/tmp/", "" };
		@Pc(76) String[] local76 = new String[] { ".jagex_cache_" + arg1, ".file_store_" + arg1 };
		for (@Pc(78) int local78 = 0; local78 < 2; local78++) {
			for (@Pc(83) int local83 = 0; local83 < local76.length; local83++) {
				for (@Pc(89) int local89 = 0; local89 < local51.length; local89++) {
					@Pc(124) String local124 = local51[local89] + local76[local83] + "/" + (arg0 == null ? "" : arg0 + "/") + arg2;
					@Pc(126) RandomAccessFile local126 = null;
					try {
						@Pc(131) File local131 = new File(local124);
						if (local78 != 0 || local131.exists()) {
							@Pc(143) String local143 = local51[local89];
							if (local78 != 1 || local143.length() <= 0 || (new File(local143)).exists()) {
								(new File(local51[local89] + local76[local83])).mkdir();
								if (arg0 != null) {
									(new File(local51[local89] + local76[local83] + "/" + arg0)).mkdir();
								}
								local126 = new RandomAccessFile(local131, "rw");
								@Pc(207) int local207 = local126.read();
								local126.seek(0L);
								local126.write(local207);
								local126.seek(0L);
								local126.close();
								aHashtable8.put(arg2, local131);
								return local131;
							}
						}
					} catch (@Pc(226) Exception local226) {
						try {
							if (local126 != null) {
								local126.close();
							}
						} catch (@Pc(234) Exception local234) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "loader!bi", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void method9064(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		anInt10900 = arg0;
		aString125 = arg1;
		try {
			aString124 = System.getProperty("user.home");
			if (aString124 != null) {
				aString124 = aString124 + "/";
			}
		} catch (@Pc(27) Exception local27) {
		}
		aBoolean927 = true;
		if (aString124 == null) {
			aString124 = "~/";
		}
	}
}
