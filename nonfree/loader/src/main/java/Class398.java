import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!wea")
public final class Class398 {

	@OriginalMember(owner = "loader!wea", name = "e", descriptor = "Ljava/lang/String;")
	private static String aString134;

	@OriginalMember(owner = "loader!wea", name = "a", descriptor = "I")
	private static int anInt10970;

	@OriginalMember(owner = "loader!wea", name = "d", descriptor = "Ljava/lang/String;")
	private static String aString135;

	@OriginalMember(owner = "loader!wea", name = "c", descriptor = "Z")
	private static boolean aBoolean766 = false;

	@OriginalMember(owner = "loader!wea", name = "b", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable15 = new Hashtable(16);

	@OriginalMember(owner = "loader!wea", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;)Ljava/io/File;")
	private static File method9064(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		if (!aBoolean766) {
			throw new RuntimeException("");
		}
		@Pc(11) File local11 = (File) aHashtable15.get(arg2);
		if (local11 != null) {
			return local11;
		}
		@Pc(52) String[] local52 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString135, "/tmp/", "" };
		@Pc(77) String[] local77 = new String[] { ".jagex_cache_" + arg1, ".file_store_" + arg1 };
		for (@Pc(79) int local79 = 0; local79 < 2; local79++) {
			for (@Pc(86) int local86 = 0; local86 < local77.length; local86++) {
				for (@Pc(96) int local96 = 0; local96 < local52.length; local96++) {
					@Pc(130) String local130 = local52[local96] + local77[local86] + "/" + (arg0 == null ? "" : arg0 + "/") + arg2;
					@Pc(132) RandomAccessFile local132 = null;
					try {
						@Pc(137) File local137 = new File(local130);
						if (local79 != 0 || local137.exists()) {
							@Pc(149) String local149 = local52[local96];
							if (local79 != 1 || local149.length() <= 0 || (new File(local149)).exists()) {
								(new File(local52[local96] + local77[local86])).mkdir();
								if (arg0 != null) {
									(new File(local52[local96] + local77[local86] + "/" + arg0)).mkdir();
								}
								local132 = new RandomAccessFile(local137, "rw");
								@Pc(212) int local212 = local132.read();
								local132.seek(0L);
								local132.write(local212);
								local132.seek(0L);
								local132.close();
								aHashtable15.put(arg2, local137);
								return local137;
							}
						}
					} catch (@Pc(231) Exception local231) {
						try {
							if (local132 != null) {
								local132.close();
							}
						} catch (@Pc(239) Exception local239) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "loader!wea", name = "a", descriptor = "(Ljava/lang/String;II)V")
	public static void method9065(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		anInt10970 = arg1;
		aString134 = arg0;
		try {
			aString135 = System.getProperty("user.home");
			if (aString135 != null) {
				aString135 = aString135 + "/";
			}
		} catch (@Pc(25) Exception local25) {
		}
		if (aString135 == null) {
			aString135 = "~/";
		}
		aBoolean766 = true;
	}

	@OriginalMember(owner = "loader!wea", name = "a", descriptor = "(ILjava/lang/String;)Ljava/io/File;")
	public static File method9066(@OriginalArg(1) String arg0) {
		return method9064(aString134, anInt10970, arg0);
	}
}
