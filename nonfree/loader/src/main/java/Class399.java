import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!af")
public final class Class399 {

	@OriginalMember(owner = "loader!af", name = "c", descriptor = "I")
	private static int anInt10930;

	@OriginalMember(owner = "loader!af", name = "b", descriptor = "Ljava/lang/String;")
	private static String aString124;

	@OriginalMember(owner = "loader!af", name = "a", descriptor = "Ljava/lang/String;")
	private static String aString125;

	@OriginalMember(owner = "loader!af", name = "e", descriptor = "Z")
	private static boolean aBoolean770 = false;

	@OriginalMember(owner = "loader!af", name = "d", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable20 = new Hashtable(16);

	@OriginalMember(owner = "loader!af", name = "a", descriptor = "(ZLjava/lang/String;ILjava/lang/String;)Ljava/io/File;")
	private static File method9231(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		if (!aBoolean770) {
			throw new RuntimeException("");
		}
		@Pc(11) File local11 = (File) aHashtable20.get(arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(51) String[] local51 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString125, "/tmp/", "" };
		@Pc(76) String[] local76 = new String[] { ".jagex_cache_" + arg1, ".file_store_" + arg1 };
		for (@Pc(78) int local78 = 0; local78 < 2; local78++) {
			for (@Pc(83) int local83 = 0; local83 < local76.length; local83++) {
				for (@Pc(93) int local93 = 0; local93 < local51.length; local93++) {
					@Pc(132) String local132 = local51[local93] + local76[local83] + "/" + (arg2 == null ? "" : arg2 + "/") + arg0;
					@Pc(134) RandomAccessFile local134 = null;
					try {
						@Pc(139) File local139 = new File(local132);
						if (local78 != 0 || local139.exists()) {
							@Pc(150) String local150 = local51[local93];
							if (local78 != 1 || local150.length() <= 0 || (new File(local150)).exists()) {
								(new File(local51[local93] + local76[local83])).mkdir();
								if (arg2 != null) {
									(new File(local51[local93] + local76[local83] + "/" + arg2)).mkdir();
								}
								local134 = new RandomAccessFile(local139, "rw");
								@Pc(213) int local213 = local134.read();
								local134.seek(0L);
								local134.write(local213);
								local134.seek(0L);
								local134.close();
								aHashtable20.put(arg0, local139);
								return local139;
							}
						}
					} catch (@Pc(232) Exception local232) {
						try {
							if (local134 != null) {
								local134.close();
							}
						} catch (@Pc(242) Exception local242) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "loader!af", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/io/File;")
	public static File method9232(@OriginalArg(0) String arg0) {
		return method9231(arg0, anInt10930, aString124);
	}

	@OriginalMember(owner = "loader!af", name = "a", descriptor = "(Ljava/lang/String;II)V")
	public static void method9233(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		aString124 = arg0;
		anInt10930 = arg1;
		try {
			aString125 = System.getProperty("user.home");
			if (aString125 != null) {
				aString125 = aString125 + "/";
			}
		} catch (@Pc(27) Exception local27) {
		}
		if (aString125 == null) {
			aString125 = "~/";
		}
		aBoolean770 = true;
	}
}
