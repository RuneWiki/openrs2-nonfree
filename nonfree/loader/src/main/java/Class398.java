import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!ov")
public final class Class398 {

	@OriginalMember(owner = "loader!ov", name = "a", descriptor = "Ljava/lang/String;")
	private static String aString150;

	@OriginalMember(owner = "loader!ov", name = "b", descriptor = "Ljava/lang/String;")
	private static String aString151;

	@OriginalMember(owner = "loader!ov", name = "c", descriptor = "I")
	private static int anInt11466;

	@OriginalMember(owner = "loader!ov", name = "d", descriptor = "Z")
	private static boolean aBoolean817 = false;

	@OriginalMember(owner = "loader!ov", name = "e", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable9 = new Hashtable(16);

	@OriginalMember(owner = "loader!ov", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;)Ljava/io/File;")
	private static File method9853(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		if (!aBoolean817) {
			throw new RuntimeException("");
		}
		@Pc(12) File local12 = (File) aHashtable9.get(arg2);
		if (local12 != null) {
			return local12;
		}
		@Pc(51) String[] local51 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString150, "/tmp/", "" };
		@Pc(76) String[] local76 = new String[] { ".jagex_cache_" + arg1, ".file_store_" + arg1 };
		for (@Pc(78) int local78 = 0; local78 < 2; local78++) {
			for (@Pc(85) int local85 = 0; local85 < local76.length; local85++) {
				for (@Pc(91) int local91 = 0; local91 < local51.length; local91++) {
					@Pc(129) String local129 = local51[local91] + local76[local85] + "/" + (arg0 == null ? "" : arg0 + "/") + arg2;
					@Pc(131) RandomAccessFile local131 = null;
					try {
						@Pc(136) File local136 = new File(local129);
						if (local78 != 0 || local136.exists()) {
							@Pc(148) String local148 = local51[local91];
							if (local78 != 1 || local148.length() <= 0 || (new File(local148)).exists()) {
								(new File(local51[local91] + local76[local85])).mkdir();
								if (arg0 != null) {
									(new File(local51[local91] + local76[local85] + "/" + arg0)).mkdir();
								}
								local131 = new RandomAccessFile(local136, "rw");
								@Pc(212) int local212 = local131.read();
								local131.seek(0L);
								local131.write(local212);
								local131.seek(0L);
								local131.close();
								aHashtable9.put(arg2, local136);
								return local136;
							}
						}
					} catch (@Pc(231) Exception local231) {
						try {
							if (local131 != null) {
								local131.close();
							}
						} catch (@Pc(239) Exception local239) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "loader!ov", name = "a", descriptor = "(BLjava/lang/String;I)V")
	public static void method9854(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		aString151 = arg0;
		anInt11466 = arg1;
		try {
			aString150 = System.getProperty("user.home");
			if (aString150 != null) {
				aString150 = aString150 + "/";
			}
		} catch (@Pc(21) Exception local21) {
		}
		aBoolean817 = true;
		if (aString150 == null) {
			aString150 = "~/";
		}
	}

	@OriginalMember(owner = "loader!ov", name = "a", descriptor = "(ILjava/lang/String;)Ljava/io/File;")
	public static File method9855(@OriginalArg(1) String arg0) {
		return method9853(aString151, anInt11466, arg0);
	}
}
