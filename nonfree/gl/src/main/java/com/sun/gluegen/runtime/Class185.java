package com.sun.gluegen.runtime;

import java.io.File;
import java.lang.reflect.Method;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("gl!com/sun/gluegen/runtime/NativeLibrary")
public final class Class185 {

	@OriginalMember(owner = "gl!com/sun/gluegen/runtime/NativeLibrary", name = "DEBUG", descriptor = "Z")
	private static boolean aBoolean455;

	@OriginalMember(owner = "gl!com/sun/gluegen/runtime/NativeLibrary", name = "platform", descriptor = "I")
	private static int anInt5924;

	// $FF: synthetic field
	@OriginalMember(owner = "gl!com/sun/gluegen/runtime/NativeLibrary", name = "class$java$lang$String", descriptor = "Ljava/lang/Class;")
	public static Class aClass1;

	// $FF: synthetic field
	@OriginalMember(owner = "gl!com/sun/gluegen/runtime/NativeLibrary", name = "class$java$lang$ClassLoader", descriptor = "Ljava/lang/Class;")
	public static Class aClass2;

	@OriginalMember(owner = "gl!com/sun/gluegen/runtime/NativeLibrary", name = "dynLink", descriptor = "Lgl!com/sun/gluegen/runtime/DynamicLinker;")
	private static Interface6 anInterface6_1;

	@OriginalMember(owner = "gl!com/sun/gluegen/runtime/NativeLibrary", name = "prefixes", descriptor = "[Ljava/lang/String;")
	private static String[] aStringArray40;

	@OriginalMember(owner = "gl!com/sun/gluegen/runtime/NativeLibrary", name = "suffixes", descriptor = "[Ljava/lang/String;")
	private static String[] aStringArray41;

	@OriginalMember(owner = "gl!com/sun/gluegen/runtime/NativeLibrary", name = "initializedFindLibraryMethod", descriptor = "Z")
	private static boolean aBoolean456;

	@OriginalMember(owner = "gl!com/sun/gluegen/runtime/NativeLibrary", name = "findLibraryMethod", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod3;

	@OriginalMember(owner = "gl!com/sun/gluegen/runtime/NativeLibrary", name = "libraryHandle", descriptor = "J")
	private long aLong203;

	@OriginalMember(owner = "gl!com/sun/gluegen/runtime/NativeLibrary", name = "libraryPath", descriptor = "Ljava/lang/String;")
	private String aString193;

	static {
		AccessController.doPrivileged(new PrivilegedAction() {

			@OriginalMember(owner = "gl!com/sun/gluegen/runtime/NativeLibrary$1", name = "run", descriptor = "()Ljava/lang/Object;")
			@Override
			public Object run() {
				@Pc(3) String local3 = System.getProperty("os.name").toLowerCase();
				if (local3.startsWith("wind")) {
					Class185.anInt5924 = 1;
				} else if (local3.startsWith("mac os x")) {
					Class185.anInt5924 = 3;
				} else {
					Class185.anInt5924 = 2;
				}
				Class185.aBoolean455 = System.getProperty("gluegen.debug.NativeLibrary") != null;
				return null;
			}
		});
		switch(anInt5924) {
			case 1:
				anInterface6_1 = new WindowsDynamicLinkerImpl();
				aStringArray40 = new String[] { "" };
				aStringArray41 = new String[] { ".dll" };
				break;
			case 2:
				anInterface6_1 = new UnixDynamicLinkerImpl();
				aStringArray40 = new String[] { "lib" };
				aStringArray41 = new String[] { ".so" };
				break;
			case 3:
				anInterface6_1 = new MacOSXDynamicLinkerImpl();
				aStringArray40 = new String[] { "lib", "" };
				aStringArray41 = new String[] { ".dylib", ".jnilib", "" };
				break;
			default:
				throw new InternalError("Platform not initialized properly");
		}
		aBoolean456 = false;
		aMethod3 = null;
	}

	@OriginalMember(owner = "gl!com/sun/gluegen/runtime/NativeLibrary", name = "open", descriptor = "(Ljava/lang/String;Ljava/lang/ClassLoader;)Lgl!com/sun/gluegen/runtime/NativeLibrary;")
	public static Class185 method4571(@OriginalArg(0) String arg0, @OriginalArg(1) ClassLoader arg1) {
		return method4572(arg0, arg0, arg0, arg1);
	}

	@OriginalMember(owner = "gl!com/sun/gluegen/runtime/NativeLibrary", name = "open", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/ClassLoader;)Lgl!com/sun/gluegen/runtime/NativeLibrary;")
	private static Class185 method4572(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(4) ClassLoader arg3) {
		@Pc(6) List local6 = method4574(arg0, arg1, arg2, arg3);
		@Pc(9) Iterator local9 = local6.iterator();
		@Pc(16) String local16;
		@Pc(32) long local32;
		do {
			if (!local9.hasNext()) {
				if (aBoolean455) {
					System.out.println("Did not succeed in loading (" + arg0 + ", " + arg1 + ", " + arg2 + ")");
				}
				return null;
			}
			local16 = (String) local9.next();
			if (aBoolean455) {
				System.out.println("Trying to load " + local16);
			}
			local32 = anInterface6_1.method4598(local16);
		} while (local32 == 0L);
		if (aBoolean455) {
			System.out.println("Successfully loaded " + local16 + ": res = 0x" + Long.toHexString(local32));
		}
		return new Class185(local32, local16);
	}

	@OriginalMember(owner = "gl!com/sun/gluegen/runtime/NativeLibrary", name = "enumerateLibraryPaths", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/util/List;")
	private static List method4574(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(4) ClassLoader arg3) {
		@Pc(3) ArrayList local3 = new ArrayList();
		@Pc(8) String local8 = method4575(arg0, arg1, arg2);
		if (local8 == null) {
			return local3;
		}
		@Pc(17) File local17 = new File(local8);
		if (local17.isAbsolute()) {
			local3.add(local8);
			return local3;
		}
		@Pc(29) String[] local29 = method4576(local8);
		for (@Pc(33) int local33 = 0; local33 < local29.length; local33++) {
			local3.add(local29[local33]);
		}
		@Pc(49) String local49 = method4578(local8, arg3);
		if (aBoolean455) {
			System.out.println("Class loader path to " + local8 + ": " + local49);
		}
		if (local49 != null) {
			local3.add(local49);
		}
		@Pc(77) String local77 = (String) AccessController.doPrivileged(new PrivilegedAction() {

			@OriginalMember(owner = "gl!com/sun/gluegen/runtime/NativeLibrary$2", name = "run", descriptor = "()Ljava/lang/Object;")
			@Override
			public Object run() {
				return System.getProperty("java.library.path");
			}
		});
		if (local77 != null) {
			@Pc(85) StringTokenizer local85 = new StringTokenizer(local77, File.pathSeparator);
			while (local85.hasMoreTokens()) {
				method4577(local85.nextToken(), local29, local3);
			}
		}
		@Pc(100) String local100 = (String) AccessController.doPrivileged(new PrivilegedAction() {

			@OriginalMember(owner = "gl!com/sun/gluegen/runtime/NativeLibrary$3", name = "run", descriptor = "()Ljava/lang/Object;")
			@Override
			public Object run() {
				return System.getProperty("user.dir");
			}
		});
		method4577(local100, local29, local3);
		if (anInt5924 == 3) {
			method4577("/Library/Frameworks/" + local8 + ".Framework", local29, local3);
			method4577("/System/Library/Frameworks/" + local8 + ".Framework", local29, local3);
		}
		return local3;
	}

	@OriginalMember(owner = "gl!com/sun/gluegen/runtime/NativeLibrary", name = "selectName", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
	private static String method4575(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		switch(anInt5924) {
			case 1:
				return arg0;
			case 2:
				return arg1;
			case 3:
				return arg2;
			default:
				throw new InternalError();
		}
	}

	@OriginalMember(owner = "gl!com/sun/gluegen/runtime/NativeLibrary", name = "buildNames", descriptor = "(Ljava/lang/String;)[Ljava/lang/String;")
	private static String[] method4576(@OriginalArg(0) String arg0) {
		@Pc(35) int local35;
		if (arg0.startsWith(aStringArray40[0])) {
			if (arg0.endsWith(aStringArray41[0])) {
				return new String[] { arg0 };
			}
			@Pc(24) int local24 = arg0.indexOf(aStringArray41[0]);
			@Pc(26) boolean local26 = true;
			if (local24 >= 0) {
				for (local35 = local24 + aStringArray41[0].length(); local35 < arg0.length(); local35++) {
					@Pc(43) char local43 = arg0.charAt(local35);
					if (local43 != '.' && (local43 < '0' || local43 > '9')) {
						local26 = false;
						break;
					}
				}
				if (local26) {
					return new String[] { arg0 };
				}
			}
		}
		@Pc(73) String[] local73 = new String[aStringArray40.length * aStringArray41.length];
		@Pc(75) int local75 = 0;
		for (local35 = 0; local35 < aStringArray40.length; local35++) {
			for (@Pc(83) int local83 = 0; local83 < aStringArray41.length; local83++) {
				local73[local75++] = aStringArray40[local35] + arg0 + aStringArray41[local83];
			}
		}
		return local73;
	}

	@OriginalMember(owner = "gl!com/sun/gluegen/runtime/NativeLibrary", name = "addPaths", descriptor = "(Ljava/lang/String;[Ljava/lang/String;Ljava/util/List;)V")
	private static void method4577(@OriginalArg(0) String arg0, @OriginalArg(1) String[] arg1, @OriginalArg(2) List arg2) {
		for (@Pc(1) int local1 = 0; local1 < arg1.length; local1++) {
			arg2.add(arg0 + File.separator + arg1[local1]);
		}
	}

	@OriginalMember(owner = "gl!com/sun/gluegen/runtime/NativeLibrary", name = "getPathFromClassLoader", descriptor = "(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/String;")
	private static String method4578(@OriginalArg(0) String arg0, @OriginalArg(1) ClassLoader arg1) {
		if (arg1 == null) {
			return null;
		}
		if (!aBoolean456) {
			AccessController.doPrivileged(new PrivilegedAction() {

				@OriginalMember(owner = "gl!com/sun/gluegen/runtime/NativeLibrary$4", name = "run", descriptor = "()Ljava/lang/Object;")
				@Override
				public Object run() {
					try {
						Class185.aMethod3 = (Class185.aClass2 == null ? (Class185.aClass2 = Class185.class$("java.lang.ClassLoader")) : Class185.aClass2).getDeclaredMethod("findLibrary", Class185.aClass1 == null ? (Class185.aClass1 = Class185.class$("java.lang.String")) : Class185.aClass1);
						Class185.aMethod3.setAccessible(true);
					} catch (@Pc(29) Exception local29) {
					}
					Class185.method4583();
					return null;
				}
			});
		}
		if (aMethod3 != null) {
			try {
				return (String) AccessController.doPrivileged(new PrivilegedAction() {

					@OriginalMember(owner = "gl!com/sun/gluegen/runtime/NativeLibrary$5", name = "run", descriptor = "()Ljava/lang/Object;")
					@Override
					public Object run() {
						try {
							return Class185.aMethod3.invoke(arg1, arg0);
						} catch (@Pc(12) Exception local12) {
							throw new RuntimeException(local12);
						}
					}
				});
			} catch (@Pc(21) Exception local21) {
				if (aBoolean455) {
					local21.printStackTrace();
				}
			}
		}
		return null;
	}

	// $FF: synthetic method
	@OriginalMember(owner = "gl!com/sun/gluegen/runtime/NativeLibrary", name = "access$302", descriptor = "(Z)Z")
	public static boolean method4583() {
		aBoolean456 = true;
		return true;
	}

	@OriginalMember(owner = "gl!com/sun/gluegen/runtime/NativeLibrary", name = "<init>", descriptor = "(JLjava/lang/String;)V")
	private Class185(@OriginalArg(0) long arg0, @OriginalArg(1) String arg1) {
		this.aLong203 = arg0;
		this.aString193 = arg1;
	}

	@OriginalMember(owner = "gl!com/sun/gluegen/runtime/NativeLibrary", name = "close", descriptor = "()V")
	public void method4573() {
		if (this.aLong203 == 0L) {
			throw new RuntimeException("Library already closed");
		}
		@Pc(12) long local12 = this.aLong203;
		this.aLong203 = 0L;
		anInterface6_1.method4599(local12);
	}
}
