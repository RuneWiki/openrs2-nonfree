import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!qf")
public final class Class371 {

	@OriginalMember(owner = "loader!qf", name = "c", descriptor = "I")
	private static int anInt9786;

	@OriginalMember(owner = "loader!qf", name = "d", descriptor = "Ljava/lang/String;")
	private static String aString117;

	@OriginalMember(owner = "loader!qf", name = "e", descriptor = "Ljava/lang/String;")
	private static String aString118;

	@OriginalMember(owner = "loader!qf", name = "a", descriptor = "Z")
	private static boolean aBoolean775 = false;

	@OriginalMember(owner = "loader!qf", name = "b", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable11 = new Hashtable(16);

	@OriginalMember(owner = "loader!qf", name = "a", descriptor = "(ILjava/lang/String;)Ljava/io/File;")
	public static File method7980(@OriginalArg(1) String arg0) {
		return method7981(arg0, anInt9786, aString118);
	}

	@OriginalMember(owner = "loader!qf", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;I)Ljava/io/File;")
	private static File method7981(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		if (!aBoolean775) {
			throw new RuntimeException("");
		}
		@Pc(12) File local12 = (File) aHashtable11.get(arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(52) String[] local52 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString117, "/tmp/", "" };
		@Pc(83) String[] local83 = new String[] { ".jagex_cache_" + arg1, ".file_store_" + arg1 };
		for (@Pc(85) int local85 = 0; local85 < 2; local85++) {
			for (@Pc(90) int local90 = 0; local90 < local83.length; local90++) {
				for (@Pc(100) int local100 = 0; local100 < local52.length; local100++) {
					@Pc(135) String local135 = local52[local100] + local83[local90] + "/" + (arg2 == null ? "" : arg2 + "/") + arg0;
					@Pc(137) RandomAccessFile local137 = null;
					try {
						@Pc(142) File local142 = new File(local135);
						if (local85 != 0 || local142.exists()) {
							@Pc(155) String local155 = local52[local100];
							if (local85 != 1 || local155.length() <= 0 || (new File(local155)).exists()) {
								(new File(local52[local100] + local83[local90])).mkdir();
								if (arg2 != null) {
									(new File(local52[local100] + local83[local90] + "/" + arg2)).mkdir();
								}
								local137 = new RandomAccessFile(local142, "rw");
								@Pc(220) int local220 = local137.read();
								local137.seek(0L);
								local137.write(local220);
								local137.seek(0L);
								local137.close();
								aHashtable11.put(arg0, local142);
								return local142;
							}
						}
					} catch (@Pc(239) Exception local239) {
						try {
							if (local137 != null) {
								local137.close();
							}
						} catch (@Pc(249) Exception local249) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "loader!qf", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void method7982(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		anInt9786 = arg0;
		aString118 = arg1;
		try {
			aString117 = System.getProperty("user.home");
			if (aString117 != null) {
				aString117 = aString117 + "/";
			}
		} catch (@Pc(20) Exception local20) {
		}
		if (aString117 == null) {
			aString117 = "~/";
		}
		aBoolean775 = true;
	}
}
