import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!eja")
public final class Class403 {

	@OriginalMember(owner = "loader!eja", name = "b", descriptor = "I")
	private static int anInt10549;

	@OriginalMember(owner = "loader!eja", name = "c", descriptor = "Ljava/lang/String;")
	private static String aString142;

	@OriginalMember(owner = "loader!eja", name = "e", descriptor = "Ljava/lang/String;")
	private static String aString143;

	@OriginalMember(owner = "loader!eja", name = "d", descriptor = "Z")
	private static boolean aBoolean783 = false;

	@OriginalMember(owner = "loader!eja", name = "a", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable9 = new Hashtable(16);

	@OriginalMember(owner = "loader!eja", name = "a", descriptor = "(BILjava/lang/String;Ljava/lang/String;)Ljava/io/File;")
	private static File method9055(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		if (!aBoolean783) {
			throw new RuntimeException("");
		}
		@Pc(12) File local12 = (File) aHashtable9.get(arg2);
		if (local12 != null) {
			return local12;
		}
		@Pc(52) String[] local52 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString142, "/tmp/", "" };
		@Pc(77) String[] local77 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
		for (@Pc(79) int local79 = 0; local79 < 2; local79++) {
			for (@Pc(86) int local86 = 0; local86 < local77.length; local86++) {
				for (@Pc(92) int local92 = 0; local92 < local52.length; local92++) {
					@Pc(126) String local126 = local52[local92] + local77[local86] + "/" + (arg1 == null ? "" : arg1 + "/") + arg2;
					@Pc(128) RandomAccessFile local128 = null;
					try {
						@Pc(133) File local133 = new File(local126);
						if (local79 != 0 || local133.exists()) {
							@Pc(144) String local144 = local52[local92];
							if (local79 != 1 || local144.length() <= 0 || (new File(local144)).exists()) {
								(new File(local52[local92] + local77[local86])).mkdir();
								if (arg1 != null) {
									(new File(local52[local92] + local77[local86] + "/" + arg1)).mkdir();
								}
								local128 = new RandomAccessFile(local133, "rw");
								@Pc(212) int local212 = local128.read();
								local128.seek(0L);
								local128.write(local212);
								local128.seek(0L);
								local128.close();
								aHashtable9.put(arg2, local133);
								return local133;
							}
						}
					} catch (@Pc(231) Exception local231) {
						try {
							if (local128 != null) {
								local128.close();
							}
						} catch (@Pc(241) Exception local241) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "loader!eja", name = "a", descriptor = "(Ljava/lang/String;IB)V")
	public static void method9056(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		anInt10549 = arg1;
		aString143 = arg0;
		try {
			aString142 = System.getProperty("user.home");
			if (aString142 != null) {
				aString142 = aString142 + "/";
			}
		} catch (@Pc(25) Exception local25) {
		}
		aBoolean783 = true;
		if (aString142 == null) {
			aString142 = "~/";
		}
	}

	@OriginalMember(owner = "loader!eja", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/io/File;")
	public static File method9057(@OriginalArg(0) String arg0) {
		return method9055(anInt10549, aString143, arg0);
	}
}
