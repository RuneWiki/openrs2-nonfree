import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!le")
public final class Class370 {

	@OriginalMember(owner = "loader!le", name = "e", descriptor = "Ljava/lang/String;")
	private static String aString115;

	@OriginalMember(owner = "loader!le", name = "d", descriptor = "Ljava/lang/String;")
	private static String aString116;

	@OriginalMember(owner = "loader!le", name = "c", descriptor = "I")
	private static int anInt9660;

	@OriginalMember(owner = "loader!le", name = "b", descriptor = "Z")
	private static boolean aBoolean740 = false;

	@OriginalMember(owner = "loader!le", name = "a", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable9 = new Hashtable(16);

	@OriginalMember(owner = "loader!le", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/io/File;")
	public static File method8014(@OriginalArg(0) String arg0) {
		return method8015(arg0, aString116, anInt9660);
	}

	@OriginalMember(owner = "loader!le", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;BI)Ljava/io/File;")
	private static File method8015(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2) {
		if (!aBoolean740) {
			throw new RuntimeException("");
		}
		@Pc(12) File local12 = (File) aHashtable9.get(arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(51) String[] local51 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString115, "/tmp/", "" };
		@Pc(76) String[] local76 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
		for (@Pc(78) int local78 = 0; local78 < 2; local78++) {
			for (@Pc(83) int local83 = 0; local83 < local76.length; local83++) {
				for (@Pc(93) int local93 = 0; local93 < local51.length; local93++) {
					@Pc(128) String local128 = local51[local93] + local76[local83] + "/" + (arg1 == null ? "" : arg1 + "/") + arg0;
					@Pc(130) RandomAccessFile local130 = null;
					try {
						@Pc(135) File local135 = new File(local128);
						if (local78 != 0 || local135.exists()) {
							@Pc(148) String local148 = local51[local93];
							if (local78 != 1 || local148.length() <= 0 || (new File(local148)).exists()) {
								(new File(local51[local93] + local76[local83])).mkdir();
								if (arg1 != null) {
									(new File(local51[local93] + local76[local83] + "/" + arg1)).mkdir();
								}
								local130 = new RandomAccessFile(local135, "rw");
								@Pc(211) int local211 = local130.read();
								local130.seek(0L);
								local130.write(local211);
								local130.seek(0L);
								local130.close();
								aHashtable9.put(arg0, local135);
								return local135;
							}
						}
					} catch (@Pc(230) Exception local230) {
						try {
							if (local130 != null) {
								local130.close();
							}
						} catch (@Pc(238) Exception local238) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "loader!le", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void method8016(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		aString116 = arg1;
		anInt9660 = arg0;
		try {
			aString115 = System.getProperty("user.home");
			if (aString115 != null) {
				aString115 = aString115 + "/";
			}
		} catch (@Pc(25) Exception local25) {
		}
		aBoolean740 = true;
		if (aString115 == null) {
			aString115 = "~/";
		}
	}
}
