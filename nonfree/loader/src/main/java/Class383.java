import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!pf")
public final class Class383 {

	@OriginalMember(owner = "loader!pf", name = "a", descriptor = "I")
	private static int anInt10721;

	@OriginalMember(owner = "loader!pf", name = "e", descriptor = "Ljava/lang/String;")
	private static String aString128;

	@OriginalMember(owner = "loader!pf", name = "d", descriptor = "Ljava/lang/String;")
	private static String aString129;

	@OriginalMember(owner = "loader!pf", name = "c", descriptor = "Z")
	private static boolean aBoolean771 = false;

	@OriginalMember(owner = "loader!pf", name = "b", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable9 = new Hashtable(16);

	@OriginalMember(owner = "loader!pf", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void method8669(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		anInt10721 = arg0;
		aString129 = arg1;
		try {
			aString128 = System.getProperty("user.home");
			if (aString128 != null) {
				aString128 = aString128 + "/";
			}
		} catch (@Pc(20) Exception local20) {
		}
		aBoolean771 = true;
		if (aString128 == null) {
			aString128 = "~/";
		}
	}

	@OriginalMember(owner = "loader!pf", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/io/File;")
	public static File method8670(@OriginalArg(0) String arg0) {
		return method8671(aString129, arg0, anInt10721);
	}

	@OriginalMember(owner = "loader!pf", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;I)Ljava/io/File;")
	private static File method8671(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		if (!aBoolean771) {
			throw new RuntimeException("");
		}
		@Pc(11) File local11 = (File) aHashtable9.get(arg1);
		if (local11 != null) {
			return local11;
		}
		@Pc(59) String[] local59 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString128, "/tmp/", "" };
		@Pc(84) String[] local84 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
		for (@Pc(86) int local86 = 0; local86 < 2; local86++) {
			for (@Pc(93) int local93 = 0; local93 < local84.length; local93++) {
				for (@Pc(103) int local103 = 0; local103 < local59.length; local103++) {
					@Pc(138) String local138 = local59[local103] + local84[local93] + "/" + (arg0 == null ? "" : arg0 + "/") + arg1;
					@Pc(140) RandomAccessFile local140 = null;
					try {
						@Pc(145) File local145 = new File(local138);
						if (local86 != 0 || local145.exists()) {
							@Pc(158) String local158 = local59[local103];
							if (local86 != 1 || local158.length() <= 0 || (new File(local158)).exists()) {
								(new File(local59[local103] + local84[local93])).mkdir();
								if (arg0 != null) {
									(new File(local59[local103] + local84[local93] + "/" + arg0)).mkdir();
								}
								local140 = new RandomAccessFile(local145, "rw");
								@Pc(227) int local227 = local140.read();
								local140.seek(0L);
								local140.write(local227);
								local140.seek(0L);
								local140.close();
								aHashtable9.put(arg1, local145);
								return local145;
							}
						}
					} catch (@Pc(246) Exception local246) {
						try {
							if (local140 != null) {
								local140.close();
							}
						} catch (@Pc(254) Exception local254) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}
}
