import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!fda")
public final class Class368 {

	@OriginalMember(owner = "loader!fda", name = "a", descriptor = "Ljava/lang/String;")
	private static String aString118;

	@OriginalMember(owner = "loader!fda", name = "c", descriptor = "Ljava/lang/String;")
	private static String aString119;

	@OriginalMember(owner = "loader!fda", name = "e", descriptor = "I")
	private static int anInt10302;

	@OriginalMember(owner = "loader!fda", name = "d", descriptor = "Z")
	private static boolean aBoolean728 = false;

	@OriginalMember(owner = "loader!fda", name = "b", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable9 = new Hashtable(16);

	@OriginalMember(owner = "loader!fda", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;I)Ljava/io/File;")
	private static File method8414(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		if (!aBoolean728) {
			throw new RuntimeException("");
		}
		@Pc(12) File local12 = (File) aHashtable9.get(arg1);
		if (local12 != null) {
			return local12;
		}
		@Pc(53) String[] local53 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString119, "/tmp/", "" };
		@Pc(78) String[] local78 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
		for (@Pc(80) int local80 = 0; local80 < 2; local80++) {
			for (@Pc(85) int local85 = 0; local85 < local78.length; local85++) {
				for (@Pc(91) int local91 = 0; local91 < local53.length; local91++) {
					@Pc(129) String local129 = local53[local91] + local78[local85] + "/" + (arg0 == null ? "" : arg0 + "/") + arg1;
					@Pc(131) RandomAccessFile local131 = null;
					try {
						@Pc(136) File local136 = new File(local129);
						if (local80 != 0 || local136.exists()) {
							@Pc(148) String local148 = local53[local91];
							if (local80 != 1 || local148.length() <= 0 || (new File(local148)).exists()) {
								(new File(local53[local91] + local78[local85])).mkdir();
								if (arg0 != null) {
									(new File(local53[local91] + local78[local85] + "/" + arg0)).mkdir();
								}
								local131 = new RandomAccessFile(local136, "rw");
								@Pc(214) int local214 = local131.read();
								local131.seek(0L);
								local131.write(local214);
								local131.seek(0L);
								local131.close();
								aHashtable9.put(arg1, local136);
								return local136;
							}
						}
					} catch (@Pc(233) Exception local233) {
						try {
							if (local131 != null) {
								local131.close();
							}
						} catch (@Pc(241) Exception local241) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "loader!fda", name = "a", descriptor = "(ZILjava/lang/String;)V")
	public static void method8415(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		aString118 = arg1;
		anInt10302 = arg0;
		try {
			aString119 = System.getProperty("user.home");
			if (aString119 != null) {
				aString119 = aString119 + "/";
			}
		} catch (@Pc(21) Exception local21) {
		}
		aBoolean728 = true;
		if (aString119 == null) {
			aString119 = "~/";
		}
	}

	@OriginalMember(owner = "loader!fda", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/io/File;")
	public static File method8416(@OriginalArg(0) String arg0) {
		return method8414(aString118, arg0, anInt10302);
	}
}
