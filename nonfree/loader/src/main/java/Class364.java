import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!av")
public final class Class364 {

	@OriginalMember(owner = "loader!av", name = "c", descriptor = "I")
	private static int anInt9845;

	@OriginalMember(owner = "loader!av", name = "a", descriptor = "Ljava/lang/String;")
	private static String aString101;

	@OriginalMember(owner = "loader!av", name = "d", descriptor = "Ljava/lang/String;")
	private static String aString102;

	@OriginalMember(owner = "loader!av", name = "e", descriptor = "Z")
	private static boolean aBoolean698 = false;

	@OriginalMember(owner = "loader!av", name = "b", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable8 = new Hashtable(16);

	@OriginalMember(owner = "loader!av", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;B)Ljava/io/File;")
	private static File method8052(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		if (!aBoolean698) {
			throw new RuntimeException("");
		}
		@Pc(11) File local11 = (File) aHashtable8.get(arg2);
		if (local11 != null) {
			return local11;
		}
		@Pc(60) String[] local60 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString102, "/tmp/", "" };
		@Pc(85) String[] local85 = new String[] { ".jagex_cache_" + arg1, ".file_store_" + arg1 };
		for (@Pc(87) int local87 = 0; local87 < 2; local87++) {
			for (@Pc(94) int local94 = 0; local94 < local85.length; local94++) {
				for (@Pc(100) int local100 = 0; local100 < local60.length; local100++) {
					@Pc(134) String local134 = local60[local100] + local85[local94] + "/" + (arg0 == null ? "" : arg0 + "/") + arg2;
					@Pc(136) RandomAccessFile local136 = null;
					try {
						@Pc(141) File local141 = new File(local134);
						if (local87 != 0 || local141.exists()) {
							@Pc(152) String local152 = local60[local100];
							if (local87 != 1 || local152.length() <= 0 || (new File(local152)).exists()) {
								(new File(local60[local100] + local85[local94])).mkdir();
								if (arg0 != null) {
									(new File(local60[local100] + local85[local94] + "/" + arg0)).mkdir();
								}
								local136 = new RandomAccessFile(local141, "rw");
								@Pc(218) int local218 = local136.read();
								local136.seek(0L);
								local136.write(local218);
								local136.seek(0L);
								local136.close();
								aHashtable8.put(arg2, local141);
								return local141;
							}
						}
					} catch (@Pc(237) Exception local237) {
						try {
							if (local136 != null) {
								local136.close();
							}
						} catch (@Pc(246) Exception local246) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "loader!av", name = "a", descriptor = "(ILjava/lang/String;I)V")
	public static void method8053(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		anInt9845 = arg0;
		aString101 = arg1;
		try {
			aString102 = System.getProperty("user.home");
			if (aString102 != null) {
				aString102 = aString102 + "/";
			}
		} catch (@Pc(28) Exception local28) {
		}
		if (aString102 == null) {
			aString102 = "~/";
		}
		aBoolean698 = true;
	}

	@OriginalMember(owner = "loader!av", name = "a", descriptor = "(BLjava/lang/String;)Ljava/io/File;")
	public static File method8054(@OriginalArg(1) String arg0) {
		return method8052(aString101, anInt9845, arg0);
	}
}
