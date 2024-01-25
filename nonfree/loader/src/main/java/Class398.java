import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!rt")
public final class Class398 {

	@OriginalMember(owner = "loader!rt", name = "d", descriptor = "Ljava/lang/String;")
	private static String aString134;

	@OriginalMember(owner = "loader!rt", name = "b", descriptor = "I")
	private static int anInt10690;

	@OriginalMember(owner = "loader!rt", name = "a", descriptor = "Ljava/lang/String;")
	private static String aString135;

	@OriginalMember(owner = "loader!rt", name = "e", descriptor = "Z")
	private static boolean aBoolean802 = false;

	@OriginalMember(owner = "loader!rt", name = "c", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable39 = new Hashtable(16);

	@OriginalMember(owner = "loader!rt", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/io/File;")
	public static File method8856(@OriginalArg(1) String arg0) {
		return method8857(anInt10690, arg0, aString135);
	}

	@OriginalMember(owner = "loader!rt", name = "a", descriptor = "(BILjava/lang/String;Ljava/lang/String;)Ljava/io/File;")
	private static File method8857(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		if (!aBoolean802) {
			throw new RuntimeException("");
		}
		@Pc(18) File local18 = (File) aHashtable39.get(arg1);
		if (local18 != null) {
			return local18;
		}
		@Pc(58) String[] local58 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString134, "/tmp/", "" };
		@Pc(83) String[] local83 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
		for (@Pc(85) int local85 = 0; local85 < 2; local85++) {
			for (@Pc(92) int local92 = 0; local92 < local83.length; local92++) {
				for (@Pc(98) int local98 = 0; local98 < local58.length; local98++) {
					@Pc(132) String local132 = local58[local98] + local83[local92] + "/" + (arg2 == null ? "" : arg2 + "/") + arg1;
					@Pc(134) RandomAccessFile local134 = null;
					try {
						@Pc(139) File local139 = new File(local132);
						if (local85 != 0 || local139.exists()) {
							@Pc(149) String local149 = local58[local98];
							if (local85 != 1 || local149.length() <= 0 || (new File(local149)).exists()) {
								(new File(local58[local98] + local83[local92])).mkdir();
								if (arg2 != null) {
									(new File(local58[local98] + local83[local92] + "/" + arg2)).mkdir();
								}
								local134 = new RandomAccessFile(local139, "rw");
								@Pc(218) int local218 = local134.read();
								local134.seek(0L);
								local134.write(local218);
								local134.seek(0L);
								local134.close();
								aHashtable39.put(arg1, local139);
								return local139;
							}
						}
					} catch (@Pc(237) Exception local237) {
						try {
							if (local134 != null) {
								local134.close();
							}
						} catch (@Pc(247) Exception local247) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "loader!rt", name = "a", descriptor = "(Ljava/lang/String;II)V")
	public static void method8858(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		aString135 = arg0;
		anInt10690 = arg1;
		try {
			aString134 = System.getProperty("user.home");
			if (aString134 != null) {
				aString134 = aString134 + "/";
			}
		} catch (@Pc(28) Exception local28) {
		}
		if (aString134 == null) {
			aString134 = "~/";
		}
		aBoolean802 = true;
	}
}
