import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!oga")
public final class Class388 {

	@OriginalMember(owner = "loader!oga", name = "c", descriptor = "Ljava/lang/String;")
	private static String aString124;

	@OriginalMember(owner = "loader!oga", name = "d", descriptor = "Ljava/lang/String;")
	private static String aString125;

	@OriginalMember(owner = "loader!oga", name = "e", descriptor = "I")
	private static int anInt10311;

	@OriginalMember(owner = "loader!oga", name = "b", descriptor = "Z")
	private static boolean aBoolean786 = false;

	@OriginalMember(owner = "loader!oga", name = "a", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable9 = new Hashtable(16);

	@OriginalMember(owner = "loader!oga", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void method8709(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		anInt10311 = arg0;
		aString125 = arg1;
		try {
			aString124 = System.getProperty("user.home");
			if (aString124 != null) {
				aString124 = aString124 + "/";
			}
		} catch (@Pc(20) Exception local20) {
		}
		if (aString124 == null) {
			aString124 = "~/";
		}
		aBoolean786 = true;
	}

	@OriginalMember(owner = "loader!oga", name = "a", descriptor = "(BLjava/lang/String;)Ljava/io/File;")
	public static File method8710(@OriginalArg(1) String arg0) {
		return method8711(aString125, anInt10311, arg0);
	}

	@OriginalMember(owner = "loader!oga", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;)Ljava/io/File;")
	private static File method8711(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2) {
		if (!aBoolean786) {
			throw new RuntimeException("");
		}
		@Pc(12) File local12 = (File) aHashtable9.get(arg2);
		if (local12 != null) {
			return local12;
		}
		@Pc(52) String[] local52 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString124, "/tmp/", "" };
		@Pc(77) String[] local77 = new String[] { ".jagex_cache_" + arg1, ".file_store_" + arg1 };
		for (@Pc(79) int local79 = 0; local79 < 2; local79++) {
			for (@Pc(84) int local84 = 0; local84 < local77.length; local84++) {
				for (@Pc(94) int local94 = 0; local94 < local52.length; local94++) {
					@Pc(128) String local128 = local52[local94] + local77[local84] + "/" + (arg0 == null ? "" : arg0 + "/") + arg2;
					@Pc(130) RandomAccessFile local130 = null;
					try {
						@Pc(135) File local135 = new File(local128);
						if (local79 != 0 || local135.exists()) {
							@Pc(149) String local149 = local52[local94];
							if (local79 != 1 || local149.length() <= 0 || (new File(local149)).exists()) {
								(new File(local52[local94] + local77[local84])).mkdir();
								if (arg0 != null) {
									(new File(local52[local94] + local77[local84] + "/" + arg0)).mkdir();
								}
								local130 = new RandomAccessFile(local135, "rw");
								@Pc(215) int local215 = local130.read();
								local130.seek(0L);
								local130.write(local215);
								local130.seek(0L);
								local130.close();
								aHashtable9.put(arg2, local135);
								return local135;
							}
						}
					} catch (@Pc(234) Exception local234) {
						try {
							if (local130 != null) {
								local130.close();
							}
						} catch (@Pc(243) Exception local243) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}
}
