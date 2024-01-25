import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!tv")
public final class Class399 {

	@OriginalMember(owner = "loader!tv", name = "d", descriptor = "I")
	private static int anInt10376;

	@OriginalMember(owner = "loader!tv", name = "e", descriptor = "Ljava/lang/String;")
	private static String aString149;

	@OriginalMember(owner = "loader!tv", name = "c", descriptor = "Ljava/lang/String;")
	private static String aString150;

	@OriginalMember(owner = "loader!tv", name = "b", descriptor = "Z")
	private static boolean aBoolean774 = false;

	@OriginalMember(owner = "loader!tv", name = "a", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable9 = new Hashtable(16);

	@OriginalMember(owner = "loader!tv", name = "a", descriptor = "(ILjava/lang/String;I)V")
	public static void method8797(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		anInt10376 = arg0;
		aString149 = arg1;
		try {
			aString150 = System.getProperty("user.home");
			if (aString150 != null) {
				aString150 = aString150 + "/";
			}
		} catch (@Pc(30) Exception local30) {
		}
		if (aString150 == null) {
			aString150 = "~/";
		}
		aBoolean774 = true;
	}

	@OriginalMember(owner = "loader!tv", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;)Ljava/io/File;")
	private static File method8798(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		if (!aBoolean774) {
			throw new RuntimeException("");
		}
		@Pc(18) File local18 = (File) aHashtable9.get(arg1);
		if (local18 != null) {
			return local18;
		}
		@Pc(57) String[] local57 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString150, "/tmp/", "" };
		@Pc(82) String[] local82 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
		for (@Pc(84) int local84 = 0; local84 < 2; local84++) {
			for (@Pc(91) int local91 = 0; local91 < local82.length; local91++) {
				for (@Pc(101) int local101 = 0; local101 < local57.length; local101++) {
					@Pc(135) String local135 = local57[local101] + local82[local91] + "/" + (arg2 == null ? "" : arg2 + "/") + arg1;
					@Pc(137) RandomAccessFile local137 = null;
					try {
						@Pc(142) File local142 = new File(local135);
						if (local84 != 0 || local142.exists()) {
							@Pc(154) String local154 = local57[local101];
							if (local84 != 1 || local154.length() <= 0 || (new File(local154)).exists()) {
								(new File(local57[local101] + local82[local91])).mkdir();
								if (arg2 != null) {
									(new File(local57[local101] + local82[local91] + "/" + arg2)).mkdir();
								}
								local137 = new RandomAccessFile(local142, "rw");
								@Pc(219) int local219 = local137.read();
								local137.seek(0L);
								local137.write(local219);
								local137.seek(0L);
								local137.close();
								aHashtable9.put(arg1, local142);
								return local142;
							}
						}
					} catch (@Pc(238) Exception local238) {
						try {
							if (local137 != null) {
								local137.close();
							}
						} catch (@Pc(247) Exception local247) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "loader!tv", name = "a", descriptor = "(ILjava/lang/String;)Ljava/io/File;")
	public static File method8799(@OriginalArg(1) String arg0) {
		return method8798(anInt10376, arg0, aString149);
	}
}
