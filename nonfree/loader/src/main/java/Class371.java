import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!gw")
public final class Class371 {

	@OriginalMember(owner = "loader!gw", name = "a", descriptor = "Ljava/lang/String;")
	private static String aString114;

	@OriginalMember(owner = "loader!gw", name = "c", descriptor = "Ljava/lang/String;")
	private static String aString115;

	@OriginalMember(owner = "loader!gw", name = "d", descriptor = "I")
	private static int anInt9670;

	@OriginalMember(owner = "loader!gw", name = "b", descriptor = "Z")
	private static boolean aBoolean757 = false;

	@OriginalMember(owner = "loader!gw", name = "e", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable9 = new Hashtable(16);

	@OriginalMember(owner = "loader!gw", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/io/File;")
	public static File method7885(@OriginalArg(1) String arg0) {
		return method7886(aString115, anInt9670, arg0);
	}

	@OriginalMember(owner = "loader!gw", name = "a", descriptor = "(Ljava/lang/String;IZLjava/lang/String;)Ljava/io/File;")
	private static File method7886(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2) {
		if (!aBoolean757) {
			throw new RuntimeException("");
		}
		@Pc(17) File local17 = (File) aHashtable9.get(arg2);
		if (local17 != null) {
			return local17;
		}
		@Pc(57) String[] local57 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString114, "/tmp/", "" };
		@Pc(82) String[] local82 = new String[] { ".jagex_cache_" + arg1, ".file_store_" + arg1 };
		for (@Pc(84) int local84 = 0; local84 < 2; local84++) {
			for (@Pc(91) int local91 = 0; local91 < local82.length; local91++) {
				for (@Pc(97) int local97 = 0; local97 < local57.length; local97++) {
					@Pc(136) String local136 = local57[local97] + local82[local91] + "/" + (arg0 == null ? "" : arg0 + "/") + arg2;
					@Pc(138) RandomAccessFile local138 = null;
					try {
						@Pc(143) File local143 = new File(local136);
						if (local84 != 0 || local143.exists()) {
							@Pc(156) String local156 = local57[local97];
							if (local84 != 1 || local156.length() <= 0 || (new File(local156)).exists()) {
								(new File(local57[local97] + local82[local91])).mkdir();
								if (arg0 != null) {
									(new File(local57[local97] + local82[local91] + "/" + arg0)).mkdir();
								}
								local138 = new RandomAccessFile(local143, "rw");
								@Pc(220) int local220 = local138.read();
								local138.seek(0L);
								local138.write(local220);
								local138.seek(0L);
								local138.close();
								aHashtable9.put(arg2, local143);
								return local143;
							}
						}
					} catch (@Pc(239) Exception local239) {
						try {
							if (local138 != null) {
								local138.close();
							}
						} catch (@Pc(247) Exception local247) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "loader!gw", name = "a", descriptor = "(ILjava/lang/String;I)V")
	public static void method7887(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		anInt9670 = arg0;
		aString115 = arg1;
		try {
			aString114 = System.getProperty("user.home");
			if (aString114 != null) {
				aString114 = aString114 + "/";
			}
		} catch (@Pc(26) Exception local26) {
		}
		aBoolean757 = true;
		if (aString114 == null) {
			aString114 = "~/";
		}
	}
}
