import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!ow")
public final class Class371 {

	@OriginalMember(owner = "loader!ow", name = "d", descriptor = "Ljava/lang/String;")
	private static String aString284;

	@OriginalMember(owner = "loader!ow", name = "c", descriptor = "Ljava/lang/String;")
	private static String aString285;

	@OriginalMember(owner = "loader!ow", name = "e", descriptor = "I")
	private static int anInt10355;

	@OriginalMember(owner = "loader!ow", name = "b", descriptor = "Z")
	private static boolean aBoolean734 = false;

	@OriginalMember(owner = "loader!ow", name = "a", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable9 = new Hashtable(16);

	@OriginalMember(owner = "loader!ow", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/io/File;")
	public static File method8210(@OriginalArg(0) String arg0) {
		return method8211(arg0, aString285, anInt10355);
	}

	@OriginalMember(owner = "loader!ow", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IB)Ljava/io/File;")
	private static File method8211(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		if (!aBoolean734) {
			throw new RuntimeException("");
		}
		@Pc(12) File local12 = (File) aHashtable9.get(arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(63) String[] local63 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString284, "/tmp/", "" };
		@Pc(88) String[] local88 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
		for (@Pc(90) int local90 = 0; local90 < 2; local90++) {
			for (@Pc(95) int local95 = 0; local95 < local88.length; local95++) {
				for (@Pc(105) int local105 = 0; local105 < local63.length; local105++) {
					@Pc(143) String local143 = local63[local105] + local88[local95] + "/" + (arg1 == null ? "" : arg1 + "/") + arg0;
					@Pc(145) RandomAccessFile local145 = null;
					try {
						@Pc(150) File local150 = new File(local143);
						if (local90 != 0 || local150.exists()) {
							@Pc(164) String local164 = local63[local105];
							if (local90 != 1 || local164.length() <= 0 || (new File(local164)).exists()) {
								(new File(local63[local105] + local88[local95])).mkdir();
								if (arg1 != null) {
									(new File(local63[local105] + local88[local95] + "/" + arg1)).mkdir();
								}
								local145 = new RandomAccessFile(local150, "rw");
								@Pc(230) int local230 = local145.read();
								local145.seek(0L);
								local145.write(local230);
								local145.seek(0L);
								local145.close();
								aHashtable9.put(arg0, local150);
								return local150;
							}
						}
					} catch (@Pc(249) Exception local249) {
						try {
							if (local145 != null) {
								local145.close();
							}
						} catch (@Pc(257) Exception local257) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "loader!ow", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void method8212(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		anInt10355 = arg0;
		aString285 = arg1;
		try {
			aString284 = System.getProperty("user.home");
			if (aString284 != null) {
				aString284 = aString284 + "/";
			}
		} catch (@Pc(24) Exception local24) {
		}
		aBoolean734 = true;
		if (aString284 == null) {
			aString284 = "~/";
		}
	}
}
