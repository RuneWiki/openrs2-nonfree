package com.jagex;

import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qs")
public class Class417 implements Interface42 {

	@OriginalMember(owner = "client!qs", name = "g", descriptor = "Ljava/util/Hashtable;")
	Hashtable aHashtable10 = new Hashtable();

	@OriginalMember(owner = "client!qs", name = "l", descriptor = "Ljava/util/Hashtable;")
	Hashtable aHashtable11 = new Hashtable();

	@OriginalMember(owner = "client!qs", name = "p", descriptor = "Lclient!ny;")
	final Class359 aClass359_70;

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "Ljava/lang/String;")
	final String aString219;

	@OriginalMember(owner = "client!qs", name = "<init>", descriptor = "(Lclient!ny;)V", line = 17)
	public Class417(@OriginalArg(0) Class359 arg0) {
		this.aClass359_70 = arg0;
		@Pc(16) String local16 = "";
		if (Class377.aString211.startsWith("win") || Class377.aString211.startsWith("windows 7")) {
			local16 = local16 + "windows/";
		} else if (Class377.aString211.startsWith("linux")) {
			local16 = local16 + "linux/";
		} else if (Class377.aString211.startsWith("mac")) {
			local16 = local16 + "macos/";
		}
		if (Class377.aString212.startsWith("amd64") || Class377.aString212.startsWith("x86_64")) {
			local16 = local16 + "x86_64/";
		} else if (Class377.aString212.startsWith("i386") || Class377.aString212.startsWith("i486") || Class377.aString212.startsWith("i586") || Class377.aString212.startsWith("x86")) {
			local16 = local16 + "x86/";
		} else if (Class377.aString212.startsWith("ppc")) {
			local16 = local16 + "ppc/";
		} else {
			local16 = local16 + "universal/";
		}
		this.aString219 = local16;
	}

	@OriginalMember(owner = "client!qs", name = "d", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 33)
	static String method27805(@OriginalArg(0) String arg0) {
		if (Class377.aString211.startsWith("win")) {
			return arg0 + ".dll";
		} else if (Class377.aString211.startsWith("linux")) {
			return "lib" + arg0 + ".so";
		} else if (Class377.aString211.startsWith("mac")) {
			return "lib" + arg0 + ".dylib";
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!qs", name = "q", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 33)
	static String method27806(@OriginalArg(0) String arg0) {
		if (Class377.aString211.startsWith("win")) {
			return arg0 + ".dll";
		} else if (Class377.aString211.startsWith("linux")) {
			return "lib" + arg0 + ".so";
		} else if (Class377.aString211.startsWith("mac")) {
			return "lib" + arg0 + ".dylib";
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!qs", name = "m", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 33)
	static String method27807(@OriginalArg(0) String arg0) {
		if (Class377.aString211.startsWith("win")) {
			return arg0 + ".dll";
		} else if (Class377.aString211.startsWith("linux")) {
			return "lib" + arg0 + ".so";
		} else if (Class377.aString211.startsWith("mac")) {
			return "lib" + arg0 + ".dylib";
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!qs", name = "v", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 33)
	static String method27808(@OriginalArg(0) String arg0) {
		if (Class377.aString211.startsWith("win")) {
			return arg0 + ".dll";
		} else if (Class377.aString211.startsWith("linux")) {
			return "lib" + arg0 + ".so";
		} else if (Class377.aString211.startsWith("mac")) {
			return "lib" + arg0 + ".dylib";
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!qs", name = "j", descriptor = "(Ljava/lang/String;I)I", line = 40)
	public int method27800(@OriginalArg(0) String arg0) throws Exception_Sub3 {
		if (this.aHashtable10.containsKey(arg0)) {
			return 100;
		}
		@Pc(10) String local10 = Class44_Sub3.method9220(arg0);
		if (local10 == null) {
			throw new Exception_Sub3(1, arg0);
		}
		@Pc(21) String local21 = null;
		if (local21 == null) {
			local21 = this.aString219 + local10;
			if (!this.aClass359_70.method26690(local21, "")) {
				throw new Exception_Sub3(2, arg0);
			}
		}
		if (!this.aClass359_70.method26694(local21)) {
			return this.aClass359_70.method26689(local21);
		}
		@Pc(66) byte[] local66 = this.aClass359_70.method26691(local21, "");
		if (local66 == null) {
			throw new Exception_Sub3(3, arg0);
		}
		@Pc(80) File local80;
		try {
			local80 = Class370.method27082(local10);
		} catch (@Pc(82) RuntimeException local82) {
			throw new Exception_Sub3(4, arg0, local82);
		}
		if (local80 == null) {
			throw new Exception_Sub3(5, arg0);
		}
		@Pc(100) boolean local100 = true;
		@Pc(104) byte[] local104 = Class106.method21919(local80);
		if (local104 != null && local66.length == local104.length) {
			for (@Pc(113) int local113 = 0; local113 < local104.length; local113++) {
				if (local66[local113] != local104[local113]) {
					local100 = false;
					break;
				}
			}
		} else {
			local100 = false;
		}
		if (!local100) {
			try {
				@Pc(139) FileOutputStream local139 = new FileOutputStream(local80);
				local139.write(local66, 0, local66.length);
				local139.close();
			} catch (@Pc(149) Throwable local149) {
				throw new Exception_Sub3(6, arg0, local149);
			}
		}
		this.method27818(arg0, local80);
		return 100;
	}

	@OriginalMember(owner = "client!qs", name = "t", descriptor = "(Ljava/lang/String;)I", line = 40)
	public int method27801(@OriginalArg(0) String arg0) throws Exception_Sub3 {
		if (this.aHashtable10.containsKey(arg0)) {
			return 100;
		}
		@Pc(10) String local10 = Class44_Sub3.method9220(arg0);
		if (local10 == null) {
			throw new Exception_Sub3(1, arg0);
		}
		@Pc(21) String local21 = null;
		if (local21 == null) {
			local21 = this.aString219 + local10;
			if (!this.aClass359_70.method26690(local21, "")) {
				throw new Exception_Sub3(2, arg0);
			}
		}
		if (!this.aClass359_70.method26694(local21)) {
			return this.aClass359_70.method26689(local21);
		}
		@Pc(66) byte[] local66 = this.aClass359_70.method26691(local21, "");
		if (local66 == null) {
			throw new Exception_Sub3(3, arg0);
		}
		@Pc(80) File local80;
		try {
			local80 = Class370.method27082(local10);
		} catch (@Pc(82) RuntimeException local82) {
			throw new Exception_Sub3(4, arg0, local82);
		}
		if (local80 == null) {
			throw new Exception_Sub3(5, arg0);
		}
		@Pc(100) boolean local100 = true;
		@Pc(104) byte[] local104 = Class106.method21919(local80);
		if (local104 != null && local66.length == local104.length) {
			for (@Pc(113) int local113 = 0; local113 < local104.length; local113++) {
				if (local66[local113] != local104[local113]) {
					local100 = false;
					break;
				}
			}
		} else {
			local100 = false;
		}
		if (!local100) {
			try {
				@Pc(139) FileOutputStream local139 = new FileOutputStream(local80);
				local139.write(local66, 0, local66.length);
				local139.close();
			} catch (@Pc(149) Throwable local149) {
				throw new Exception_Sub3(6, arg0, local149);
			}
		}
		this.method27818(arg0, local80);
		return 100;
	}

	@OriginalMember(owner = "client!qs", name = "s", descriptor = "(B)V", line = 41)
	public static void method27820() {
		if (IcmpService_Sub1.anIcmpService_Sub1_1 == null) {
			return;
		}
		try {
			IcmpService_Sub1.anIcmpService_Sub1_1.quit();
		} catch (@Pc(7) Throwable local7) {
		}
		IcmpService_Sub1.anIcmpService_Sub1_1 = null;
	}

	@OriginalMember(owner = "client!qs", name = "w", descriptor = "(Ljava/lang/String;Ljava/io/File;)V", line = 93)
	void method27810(@OriginalArg(0) String arg0, @OriginalArg(1) File arg1) {
		this.aHashtable10.put(arg0, arg1);
	}

	@OriginalMember(owner = "client!qs", name = "o", descriptor = "(Ljava/lang/String;Ljava/io/File;)V", line = 93)
	void method27814(@OriginalArg(0) String arg0, @OriginalArg(1) File arg1) {
		this.aHashtable10.put(arg0, arg1);
	}

	@OriginalMember(owner = "client!qs", name = "n", descriptor = "(Ljava/lang/String;Ljava/io/File;I)V", line = 93)
	void method27818(@OriginalArg(0) String arg0, @OriginalArg(1) File arg1) {
		this.aHashtable10.put(arg0, arg1);
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(Ljava/lang/String;I)Z", line = 97)
	@Override
	public boolean method27790(@OriginalArg(0) String arg0) {
		return this.aHashtable10.containsKey(arg0);
	}

	@OriginalMember(owner = "client!qs", name = "x", descriptor = "(Ljava/lang/String;)Z", line = 97)
	@Override
	public boolean method27793(@OriginalArg(0) String arg0) {
		return this.aHashtable10.containsKey(arg0);
	}

	@OriginalMember(owner = "client!qs", name = "u", descriptor = "(Ljava/lang/String;)Z", line = 97)
	@Override
	public boolean method27796(@OriginalArg(0) String arg0) {
		return this.aHashtable10.containsKey(arg0);
	}

	@OriginalMember(owner = "client!qs", name = "y", descriptor = "(Ljava/lang/String;)Z", line = 97)
	@Override
	public boolean method27792(@OriginalArg(0) String arg0) {
		return this.aHashtable10.containsKey(arg0);
	}

	@OriginalMember(owner = "client!qs", name = "s", descriptor = "(Ljava/lang/String;)Z", line = 97)
	@Override
	public boolean method27795(@OriginalArg(0) String arg0) {
		return this.aHashtable10.containsKey(arg0);
	}

	@OriginalMember(owner = "client!qs", name = "e", descriptor = "(Ljava/lang/String;B)Z", line = 101)
	public boolean method27802(@OriginalArg(0) String arg0) {
		return this.aHashtable11.containsKey(arg0);
	}

	@OriginalMember(owner = "client!qs", name = "k", descriptor = "(Ljava/lang/String;)Z", line = 101)
	public boolean method27803(@OriginalArg(0) String arg0) {
		return this.aHashtable11.containsKey(arg0);
	}

	@OriginalMember(owner = "client!qs", name = "at", descriptor = "(Ljava/lang/String;)Z", line = 101)
	public boolean method27811(@OriginalArg(0) String arg0) {
		return this.aHashtable11.containsKey(arg0);
	}

	@OriginalMember(owner = "client!qs", name = "i", descriptor = "(Ljava/lang/String;)Z", line = 101)
	public boolean method27812(@OriginalArg(0) String arg0) {
		return this.aHashtable11.containsKey(arg0);
	}

	@OriginalMember(owner = "client!qs", name = "f", descriptor = "(Ljava/lang/String;)Z", line = 101)
	public boolean method27813(@OriginalArg(0) String arg0) {
		return this.aHashtable11.containsKey(arg0);
	}

	@OriginalMember(owner = "client!qs", name = "p", descriptor = "(Ljava/lang/String;B)V", line = 105)
	@Override
	public void method27797(@OriginalArg(0) String arg0) throws Exception_Sub6 {
		this.method27804(arg0, Class407.class);
	}

	@OriginalMember(owner = "client!qs", name = "l", descriptor = "(Ljava/lang/String;)V", line = 105)
	@Override
	public void method27791(@OriginalArg(0) String arg0) throws Exception_Sub6 {
		this.method27804(arg0, Class407.class);
	}

	@OriginalMember(owner = "client!qs", name = "h", descriptor = "(Ljava/lang/String;)V", line = 105)
	@Override
	public void method27794(@OriginalArg(0) String arg0) throws Exception_Sub6 {
		this.method27804(arg0, Class407.class);
	}

	@OriginalMember(owner = "client!qs", name = "r", descriptor = "(Ljava/lang/String;Ljava/lang/Class;S)V", line = 109)
	void method27804(@OriginalArg(0) String arg0, @OriginalArg(1) Class arg1) throws Exception_Sub6 {
		@Pc(5) Class local5 = (Class) this.aHashtable11.get(arg0);
		if (local5 != null && local5.getClassLoader() != arg1.getClassLoader()) {
			throw new Exception_Sub6(1, arg0);
		}
		@Pc(20) File local20 = null;
		if (local20 == null) {
			local20 = (File) this.aHashtable10.get(arg0);
		}
		if (local20 == null) {
			throw new Exception_Sub6(4, arg0);
		}
		try {
			local20 = new File(local20.getCanonicalPath());
			@Pc(40) Class local40 = Class.forName("java.lang.Runtime");
			@Pc(43) Class local43 = Class.forName("java.lang.reflect.AccessibleObject");
			@Pc(53) Method local53 = local43.getDeclaredMethod("setAccessible", Boolean.TYPE);
			@Pc(69) Method local69 = local40.getDeclaredMethod("load0", Class.forName("java.lang.Class"), Class.forName("java.lang.String"));
			local53.invoke(local69, Boolean.TRUE);
			local69.invoke(Runtime.getRuntime(), arg1, local20.getPath());
			local53.invoke(local69, Boolean.FALSE);
			this.aHashtable11.put(arg0, arg1);
		} catch (@Pc(112) NoSuchMethodException local112) {
			System.load(local20.getPath());
			this.aHashtable11.put(arg0, Class407.class);
		} catch (@Pc(123) Throwable local123) {
			throw new Exception_Sub6(3, arg0);
		}
	}

	@OriginalMember(owner = "client!qs", name = "ah", descriptor = "(Ljava/lang/String;Ljava/lang/Class;)V", line = 109)
	void method27809(@OriginalArg(0) String arg0, @OriginalArg(1) Class arg1) throws Exception_Sub6 {
		@Pc(5) Class local5 = (Class) this.aHashtable11.get(arg0);
		if (local5 != null && local5.getClassLoader() != arg1.getClassLoader()) {
			throw new Exception_Sub6(1, arg0);
		}
		@Pc(20) File local20 = null;
		if (local20 == null) {
			local20 = (File) this.aHashtable10.get(arg0);
		}
		if (local20 == null) {
			throw new Exception_Sub6(4, arg0);
		}
		try {
			local20 = new File(local20.getCanonicalPath());
			@Pc(40) Class local40 = Class.forName("java.lang.Runtime");
			@Pc(43) Class local43 = Class.forName("java.lang.reflect.AccessibleObject");
			@Pc(53) Method local53 = local43.getDeclaredMethod("setAccessible", Boolean.TYPE);
			@Pc(69) Method local69 = local40.getDeclaredMethod("load0", Class.forName("java.lang.Class"), Class.forName("java.lang.String"));
			local53.invoke(local69, Boolean.TRUE);
			local69.invoke(Runtime.getRuntime(), arg1, local20.getPath());
			local53.invoke(local69, Boolean.FALSE);
			this.aHashtable11.put(arg0, arg1);
		} catch (@Pc(112) NoSuchMethodException local112) {
			System.load(local20.getPath());
			this.aHashtable11.put(arg0, Class407.class);
		} catch (@Pc(123) Throwable local123) {
			throw new Exception_Sub6(3, arg0);
		}
	}

	@OriginalMember(owner = "client!qs", name = "af", descriptor = "(Ljava/lang/String;Ljava/lang/Class;)V", line = 109)
	void method27815(@OriginalArg(0) String arg0, @OriginalArg(1) Class arg1) throws Exception_Sub6 {
		@Pc(5) Class local5 = (Class) this.aHashtable11.get(arg0);
		if (local5 != null && local5.getClassLoader() != arg1.getClassLoader()) {
			throw new Exception_Sub6(1, arg0);
		}
		@Pc(20) File local20 = null;
		if (local20 == null) {
			local20 = (File) this.aHashtable10.get(arg0);
		}
		if (local20 == null) {
			throw new Exception_Sub6(4, arg0);
		}
		try {
			local20 = new File(local20.getCanonicalPath());
			@Pc(40) Class local40 = Class.forName("java.lang.Runtime");
			@Pc(43) Class local43 = Class.forName("java.lang.reflect.AccessibleObject");
			@Pc(53) Method local53 = local43.getDeclaredMethod("setAccessible", Boolean.TYPE);
			@Pc(69) Method local69 = local40.getDeclaredMethod("load0", Class.forName("java.lang.Class"), Class.forName("java.lang.String"));
			local53.invoke(local69, Boolean.TRUE);
			local69.invoke(Runtime.getRuntime(), arg1, local20.getPath());
			local53.invoke(local69, Boolean.FALSE);
			this.aHashtable11.put(arg0, arg1);
		} catch (@Pc(112) NoSuchMethodException local112) {
			System.load(local20.getPath());
			this.aHashtable11.put(arg0, Class407.class);
		} catch (@Pc(123) Throwable local123) {
			throw new Exception_Sub6(3, arg0);
		}
	}

	@OriginalMember(owner = "client!qs", name = "ak", descriptor = "(Ljava/lang/String;Ljava/lang/Class;)V", line = 109)
	void method27816(@OriginalArg(0) String arg0, @OriginalArg(1) Class arg1) throws Exception_Sub6 {
		@Pc(5) Class local5 = (Class) this.aHashtable11.get(arg0);
		if (local5 != null && local5.getClassLoader() != arg1.getClassLoader()) {
			throw new Exception_Sub6(1, arg0);
		}
		@Pc(20) File local20 = null;
		if (local20 == null) {
			local20 = (File) this.aHashtable10.get(arg0);
		}
		if (local20 == null) {
			throw new Exception_Sub6(4, arg0);
		}
		try {
			local20 = new File(local20.getCanonicalPath());
			@Pc(40) Class local40 = Class.forName("java.lang.Runtime");
			@Pc(43) Class local43 = Class.forName("java.lang.reflect.AccessibleObject");
			@Pc(53) Method local53 = local43.getDeclaredMethod("setAccessible", Boolean.TYPE);
			@Pc(69) Method local69 = local40.getDeclaredMethod("load0", Class.forName("java.lang.Class"), Class.forName("java.lang.String"));
			local53.invoke(local69, Boolean.TRUE);
			local69.invoke(Runtime.getRuntime(), arg1, local20.getPath());
			local53.invoke(local69, Boolean.FALSE);
			this.aHashtable11.put(arg0, arg1);
		} catch (@Pc(112) NoSuchMethodException local112) {
			System.load(local20.getPath());
			this.aHashtable11.put(arg0, Class407.class);
		} catch (@Pc(123) Throwable local123) {
			throw new Exception_Sub6(3, arg0);
		}
	}

	@OriginalMember(owner = "client!qs", name = "aa", descriptor = "(Ljava/lang/String;Ljava/lang/Class;)V", line = 109)
	void method27817(@OriginalArg(0) String arg0, @OriginalArg(1) Class arg1) throws Exception_Sub6 {
		@Pc(5) Class local5 = (Class) this.aHashtable11.get(arg0);
		if (local5 != null && local5.getClassLoader() != arg1.getClassLoader()) {
			throw new Exception_Sub6(1, arg0);
		}
		@Pc(20) File local20 = null;
		if (local20 == null) {
			local20 = (File) this.aHashtable10.get(arg0);
		}
		if (local20 == null) {
			throw new Exception_Sub6(4, arg0);
		}
		try {
			local20 = new File(local20.getCanonicalPath());
			@Pc(40) Class local40 = Class.forName("java.lang.Runtime");
			@Pc(43) Class local43 = Class.forName("java.lang.reflect.AccessibleObject");
			@Pc(53) Method local53 = local43.getDeclaredMethod("setAccessible", Boolean.TYPE);
			@Pc(69) Method local69 = local40.getDeclaredMethod("load0", Class.forName("java.lang.Class"), Class.forName("java.lang.String"));
			local53.invoke(local69, Boolean.TRUE);
			local69.invoke(Runtime.getRuntime(), arg1, local20.getPath());
			local53.invoke(local69, Boolean.FALSE);
			this.aHashtable11.put(arg0, arg1);
		} catch (@Pc(112) NoSuchMethodException local112) {
			System.load(local20.getPath());
			this.aHashtable11.put(arg0, Class407.class);
		} catch (@Pc(123) Throwable local123) {
			throw new Exception_Sub6(3, arg0);
		}
	}

	@OriginalMember(owner = "client!qs", name = "b", descriptor = "()Z", line = 145)
	@Override
	public boolean method27798() {
		@Pc(3) Hashtable local3 = new Hashtable();
		@Pc(7) Enumeration local7 = this.aHashtable11.keys();
		while (local7.hasMoreElements()) {
			@Pc(14) String local14 = (String) local7.nextElement();
			local3.put(local14, this.aHashtable11.get(local14));
		}
		try {
			@Pc(26) Class local26 = Class.forName("java.lang.reflect.AccessibleObject");
			@Pc(29) Class local29 = Class.forName("java.lang.ClassLoader");
			@Pc(33) Field local33 = local29.getDeclaredField("nativeLibraries");
			@Pc(43) Method local43 = local26.getDeclaredMethod("setAccessible", Boolean.TYPE);
			local43.invoke(local33, Boolean.TRUE);
			try {
				local7 = this.aHashtable11.keys();
				while (local7.hasMoreElements()) {
					@Pc(64) String local64 = (String) local7.nextElement();
					try {
						@Pc(70) File local70 = (File) this.aHashtable10.get(local64);
						@Pc(76) Class local76 = (Class) this.aHashtable11.get(local64);
						@Pc(82) Vector local82 = (Vector) local33.get(local76.getClassLoader());
						for (@Pc(84) int local84 = 0; local84 < local82.size(); local84++) {
							try {
								@Pc(92) Object local92 = local82.elementAt(local84);
								@Pc(97) Field local97 = local92.getClass().getDeclaredField("name");
								local43.invoke(local97, Boolean.TRUE);
								try {
									@Pc(112) String local112 = (String) local97.get(local92);
									if (local112 != null && local112.equalsIgnoreCase(local70.getCanonicalPath())) {
										@Pc(124) Field local124 = local92.getClass().getDeclaredField("handle");
										@Pc(131) Method local131 = local92.getClass().getDeclaredMethod("finalize");
										local43.invoke(local124, Boolean.TRUE);
										local43.invoke(local131, Boolean.TRUE);
										try {
											local131.invoke(local92);
											local124.set(local92, Integer.valueOf(0));
											local3.remove(local64);
										} catch (@Pc(170) Throwable local170) {
										}
										local43.invoke(local131, Boolean.FALSE);
										local43.invoke(local124, Boolean.FALSE);
									}
								} catch (@Pc(192) Throwable local192) {
								}
								local43.invoke(local97, Boolean.FALSE);
							} catch (@Pc(204) Throwable local204) {
							}
						}
					} catch (@Pc(208) Throwable local208) {
					}
				}
			} catch (@Pc(211) Throwable local211) {
			}
			local43.invoke(local33, Boolean.FALSE);
		} catch (@Pc(223) Throwable local223) {
		}
		this.aHashtable11 = local3;
		return this.aHashtable11.isEmpty();
	}

	@OriginalMember(owner = "client!qs", name = "c", descriptor = "()Z", line = 145)
	@Override
	public boolean method27799() {
		@Pc(3) Hashtable local3 = new Hashtable();
		@Pc(7) Enumeration local7 = this.aHashtable11.keys();
		while (local7.hasMoreElements()) {
			@Pc(14) String local14 = (String) local7.nextElement();
			local3.put(local14, this.aHashtable11.get(local14));
		}
		try {
			@Pc(26) Class local26 = Class.forName("java.lang.reflect.AccessibleObject");
			@Pc(29) Class local29 = Class.forName("java.lang.ClassLoader");
			@Pc(33) Field local33 = local29.getDeclaredField("nativeLibraries");
			@Pc(43) Method local43 = local26.getDeclaredMethod("setAccessible", Boolean.TYPE);
			local43.invoke(local33, Boolean.TRUE);
			try {
				local7 = this.aHashtable11.keys();
				while (local7.hasMoreElements()) {
					@Pc(64) String local64 = (String) local7.nextElement();
					try {
						@Pc(70) File local70 = (File) this.aHashtable10.get(local64);
						@Pc(76) Class local76 = (Class) this.aHashtable11.get(local64);
						@Pc(82) Vector local82 = (Vector) local33.get(local76.getClassLoader());
						for (@Pc(84) int local84 = 0; local84 < local82.size(); local84++) {
							try {
								@Pc(92) Object local92 = local82.elementAt(local84);
								@Pc(97) Field local97 = local92.getClass().getDeclaredField("name");
								local43.invoke(local97, Boolean.TRUE);
								try {
									@Pc(112) String local112 = (String) local97.get(local92);
									if (local112 != null && local112.equalsIgnoreCase(local70.getCanonicalPath())) {
										@Pc(124) Field local124 = local92.getClass().getDeclaredField("handle");
										@Pc(131) Method local131 = local92.getClass().getDeclaredMethod("finalize");
										local43.invoke(local124, Boolean.TRUE);
										local43.invoke(local131, Boolean.TRUE);
										try {
											local131.invoke(local92);
											local124.set(local92, Integer.valueOf(0));
											local3.remove(local64);
										} catch (@Pc(170) Throwable local170) {
										}
										local43.invoke(local131, Boolean.FALSE);
										local43.invoke(local124, Boolean.FALSE);
									}
								} catch (@Pc(192) Throwable local192) {
								}
								local43.invoke(local97, Boolean.FALSE);
							} catch (@Pc(204) Throwable local204) {
							}
						}
					} catch (@Pc(208) Throwable local208) {
					}
				}
			} catch (@Pc(211) Throwable local211) {
			}
			local43.invoke(local33, Boolean.FALSE);
		} catch (@Pc(223) Throwable local223) {
		}
		this.aHashtable11 = local3;
		return this.aHashtable11.isEmpty();
	}

	@OriginalMember(owner = "client!qs", name = "g", descriptor = "(S)Z", line = 145)
	@Override
	public boolean method27789() {
		@Pc(3) Hashtable local3 = new Hashtable();
		@Pc(7) Enumeration local7 = this.aHashtable11.keys();
		while (local7.hasMoreElements()) {
			@Pc(14) String local14 = (String) local7.nextElement();
			local3.put(local14, this.aHashtable11.get(local14));
		}
		try {
			@Pc(26) Class local26 = Class.forName("java.lang.reflect.AccessibleObject");
			@Pc(29) Class local29 = Class.forName("java.lang.ClassLoader");
			@Pc(33) Field local33 = local29.getDeclaredField("nativeLibraries");
			@Pc(43) Method local43 = local26.getDeclaredMethod("setAccessible", Boolean.TYPE);
			local43.invoke(local33, Boolean.TRUE);
			try {
				local7 = this.aHashtable11.keys();
				while (local7.hasMoreElements()) {
					@Pc(64) String local64 = (String) local7.nextElement();
					try {
						@Pc(70) File local70 = (File) this.aHashtable10.get(local64);
						@Pc(76) Class local76 = (Class) this.aHashtable11.get(local64);
						@Pc(82) Vector local82 = (Vector) local33.get(local76.getClassLoader());
						for (@Pc(84) int local84 = 0; local84 < local82.size(); local84++) {
							try {
								@Pc(92) Object local92 = local82.elementAt(local84);
								@Pc(97) Field local97 = local92.getClass().getDeclaredField("name");
								local43.invoke(local97, Boolean.TRUE);
								try {
									@Pc(112) String local112 = (String) local97.get(local92);
									if (local112 != null && local112.equalsIgnoreCase(local70.getCanonicalPath())) {
										@Pc(124) Field local124 = local92.getClass().getDeclaredField("handle");
										@Pc(131) Method local131 = local92.getClass().getDeclaredMethod("finalize");
										local43.invoke(local124, Boolean.TRUE);
										local43.invoke(local131, Boolean.TRUE);
										try {
											local131.invoke(local92);
											local124.set(local92, Integer.valueOf(0));
											local3.remove(local64);
										} catch (@Pc(170) Throwable local170) {
										}
										local43.invoke(local131, Boolean.FALSE);
										local43.invoke(local124, Boolean.FALSE);
									}
								} catch (@Pc(192) Throwable local192) {
								}
								local43.invoke(local97, Boolean.FALSE);
							} catch (@Pc(204) Throwable local204) {
							}
						}
					} catch (@Pc(208) Throwable local208) {
					}
				}
			} catch (@Pc(211) Throwable local211) {
			}
			local43.invoke(local33, Boolean.FALSE);
		} catch (@Pc(223) Throwable local223) {
		}
		this.aHashtable11 = local3;
		return this.aHashtable11.isEmpty();
	}

	@OriginalMember(owner = "client!qs", name = "ai", descriptor = "(I)I", line = 960)
	static int method27819() {
		if (client.aClass178_13 == null) {
			if (Class250.aBoolean688) {
				@Pc(25) Class611 local25 = Class49_Sub1.method9259();
				@Pc(29) int local29 = Class3_Sub10.aClass61_1.method12740();
				@Pc(33) int local33 = Class3_Sub10.aClass61_1.method12741();
				@Pc(51) int local51;
				@Pc(53) int local53;
				@Pc(85) int local85;
				@Pc(161) Class3_Sub1_Sub7 local161;
				if (Class250.aBoolean687) {
					@Pc(288) Class549 local288;
					if (local29 > Class284.anInt4355 * 989672103 && local29 < Class13_Sub14.anInt663 * -1045688681 + Class284.anInt4355 * 989672103) {
						local51 = -1;
						for (local53 = 0; local53 < Class250.anInt3812 * 1575832235; local53++) {
							if (Class250.aBoolean689) {
								local85 = local25.anInt5537 * -1760037867 + 1 + 20 + Class338.anInt4600 * 1100948139 + local53 * Class250.anInt3804 * 192470685;
								if (local33 > local85 - local25.anInt5537 * -1760037867 - 1 && local33 < local25.anInt5536 * -1990992757 + local85) {
									local51 = local53;
								}
							} else {
								local85 = Class250.anInt3804 * 192470685 * local53 + Class338.anInt4600 * 1100948139 + 31;
								if (local33 > local85 - local25.anInt5537 * -1760037867 - 1 && local33 < local25.anInt5536 * -1990992757 + local85) {
									local51 = local53;
								}
							}
						}
						if (local51 != -1) {
							local53 = 0;
							local288 = new Class549(Class250.aClass546_15);
							for (@Pc(293) Class3_Sub1_Sub9 local293 = (Class3_Sub1_Sub9) local288.method32671(); local293 != null; local293 = (Class3_Sub1_Sub9) local288.next()) {
								if (local53++ == local51) {
									return ((Class3_Sub1_Sub7) local293.aClass546_9.aClass3_Sub1_62.aClass3_Sub1_66).anInt2668 * -1512569487;
								}
							}
						}
					} else if (Class250.aClass3_Sub1_Sub9_1 != null && local29 > Class356.anInt4637 * 1084730905 && local29 < Class381.anInt4707 * -1605305641 + Class356.anInt4637 * 1084730905) {
						local51 = -1;
						for (local53 = 0; local53 < Class250.aClass3_Sub1_Sub9_1.anInt2669 * 2127103997; local53++) {
							if (Class250.aBoolean689) {
								local85 = Class250.anInt3804 * 192470685 * local53 + 1 + 20 + Class151.anInt3438 * 2118805765 + local25.anInt5537 * -1760037867;
								if (local33 > local85 - local25.anInt5537 * -1760037867 - 1 && local33 < local85 + local25.anInt5536 * -1990992757) {
									local51 = local53;
								}
							} else {
								local85 = Class151.anInt3438 * 2118805765 + 31 + Class250.anInt3804 * 192470685 * local53;
								if (local33 > local85 - local25.anInt5537 * -1760037867 - 1 && local33 < local85 + local25.anInt5536 * -1990992757) {
									local51 = local53;
								}
							}
						}
						if (local51 != -1) {
							local53 = 0;
							local288 = new Class549(Class250.aClass3_Sub1_Sub9_1.aClass546_9);
							for (local161 = (Class3_Sub1_Sub7) local288.method32671(); local161 != null; local161 = (Class3_Sub1_Sub7) local288.next()) {
								if (local53++ == local51) {
									return local161.anInt2668 * -1512569487;
								}
							}
						}
					}
				} else if (local29 > Class284.anInt4355 * 989672103 && local29 < Class284.anInt4355 * 989672103 + Class13_Sub14.anInt663 * -1045688681) {
					local51 = -1;
					for (local53 = 0; local53 < Class250.anInt3811 * -1176041819; local53++) {
						if (Class250.aBoolean689) {
							local85 = Class250.anInt3804 * 192470685 * (Class250.anInt3811 * -1176041819 - 1 - local53) + 1 + 20 + Class338.anInt4600 * 1100948139 + local25.anInt5537 * -1760037867;
							if (local33 > local85 - local25.anInt5537 * -1760037867 - 1 && local33 < local25.anInt5536 * -1990992757 + local85) {
								local51 = local53;
							}
						} else {
							local85 = Class338.anInt4600 * 1100948139 + 31 + (Class250.anInt3811 * -1176041819 - 1 - local53) * Class250.anInt3804 * 192470685;
							if (local33 > local85 - local25.anInt5537 * -1760037867 - 1 && local33 < local85 + local25.anInt5536 * -1990992757) {
								local51 = local53;
							}
						}
					}
					if (local51 != -1) {
						local53 = 0;
						@Pc(156) Class554 local156 = new Class554(Class250.aClass553_52);
						for (local161 = (Class3_Sub1_Sub7) local156.method32778(); local161 != null; local161 = (Class3_Sub1_Sub7) local156.next()) {
							if (local53++ == local51) {
								return local161.anInt2668 * -1512569487;
							}
						}
					}
				}
			} else if (Class44.aClass483_5.aBoolean802) {
				if (Class287.aClass3_Sub1_Sub7_3 != null) {
					return Class287.aClass3_Sub1_Sub7_3.anInt2668 * -1512569487;
				}
			} else if (Class423.aClass3_Sub1_Sub7_5 != null) {
				return Class423.aClass3_Sub1_Sub7_5.anInt2668 * -1512569487;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!qs", name = "anj", descriptor = "(Lclient!vs;I)V", line = 11387)
	static final void method27821(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub12_1, local12);
		Class26_Sub1_Sub1_Sub1.method16728();
		client.aBoolean573 = false;
	}
}
