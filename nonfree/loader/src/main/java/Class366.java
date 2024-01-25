import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!gp")
public final class Class366 {

	@OriginalMember(owner = "loader!gp", name = "a", descriptor = "Ljava/lang/String;")
	private static String aString149;

	@OriginalMember(owner = "loader!gp", name = "b", descriptor = "I")
	private static int anInt10470;

	@OriginalMember(owner = "loader!gp", name = "d", descriptor = "Ljava/lang/String;")
	private static String aString150;

	@OriginalMember(owner = "loader!gp", name = "c", descriptor = "Z")
	private static boolean aBoolean856 = false;

	@OriginalMember(owner = "loader!gp", name = "e", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable9 = new Hashtable(16);

	@OriginalMember(owner = "loader!gp", name = "a", descriptor = "(BLjava/lang/String;)Ljava/io/File;")
	public static File method8456(@OriginalArg(1) String arg0) {
		return method8457(anInt10470, arg0, aString149);
	}

	@OriginalMember(owner = "loader!gp", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;)Ljava/io/File;")
	private static File method8457(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		if (!aBoolean856) {
			throw new RuntimeException("");
		}
		@Pc(12) File local12 = (File) aHashtable9.get(arg1);
		if (local12 != null) {
			return local12;
		}
		@Pc(53) String[] local53 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString150, "/tmp/", "" };
		@Pc(78) String[] local78 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
		for (@Pc(80) int local80 = 0; local80 < 2; local80++) {
			for (@Pc(85) int local85 = 0; local85 < local78.length; local85++) {
				for (@Pc(95) int local95 = 0; local95 < local53.length; local95++) {
					@Pc(129) String local129 = local53[local95] + local78[local85] + "/" + (arg2 == null ? "" : arg2 + "/") + arg1;
					@Pc(131) RandomAccessFile local131 = null;
					try {
						@Pc(136) File local136 = new File(local129);
						if (local80 != 0 || local136.exists()) {
							@Pc(147) String local147 = local53[local95];
							if (local80 != 1 || local147.length() <= 0 || (new File(local147)).exists()) {
								(new File(local53[local95] + local78[local85])).mkdir();
								if (arg2 != null) {
									(new File(local53[local95] + local78[local85] + "/" + arg2)).mkdir();
								}
								local131 = new RandomAccessFile(local136, "rw");
								@Pc(212) int local212 = local131.read();
								local131.seek(0L);
								local131.write(local212);
								local131.seek(0L);
								local131.close();
								aHashtable9.put(arg1, local136);
								return local136;
							}
						}
					} catch (@Pc(231) Exception local231) {
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

	@OriginalMember(owner = "loader!gp", name = "a", descriptor = "(Ljava/lang/String;IB)V")
	public static void method8458(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		aString149 = arg0;
		anInt10470 = arg1;
		try {
			aString150 = System.getProperty("user.home");
			if (aString150 != null) {
				aString150 = aString150 + "/";
			}
		} catch (@Pc(28) Exception local28) {
		}
		aBoolean856 = true;
		if (aString150 == null) {
			aString150 = "~/";
		}
	}
}
