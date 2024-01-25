import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!fs")
public final class Class356 {

	@OriginalMember(owner = "loader!fs", name = "a", descriptor = "I")
	private static int anInt10008;

	@OriginalMember(owner = "loader!fs", name = "d", descriptor = "Ljava/lang/String;")
	private static String aString99;

	@OriginalMember(owner = "loader!fs", name = "b", descriptor = "Ljava/lang/String;")
	private static String aString100;

	@OriginalMember(owner = "loader!fs", name = "c", descriptor = "Z")
	private static boolean aBoolean676 = false;

	@OriginalMember(owner = "loader!fs", name = "e", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable8 = new Hashtable(16);

	@OriginalMember(owner = "loader!fs", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;Z)Ljava/io/File;")
	private static File method7981(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		if (!aBoolean676) {
			throw new RuntimeException("");
		}
		@Pc(11) File local11 = (File) aHashtable8.get(arg2);
		if (local11 != null) {
			return local11;
		}
		@Pc(51) String[] local51 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString99, "/tmp/", "" };
		@Pc(76) String[] local76 = new String[] { ".jagex_cache_" + arg1, ".file_store_" + arg1 };
		for (@Pc(78) int local78 = 0; local78 < 2; local78++) {
			for (@Pc(93) int local93 = 0; local93 < local76.length; local93++) {
				for (@Pc(103) int local103 = 0; local103 < local51.length; local103++) {
					@Pc(138) String local138 = local51[local103] + local76[local93] + "/" + (arg0 == null ? "" : arg0 + "/") + arg2;
					@Pc(140) RandomAccessFile local140 = null;
					try {
						@Pc(145) File local145 = new File(local138);
						if (local78 != 0 || local145.exists()) {
							@Pc(156) String local156 = local51[local103];
							if (local78 != 1 || local156.length() <= 0 || (new File(local156)).exists()) {
								(new File(local51[local103] + local76[local93])).mkdir();
								if (arg0 != null) {
									(new File(local51[local103] + local76[local93] + "/" + arg0)).mkdir();
								}
								local140 = new RandomAccessFile(local145, "rw");
								@Pc(224) int local224 = local140.read();
								local140.seek(0L);
								local140.write(local224);
								local140.seek(0L);
								local140.close();
								aHashtable8.put(arg2, local145);
								return local145;
							}
						}
					} catch (@Pc(243) Exception local243) {
						try {
							if (local140 != null) {
								local140.close();
							}
						} catch (@Pc(252) Exception local252) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "loader!fs", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/io/File;")
	public static File method7982(@OriginalArg(0) String arg0) {
		return method7981(aString100, anInt10008, arg0);
	}

	@OriginalMember(owner = "loader!fs", name = "a", descriptor = "(ILjava/lang/String;B)V")
	public static void method7983(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		anInt10008 = arg0;
		aString100 = arg1;
		try {
			aString99 = System.getProperty("user.home");
			if (aString99 != null) {
				aString99 = aString99 + "/";
			}
		} catch (@Pc(20) Exception local20) {
		}
		aBoolean676 = true;
		if (aString99 == null) {
			aString99 = "~/";
		}
	}
}
