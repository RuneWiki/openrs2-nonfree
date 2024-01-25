import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!th")
public final class Class386 {

	@OriginalMember(owner = "loader!th", name = "e", descriptor = "Ljava/lang/String;")
	private static String aString132;

	@OriginalMember(owner = "loader!th", name = "a", descriptor = "I")
	private static int anInt10795;

	@OriginalMember(owner = "loader!th", name = "d", descriptor = "Ljava/lang/String;")
	private static String aString133;

	@OriginalMember(owner = "loader!th", name = "c", descriptor = "Z")
	private static boolean aBoolean858 = false;

	@OriginalMember(owner = "loader!th", name = "b", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable9 = new Hashtable(16);

	@OriginalMember(owner = "loader!th", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/io/File;")
	public static File method8822(@OriginalArg(0) String arg0) {
		return method8823(anInt10795, arg0, aString133);
	}

	@OriginalMember(owner = "loader!th", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;)Ljava/io/File;")
	private static File method8823(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		if (!aBoolean858) {
			throw new RuntimeException("");
		}
		@Pc(12) File local12 = (File) aHashtable9.get(arg1);
		if (local12 != null) {
			return local12;
		}
		@Pc(52) String[] local52 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString132, "/tmp/", "" };
		@Pc(77) String[] local77 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
		for (@Pc(79) int local79 = 0; local79 < 2; local79++) {
			for (@Pc(84) int local84 = 0; local84 < local77.length; local84++) {
				for (@Pc(90) int local90 = 0; local90 < local52.length; local90++) {
					@Pc(125) String local125 = local52[local90] + local77[local84] + "/" + (arg2 == null ? "" : arg2 + "/") + arg1;
					@Pc(127) RandomAccessFile local127 = null;
					try {
						@Pc(132) File local132 = new File(local125);
						if (local79 != 0 || local132.exists()) {
							@Pc(146) String local146 = local52[local90];
							if (local79 != 1 || local146.length() <= 0 || (new File(local146)).exists()) {
								(new File(local52[local90] + local77[local84])).mkdir();
								if (arg2 != null) {
									(new File(local52[local90] + local77[local84] + "/" + arg2)).mkdir();
								}
								local127 = new RandomAccessFile(local132, "rw");
								@Pc(212) int local212 = local127.read();
								local127.seek(0L);
								local127.write(local212);
								local127.seek(0L);
								local127.close();
								aHashtable9.put(arg1, local132);
								return local132;
							}
						}
					} catch (@Pc(231) Exception local231) {
						try {
							if (local127 != null) {
								local127.close();
							}
						} catch (@Pc(239) Exception local239) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "loader!th", name = "a", descriptor = "(ZILjava/lang/String;)V")
	public static void method8824(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		aString133 = arg1;
		anInt10795 = arg0;
		try {
			aString132 = System.getProperty("user.home");
			if (aString132 != null) {
				aString132 = aString132 + "/";
			}
		} catch (@Pc(20) Exception local20) {
		}
		if (aString132 == null) {
			aString132 = "~/";
		}
		aBoolean858 = true;
	}
}
