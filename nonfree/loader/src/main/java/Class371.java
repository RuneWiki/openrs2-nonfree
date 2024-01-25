import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!iba")
public final class Class371 {

	@OriginalMember(owner = "loader!iba", name = "a", descriptor = "Ljava/lang/String;")
	private static String aString120;

	@OriginalMember(owner = "loader!iba", name = "c", descriptor = "Ljava/lang/String;")
	private static String aString121;

	@OriginalMember(owner = "loader!iba", name = "d", descriptor = "I")
	private static int anInt9829;

	@OriginalMember(owner = "loader!iba", name = "e", descriptor = "Z")
	private static boolean aBoolean721 = false;

	@OriginalMember(owner = "loader!iba", name = "b", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable9 = new Hashtable(16);

	@OriginalMember(owner = "loader!iba", name = "a", descriptor = "(ILjava/lang/String;I)V")
	public static void method8005(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		anInt9829 = arg1;
		aString120 = arg0;
		try {
			aString121 = System.getProperty("user.home");
			if (aString121 != null) {
				aString121 = aString121 + "/";
			}
		} catch (@Pc(19) Exception local19) {
		}
		aBoolean721 = true;
		if (aString121 == null) {
			aString121 = "~/";
		}
	}

	@OriginalMember(owner = "loader!iba", name = "a", descriptor = "(ILjava/lang/String;BLjava/lang/String;)Ljava/io/File;")
	private static File method8006(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) String arg2) {
		if (!aBoolean721) {
			throw new RuntimeException("");
		}
		@Pc(12) File local12 = (File) aHashtable9.get(arg2);
		if (local12 != null) {
			return local12;
		}
		@Pc(60) String[] local60 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString121, "/tmp/", "" };
		@Pc(85) String[] local85 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
		for (@Pc(87) int local87 = 0; local87 < 2; local87++) {
			for (@Pc(94) int local94 = 0; local94 < local85.length; local94++) {
				for (@Pc(100) int local100 = 0; local100 < local60.length; local100++) {
					@Pc(134) String local134 = local60[local100] + local85[local94] + "/" + (arg1 == null ? "" : arg1 + "/") + arg2;
					@Pc(136) RandomAccessFile local136 = null;
					try {
						@Pc(141) File local141 = new File(local134);
						if (local87 != 0 || local141.exists()) {
							@Pc(155) String local155 = local60[local100];
							if (local87 != 1 || local155.length() <= 0 || (new File(local155)).exists()) {
								(new File(local60[local100] + local85[local94])).mkdir();
								if (arg1 != null) {
									(new File(local60[local100] + local85[local94] + "/" + arg1)).mkdir();
								}
								local136 = new RandomAccessFile(local141, "rw");
								@Pc(221) int local221 = local136.read();
								local136.seek(0L);
								local136.write(local221);
								local136.seek(0L);
								local136.close();
								aHashtable9.put(arg2, local141);
								return local141;
							}
						}
					} catch (@Pc(240) Exception local240) {
						try {
							if (local136 != null) {
								local136.close();
							}
						} catch (@Pc(250) Exception local250) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "loader!iba", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/io/File;")
	public static File method8007(@OriginalArg(0) String arg0) {
		return method8006(anInt9829, aString120, arg0);
	}
}
