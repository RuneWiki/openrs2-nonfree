package app;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Enumeration;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("jagexappletviewer!app/m")
public final class Class14 {

	@OriginalMember(owner = "jagexappletviewer!app/m", name = "a", descriptor = "Ljava/util/Hashtable;")
	private static Hashtable aHashtable8 = new Hashtable();

	@OriginalMember(owner = "jagexappletviewer!app/m", name = "b", descriptor = "Ljava/io/File;")
	private static File aFile2 = new File(new File(System.getProperty("user.home")), "jagexappletviewer.preferences");

	@OriginalMember(owner = "jagexappletviewer!app/m", name = "c", descriptor = "Z")
	public static boolean aBoolean7;

	@OriginalMember(owner = "jagexappletviewer!app/m", name = "a", descriptor = "(I)V")
	static final void method32(@OriginalArg(0) int arg0) {
		if (arg0 != -6979) {
			aFile2 = null;
		}
		@Pc(11) BufferedReader local11 = null;
		try {
			local11 = new BufferedReader(new FileReader(aFile2));
			while (local11.ready()) {
				@Pc(25) String local25 = local11.readLine();
				@Pc(29) int local29 = local25.indexOf("=");
				if (local29 >= 0) {
					aHashtable8.put(local25.substring(0, local29), local25.substring(local29 + 1));
				}
			}
		} catch (@Pc(62) IOException local62) {
		} finally {
			if (local11 != null) {
				try {
					local11.close();
				} catch (@Pc(80) IOException local80) {
				}
			}
		}
	}

	@OriginalMember(owner = "jagexappletviewer!app/m", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	static final String method33(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(7) int local7 = -53 % ((4 - arg0) / 41);
		return (String) aHashtable8.get(arg1);
	}

	@OriginalMember(owner = "jagexappletviewer!app/m", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)V")
	public static final void method34(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		aHashtable8.put(arg0, arg2);
		if (arg1 != 23853) {
			method34(null, -103, null);
		}
	}

	@OriginalMember(owner = "jagexappletviewer!app/m", name = "b", descriptor = "(I)V")
	public static final void method35(@OriginalArg(0) int arg0) {
		@Pc(3) PrintStream local3 = null;
		try {
			local3 = new PrintStream(new FileOutputStream(aFile2));
			@Pc(14) Enumeration local14 = aHashtable8.keys();
			if (arg0 != 0) {
				aFile2 = null;
			}
			while (local14.hasMoreElements()) {
				@Pc(28) String local28 = (String) local14.nextElement();
				@Pc(33) String local33 = (String) aHashtable8.get(local28);
				local3.println(local28 + "=" + local33);
			}
		} catch (@Pc(55) IOException local55) {
			local55.printStackTrace();
		} finally {
			if (local3 != null) {
				local3.close();
			}
		}
	}
}
