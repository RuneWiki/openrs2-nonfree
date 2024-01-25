import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!vba")
public final class Class399 {

	@OriginalMember(owner = "loader!vba", name = "d", descriptor = "I")
	private static int anInt10908;

	@OriginalMember(owner = "loader!vba", name = "e", descriptor = "Ljava/lang/String;")
	private static String aString145;

	@OriginalMember(owner = "loader!vba", name = "c", descriptor = "Ljava/lang/String;")
	private static String aString146;

	@OriginalMember(owner = "loader!vba", name = "b", descriptor = "Z")
	private static boolean aBoolean832 = false;

	@OriginalMember(owner = "loader!vba", name = "a", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable9 = new Hashtable(16);

	@OriginalMember(owner = "loader!vba", name = "a", descriptor = "(ZILjava/lang/String;)V")
	public static void method9408(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		anInt10908 = arg0;
		aString145 = arg1;
		try {
			aString146 = System.getProperty("user.home");
			if (aString146 != null) {
				aString146 = aString146 + "/";
			}
		} catch (@Pc(20) Exception local20) {
		}
		aBoolean832 = true;
		if (aString146 == null) {
			aString146 = "~/";
		}
	}

	@OriginalMember(owner = "loader!vba", name = "a", descriptor = "(BILjava/lang/String;Ljava/lang/String;)Ljava/io/File;")
	private static File method9409(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		if (!aBoolean832) {
			throw new RuntimeException("");
		}
		@Pc(11) File local11 = (File) aHashtable9.get(arg2);
		if (local11 != null) {
			return local11;
		}
		@Pc(51) String[] local51 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString146, "/tmp/", "" };
		@Pc(82) String[] local82 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
		for (@Pc(84) int local84 = 0; local84 < 2; local84++) {
			for (@Pc(89) int local89 = 0; local89 < local82.length; local89++) {
				for (@Pc(95) int local95 = 0; local95 < local51.length; local95++) {
					@Pc(130) String local130 = local51[local95] + local82[local89] + "/" + (arg1 == null ? "" : arg1 + "/") + arg2;
					@Pc(132) RandomAccessFile local132 = null;
					try {
						@Pc(137) File local137 = new File(local130);
						if (local84 != 0 || local137.exists()) {
							@Pc(150) String local150 = local51[local95];
							if (local84 != 1 || local150.length() <= 0 || (new File(local150)).exists()) {
								(new File(local51[local95] + local82[local89])).mkdir();
								if (arg1 != null) {
									(new File(local51[local95] + local82[local89] + "/" + arg1)).mkdir();
								}
								local132 = new RandomAccessFile(local137, "rw");
								@Pc(214) int local214 = local132.read();
								local132.seek(0L);
								local132.write(local214);
								local132.seek(0L);
								local132.close();
								aHashtable9.put(arg2, local137);
								return local137;
							}
						}
					} catch (@Pc(233) Exception local233) {
						try {
							if (local132 != null) {
								local132.close();
							}
						} catch (@Pc(241) Exception local241) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "loader!vba", name = "a", descriptor = "(ILjava/lang/String;)Ljava/io/File;")
	public static File method9410(@OriginalArg(1) String arg0) {
		return method9409(anInt10908, aString145, arg0);
	}
}
