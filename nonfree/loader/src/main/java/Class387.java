import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!ad")
public final class Class387 {

	@OriginalMember(owner = "loader!ad", name = "e", descriptor = "I")
	private static int anInt10511;

	@OriginalMember(owner = "loader!ad", name = "b", descriptor = "Ljava/lang/String;")
	private static String aString157;

	@OriginalMember(owner = "loader!ad", name = "a", descriptor = "Ljava/lang/String;")
	private static String aString158;

	@OriginalMember(owner = "loader!ad", name = "d", descriptor = "Z")
	private static boolean aBoolean846 = false;

	@OriginalMember(owner = "loader!ad", name = "c", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable8 = new Hashtable(16);

	@OriginalMember(owner = "loader!ad", name = "a", descriptor = "(ILjava/lang/String;I)V")
	public static void method8919(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		anInt10511 = arg0;
		aString157 = arg1;
		try {
			aString158 = System.getProperty("user.home");
			if (aString158 != null) {
				aString158 = aString158 + "/";
			}
		} catch (@Pc(27) Exception local27) {
		}
		if (aString158 == null) {
			aString158 = "~/";
		}
		aBoolean846 = true;
	}

	@OriginalMember(owner = "loader!ad", name = "a", descriptor = "(ILjava/lang/String;)Ljava/io/File;")
	public static File method8920(@OriginalArg(1) String arg0) {
		return method8921(anInt10511, aString157, arg0);
	}

	@OriginalMember(owner = "loader!ad", name = "a", descriptor = "(IBLjava/lang/String;Ljava/lang/String;)Ljava/io/File;")
	private static File method8921(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		if (!aBoolean846) {
			throw new RuntimeException("");
		}
		@Pc(20) File local20 = (File) aHashtable8.get(arg2);
		if (local20 != null) {
			return local20;
		}
		@Pc(60) String[] local60 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString158, "/tmp/", "" };
		@Pc(85) String[] local85 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
		for (@Pc(87) int local87 = 0; local87 < 2; local87++) {
			for (@Pc(92) int local92 = 0; local92 < local85.length; local92++) {
				for (@Pc(98) int local98 = 0; local98 < local60.length; local98++) {
					@Pc(136) String local136 = local60[local98] + local85[local92] + "/" + (arg1 == null ? "" : arg1 + "/") + arg2;
					@Pc(138) RandomAccessFile local138 = null;
					try {
						@Pc(143) File local143 = new File(local136);
						if (local87 != 0 || local143.exists()) {
							@Pc(157) String local157 = local60[local98];
							if (local87 != 1 || local157.length() <= 0 || (new File(local157)).exists()) {
								(new File(local60[local98] + local85[local92])).mkdir();
								if (arg1 != null) {
									(new File(local60[local98] + local85[local92] + "/" + arg1)).mkdir();
								}
								local138 = new RandomAccessFile(local143, "rw");
								@Pc(222) int local222 = local138.read();
								local138.seek(0L);
								local138.write(local222);
								local138.seek(0L);
								local138.close();
								aHashtable8.put(arg2, local143);
								return local143;
							}
						}
					} catch (@Pc(241) Exception local241) {
						try {
							if (local138 != null) {
								local138.close();
							}
						} catch (@Pc(250) Exception local250) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}
}
