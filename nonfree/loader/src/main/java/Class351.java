import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!de")
public final class Class351 {

	@OriginalMember(owner = "loader!de", name = "a", descriptor = "Ljava/lang/String;")
	private static String aString124;

	@OriginalMember(owner = "loader!de", name = "b", descriptor = "Ljava/lang/String;")
	private static String aString125;

	@OriginalMember(owner = "loader!de", name = "e", descriptor = "I")
	private static int anInt9659;

	@OriginalMember(owner = "loader!de", name = "d", descriptor = "Z")
	private static boolean aBoolean672 = false;

	@OriginalMember(owner = "loader!de", name = "c", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable8 = new Hashtable(16);

	@OriginalMember(owner = "loader!de", name = "a", descriptor = "(BILjava/lang/String;)V")
	public static void method7906(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		aString124 = arg1;
		anInt9659 = arg0;
		try {
			aString125 = System.getProperty("user.home");
			if (aString125 != null) {
				aString125 = aString125 + "/";
			}
		} catch (@Pc(20) Exception local20) {
		}
		aBoolean672 = true;
		if (aString125 == null) {
			aString125 = "~/";
		}
	}

	@OriginalMember(owner = "loader!de", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;I)Ljava/io/File;")
	private static File method7907(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		if (!aBoolean672) {
			throw new RuntimeException("");
		}
		@Pc(12) File local12 = (File) aHashtable8.get(arg1);
		if (local12 != null) {
			return local12;
		}
		@Pc(53) String[] local53 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString125, "/tmp/", "" };
		@Pc(78) String[] local78 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
		for (@Pc(86) int local86 = 0; local86 < 2; local86++) {
			for (@Pc(91) int local91 = 0; local91 < local78.length; local91++) {
				for (@Pc(97) int local97 = 0; local97 < local53.length; local97++) {
					@Pc(132) String local132 = local53[local97] + local78[local91] + "/" + (arg0 == null ? "" : arg0 + "/") + arg1;
					@Pc(134) RandomAccessFile local134 = null;
					try {
						@Pc(139) File local139 = new File(local132);
						if (local86 != 0 || local139.exists()) {
							@Pc(149) String local149 = local53[local97];
							if (local86 != 1 || local149.length() <= 0 || (new File(local149)).exists()) {
								(new File(local53[local97] + local78[local91])).mkdir();
								if (arg0 != null) {
									(new File(local53[local97] + local78[local91] + "/" + arg0)).mkdir();
								}
								local134 = new RandomAccessFile(local139, "rw");
								@Pc(214) int local214 = local134.read();
								local134.seek(0L);
								local134.write(local214);
								local134.seek(0L);
								local134.close();
								aHashtable8.put(arg1, local139);
								return local139;
							}
						}
					} catch (@Pc(233) Exception local233) {
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

	@OriginalMember(owner = "loader!de", name = "a", descriptor = "(ILjava/lang/String;)Ljava/io/File;")
	public static File method7908(@OriginalArg(1) String arg0) {
		return method7907(aString124, arg0, anInt9659);
	}
}
