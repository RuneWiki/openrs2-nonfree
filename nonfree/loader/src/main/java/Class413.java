import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!vha")
public final class Class413 {

	@OriginalMember(owner = "loader!vha", name = "a", descriptor = "Ljava/lang/String;")
	private static String aString150;

	@OriginalMember(owner = "loader!vha", name = "b", descriptor = "Ljava/lang/String;")
	private static String aString151;

	@OriginalMember(owner = "loader!vha", name = "c", descriptor = "I")
	private static int anInt11322;

	@OriginalMember(owner = "loader!vha", name = "e", descriptor = "Z")
	private static boolean aBoolean824 = false;

	@OriginalMember(owner = "loader!vha", name = "d", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable9 = new Hashtable(16);

	@OriginalMember(owner = "loader!vha", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;I)Ljava/io/File;")
	private static File method9474(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		if (!aBoolean824) {
			throw new RuntimeException("");
		}
		@Pc(11) File local11 = (File) aHashtable9.get(arg1);
		if (local11 != null) {
			return local11;
		}
		@Pc(52) String[] local52 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString150, "/tmp/", "" };
		@Pc(77) String[] local77 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
		for (@Pc(79) int local79 = 0; local79 < 2; local79++) {
			for (@Pc(86) int local86 = 0; local86 < local77.length; local86++) {
				for (@Pc(96) int local96 = 0; local96 < local52.length; local96++) {
					@Pc(130) String local130 = local52[local96] + local77[local86] + "/" + (arg0 == null ? "" : arg0 + "/") + arg1;
					@Pc(132) RandomAccessFile local132 = null;
					try {
						@Pc(137) File local137 = new File(local130);
						if (local79 != 0 || local137.exists()) {
							@Pc(150) String local150 = local52[local96];
							if (local79 != 1 || local150.length() <= 0 || (new File(local150)).exists()) {
								(new File(local52[local96] + local77[local86])).mkdir();
								if (arg0 != null) {
									(new File(local52[local96] + local77[local86] + "/" + arg0)).mkdir();
								}
								local132 = new RandomAccessFile(local137, "rw");
								@Pc(218) int local218 = local132.read();
								local132.seek(0L);
								local132.write(local218);
								local132.seek(0L);
								local132.close();
								aHashtable9.put(arg1, local137);
								return local137;
							}
						}
					} catch (@Pc(237) Exception local237) {
						try {
							if (local132 != null) {
								local132.close();
							}
						} catch (@Pc(246) Exception local246) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "loader!vha", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/io/File;")
	public static File method9475(@OriginalArg(0) String arg0) {
		return method9474(aString151, arg0, anInt11322);
	}

	@OriginalMember(owner = "loader!vha", name = "a", descriptor = "(ILjava/lang/String;I)V")
	public static void method9476(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		anInt11322 = arg0;
		aString151 = arg1;
		try {
			aString150 = System.getProperty("user.home");
			if (aString150 != null) {
				aString150 = aString150 + "/";
			}
		} catch (@Pc(25) Exception local25) {
		}
		aBoolean824 = true;
		if (aString150 == null) {
			aString150 = "~/";
		}
	}
}
