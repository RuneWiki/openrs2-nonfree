import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!ne")
public final class Class383 {

	@OriginalMember(owner = "loader!ne", name = "a", descriptor = "I")
	private static int anInt10241;

	@OriginalMember(owner = "loader!ne", name = "d", descriptor = "Ljava/lang/String;")
	private static String aString125;

	@OriginalMember(owner = "loader!ne", name = "e", descriptor = "Ljava/lang/String;")
	private static String aString126;

	@OriginalMember(owner = "loader!ne", name = "b", descriptor = "Z")
	private static boolean aBoolean740 = false;

	@OriginalMember(owner = "loader!ne", name = "c", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable9 = new Hashtable(16);

	@OriginalMember(owner = "loader!ne", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;I)Ljava/io/File;")
	private static File method8799(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		if (!aBoolean740) {
			throw new RuntimeException("");
		}
		@Pc(11) File local11 = (File) aHashtable9.get(arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(51) String[] local51 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString126, "/tmp/", "" };
		@Pc(76) String[] local76 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
		for (@Pc(78) int local78 = 0; local78 < 2; local78++) {
			for (@Pc(85) int local85 = 0; local85 < local76.length; local85++) {
				for (@Pc(91) int local91 = 0; local91 < local51.length; local91++) {
					@Pc(130) String local130 = local51[local91] + local76[local85] + "/" + (arg1 == null ? "" : arg1 + "/") + arg0;
					@Pc(132) RandomAccessFile local132 = null;
					try {
						@Pc(137) File local137 = new File(local130);
						if (local78 != 0 || local137.exists()) {
							@Pc(150) String local150 = local51[local91];
							if (local78 != 1 || local150.length() <= 0 || (new File(local150)).exists()) {
								(new File(local51[local91] + local76[local85])).mkdir();
								if (arg1 != null) {
									(new File(local51[local91] + local76[local85] + "/" + arg1)).mkdir();
								}
								local132 = new RandomAccessFile(local137, "rw");
								@Pc(218) int local218 = local132.read();
								local132.seek(0L);
								local132.write(local218);
								local132.seek(0L);
								local132.close();
								aHashtable9.put(arg0, local137);
								return local137;
							}
						}
					} catch (@Pc(237) Exception local237) {
						try {
							if (local132 != null) {
								local132.close();
							}
						} catch (@Pc(245) Exception local245) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "loader!ne", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/io/File;")
	public static File method8800(@OriginalArg(0) String arg0) {
		return method8799(arg0, aString125, anInt10241);
	}

	@OriginalMember(owner = "loader!ne", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void method8801(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		anInt10241 = arg0;
		aString125 = arg1;
		try {
			aString126 = System.getProperty("user.home");
			if (aString126 != null) {
				aString126 = aString126 + "/";
			}
		} catch (@Pc(27) Exception local27) {
		}
		if (aString126 == null) {
			aString126 = "~/";
		}
		aBoolean740 = true;
	}
}
