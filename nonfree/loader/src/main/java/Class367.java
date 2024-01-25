import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!tfa")
public final class Class367 {

	@OriginalMember(owner = "loader!tfa", name = "e", descriptor = "Ljava/lang/String;")
	private static String aString118;

	@OriginalMember(owner = "loader!tfa", name = "b", descriptor = "Ljava/lang/String;")
	private static String aString119;

	@OriginalMember(owner = "loader!tfa", name = "c", descriptor = "I")
	private static int anInt9651;

	@OriginalMember(owner = "loader!tfa", name = "a", descriptor = "Z")
	private static boolean aBoolean744 = false;

	@OriginalMember(owner = "loader!tfa", name = "d", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable9 = new Hashtable(16);

	@OriginalMember(owner = "loader!tfa", name = "a", descriptor = "(Ljava/lang/String;II)V")
	public static void method7889(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		anInt9651 = arg1;
		aString118 = arg0;
		try {
			aString119 = System.getProperty("user.home");
			if (aString119 != null) {
				aString119 = aString119 + "/";
			}
		} catch (@Pc(28) Exception local28) {
		}
		if (aString119 == null) {
			aString119 = "~/";
		}
		aBoolean744 = true;
	}

	@OriginalMember(owner = "loader!tfa", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;)Ljava/io/File;")
	private static File method7890(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2) {
		if (!aBoolean744) {
			throw new RuntimeException("");
		}
		@Pc(12) File local12 = (File) aHashtable9.get(arg2);
		if (local12 != null) {
			return local12;
		}
		@Pc(51) String[] local51 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString119, "/tmp/", "" };
		@Pc(84) String[] local84 = new String[] { ".jagex_cache_" + arg1, ".file_store_" + arg1 };
		for (@Pc(86) int local86 = 0; local86 < 2; local86++) {
			for (@Pc(93) int local93 = 0; local93 < local84.length; local93++) {
				for (@Pc(99) int local99 = 0; local99 < local51.length; local99++) {
					@Pc(134) String local134 = local51[local99] + local84[local93] + "/" + (arg0 == null ? "" : arg0 + "/") + arg2;
					@Pc(136) RandomAccessFile local136 = null;
					try {
						@Pc(141) File local141 = new File(local134);
						if (local86 != 0 || local141.exists()) {
							@Pc(154) String local154 = local51[local99];
							if (local86 != 1 || local154.length() <= 0 || (new File(local154)).exists()) {
								(new File(local51[local99] + local84[local93])).mkdir();
								if (arg0 != null) {
									(new File(local51[local99] + local84[local93] + "/" + arg0)).mkdir();
								}
								local136 = new RandomAccessFile(local141, "rw");
								@Pc(218) int local218 = local136.read();
								local136.seek(0L);
								local136.write(local218);
								local136.seek(0L);
								local136.close();
								aHashtable9.put(arg2, local141);
								return local141;
							}
						}
					} catch (@Pc(237) Exception local237) {
						try {
							if (local136 != null) {
								local136.close();
							}
						} catch (@Pc(247) Exception local247) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "loader!tfa", name = "a", descriptor = "(ILjava/lang/String;)Ljava/io/File;")
	public static File method7891(@OriginalArg(1) String arg0) {
		return method7890(aString118, anInt9651, arg0);
	}
}
