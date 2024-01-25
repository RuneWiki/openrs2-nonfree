import java.applet.Applet;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.Transferable;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.util.Hashtable;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!gt")
public final class Class228 implements Runnable {

	@OriginalMember(owner = "loader!gt", name = "b", descriptor = "Ljava/lang/String;")
	private static String aString68;

	@OriginalMember(owner = "loader!gt", name = "j", descriptor = "Ljava/lang/String;")
	private static String aString69;

	@OriginalMember(owner = "loader!gt", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString70;

	@OriginalMember(owner = "loader!gt", name = "k", descriptor = "Ljava/lang/String;")
	private static String aString71;

	@OriginalMember(owner = "loader!gt", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString73;

	@OriginalMember(owner = "loader!gt", name = "p", descriptor = "Ljava/lang/String;")
	private static String aString74;

	@OriginalMember(owner = "loader!gt", name = "f", descriptor = "Ljava/lang/String;")
	private static String aString75;

	@OriginalMember(owner = "loader!gt", name = "u", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod3;

	@OriginalMember(owner = "loader!gt", name = "s", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod4;

	@OriginalMember(owner = "loader!gt", name = "a", descriptor = "I")
	private static int anInt7060 = 1;

	@OriginalMember(owner = "loader!gt", name = "r", descriptor = "Ljava/util/Hashtable;")
	private static Hashtable aHashtable2 = new Hashtable(16);

	@OriginalMember(owner = "loader!gt", name = "v", descriptor = "J")
	private static volatile long aLong219 = 0L;

	@OriginalMember(owner = "loader!gt", name = "h", descriptor = "Lloader!kc;")
	private Interface12 anInterface12_1;

	@OriginalMember(owner = "loader!gt", name = "d", descriptor = "Lloader!ri;")
	private Class232 aClass232_1 = null;

	@OriginalMember(owner = "loader!gt", name = "c", descriptor = "Z")
	private boolean aBoolean513 = false;

	@OriginalMember(owner = "loader!gt", name = "q", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2 = null;

	@OriginalMember(owner = "loader!gt", name = "e", descriptor = "Lloader!ri;")
	private Class232 aClass232_2 = null;

	@OriginalMember(owner = "loader!gt", name = "A", descriptor = "Lloader!lf;")
	private Class230 aClass230_2 = null;

	@OriginalMember(owner = "loader!gt", name = "z", descriptor = "Lloader!lf;")
	private Class230 aClass230_1 = null;

	@OriginalMember(owner = "loader!gt", name = "m", descriptor = "Lloader!ri;")
	private Class232 aClass232_3 = null;

	@OriginalMember(owner = "loader!gt", name = "w", descriptor = "I")
	private final int anInt7059;

	@OriginalMember(owner = "loader!gt", name = "g", descriptor = "Ljava/lang/String;")
	private final String aString72;

	@OriginalMember(owner = "loader!gt", name = "t", descriptor = "Ljava/awt/EventQueue;")
	private EventQueue anEventQueue2;

	@OriginalMember(owner = "loader!gt", name = "i", descriptor = "[Lloader!ri;")
	private final Class232[] aClass232Array1;

	@OriginalMember(owner = "loader!gt", name = "o", descriptor = "Lloader!e;")
	private Class227 aClass227_1;

	@OriginalMember(owner = "loader!gt", name = "y", descriptor = "Lloader!d;")
	private Class226 aClass226_1;

	@OriginalMember(owner = "loader!gt", name = "x", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread4;

	@OriginalMember(owner = "loader!gt", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;)Ljava/io/File;")
	private static File method6112(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) String arg2) {
		@Pc(4) File local4 = (File) aHashtable2.get(arg2);
		if (local4 != null) {
			return local4;
		}
		@Pc(45) String[] local45 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString68, "/tmp/", "" };
		@Pc(70) String[] local70 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
		for (@Pc(80) int local80 = 0; local80 < 2; local80++) {
			for (@Pc(85) int local85 = 0; local85 < local70.length; local85++) {
				for (@Pc(91) int local91 = 0; local91 < local45.length; local91++) {
					@Pc(129) String local129 = local45[local91] + local70[local85] + "/" + (arg1 == null ? "" : arg1 + "/") + arg2;
					@Pc(131) RandomAccessFile local131 = null;
					try {
						@Pc(136) File local136 = new File(local129);
						if (local80 != 0 || local136.exists()) {
							@Pc(148) String local148 = local45[local91];
							if (local80 != 1 || local148.length() <= 0 || (new File(local148)).exists()) {
								(new File(local45[local91] + local70[local85])).mkdir();
								if (arg1 != null) {
									(new File(local45[local91] + local70[local85] + "/" + arg1)).mkdir();
								}
								local131 = new RandomAccessFile(local136, "rw");
								@Pc(217) int local217 = local131.read();
								local131.seek(0L);
								local131.write(local217);
								local131.seek(0L);
								local131.close();
								aHashtable2.put(arg2, local136);
								return local136;
							}
						}
					} catch (@Pc(236) Exception local236) {
						try {
							if (local131 != null) {
								local131.close();
							}
						} catch (@Pc(245) Exception local245) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "loader!gt", name = "a", descriptor = "(IILjava/lang/String;)Lloader!ri;")
	private static Class232 method6129(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		@Pc(15) String local15;
		if (arg0 == 33) {
			local15 = "jagex_" + arg1 + "_preferences_rc.dat";
		} else if (arg0 == 34) {
			local15 = "jagex_" + arg1 + "_preferences_wip.dat";
		} else {
			local15 = "jagex_" + arg1 + "_preferences.dat";
		}
		@Pc(77) String[] local77 = new String[] { "c:/rscache/", "/rscache/", aString68, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(85) int local85 = 0; local85 < local77.length; local85++) {
			@Pc(97) String local97 = local77[local85];
			if (local97.length() <= 0 || (new File(local97)).exists()) {
				try {
					return new Class232(new File(local97, local15), "rw", 10000L);
				} catch (@Pc(124) Exception local124) {
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "loader!gt", name = "a", descriptor = "(Ljava/lang/String;II)Lloader!ri;")
	private static Class232 method6132(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		@Pc(15) String local15;
		if (arg1 == 33) {
			local15 = "jagex_" + arg0 + "_preferences2_rc.dat";
		} else if (arg1 == 34) {
			local15 = "jagex_" + arg0 + "_preferences2_wip.dat";
		} else {
			local15 = "jagex_" + arg0 + "_preferences2.dat";
		}
		@Pc(77) String[] local77 = new String[] { "c:/rscache/", "/rscache/", aString68, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(79) int local79 = 0; local79 < local77.length; local79++) {
			@Pc(87) String local87 = local77[local79];
			if (local87.length() <= 0 || (new File(local87)).exists()) {
				try {
					return new Class232(new File(local87, local15), "rw", 10000L);
				} catch (@Pc(113) Exception local113) {
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "loader!gt", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class228(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		this.anInt7059 = arg1;
		this.aString72 = arg2;
		aString70 = "1.1";
		aString73 = "Unknown";
		this.anApplet2 = arg0;
		try {
			aString73 = System.getProperty("java.vendor");
			aString70 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			aString74 = System.getProperty("os.name");
		} catch (@Pc(48) Exception local48) {
			aString74 = "Unknown";
		}
		aString71 = aString74.toLowerCase();
		try {
			aString69 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(59) Exception local59) {
			aString69 = "";
		}
		try {
			aString75 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(67) Exception local67) {
			aString75 = "";
		}
		try {
			aString68 = System.getProperty("user.home");
			if (aString68 != null) {
				aString68 = aString68 + "/";
			}
		} catch (@Pc(86) Exception local86) {
		}
		if (aString68 == null) {
			aString68 = "~/";
		}
		try {
			this.anEventQueue2 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(98) Throwable local98) {
		}
		try {
			if (arg0 == null) {
				aMethod3 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				aMethod3 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(126) Exception local126) {
		}
		try {
			if (arg0 == null) {
				aMethod4 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				aMethod4 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(154) Exception local154) {
		}
		this.aClass232_3 = new Class232(method6112(this.anInt7059, null, "random.dat"), "rw", 25L);
		this.aClass232_1 = new Class232(this.method6107("main_file_cache.dat2"), "rw", 209715200L);
		this.aClass232_2 = new Class232(this.method6107("main_file_cache.idx255"), "rw", 1048576L);
		this.aClass232Array1 = new Class232[arg3];
		for (@Pc(195) int local195 = 0; local195 < arg3; local195++) {
			this.aClass232Array1[local195] = new Class232(this.method6107("main_file_cache.idx" + local195), "rw", 1048576L);
		}
		try {
			this.aClass227_1 = new Class227();
		} catch (@Pc(227) Throwable local227) {
		}
		try {
			this.aClass226_1 = new Class226();
		} catch (@Pc(234) Throwable local234) {
		}
		@Pc(237) ThreadGroup local237 = Thread.currentThread().getThreadGroup();
		for (@Pc(240) ThreadGroup local240 = local237.getParent(); local240 != null; local240 = local240.getParent()) {
			local237 = local240;
		}
		@Pc(252) Thread[] local252 = new Thread[1000];
		local237.enumerate(local252);
		for (@Pc(258) int local258 = 0; local258 < local252.length; local258++) {
			if (local252[local258] != null && local252[local258].getName().startsWith("AWT")) {
				local252[local258].setPriority(1);
			}
		}
		this.aBoolean513 = false;
		this.aThread4 = new Thread(this);
		this.aThread4.setPriority(10);
		this.aThread4.setDaemon(true);
		this.aThread4.start();
	}

	@OriginalMember(owner = "loader!gt", name = "b", descriptor = "(B)Lloader!lf;")
	private Class230 method6103() {
		return this.method6109(0, 18, (byte) -128, 0, null);
	}

	@OriginalMember(owner = "loader!gt", name = "f", descriptor = "(I)Lloader!lf;")
	private Class230 method6104(@OriginalArg(0) int arg0) {
		return arg0 > -93 ? (Class230) null : this.method6109(0, 12, (byte) -128, 0, null);
	}

	@OriginalMember(owner = "loader!gt", name = "a", descriptor = "(BLjava/lang/Class;)Lloader!lf;")
	private Class230 method6105(@OriginalArg(0) byte arg0, @OriginalArg(1) Class arg1) {
		if (arg0 != 62) {
			anInt7060 = -82;
		}
		return this.method6109(0, 10, (byte) -81, 0, arg1);
	}

	@OriginalMember(owner = "loader!gt", name = "a", descriptor = "(Ljava/lang/Object;IIII)Lloader!lf;")
	private Class230 method6106(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 != 0) {
			this.aClass232_1 = null;
		}
		@Pc(9) Class230 local9 = new Class230();
		synchronized (local9) {
			local9.anInt7063 = arg1;
			local9.anInt7066 = arg4;
			local9.anInt7064 = arg3;
			local9.anObject9 = arg0;
			synchronized (this) {
				if (this.aClass230_1 == null) {
					this.aClass230_1 = this.aClass230_2 = local9;
				} else {
					this.aClass230_1.aClass230_3 = local9;
					this.aClass230_1 = local9;
				}
				this.notify();
			}
			try {
				local9.wait();
			} catch (@Pc(61) InterruptedException local61) {
			}
			return local9;
		}
	}

	@OriginalMember(owner = "loader!gt", name = "a", descriptor = "(BLjava/lang/String;)Ljava/io/File;")
	public File method6107(@OriginalArg(1) String arg0) {
		return method6112(this.anInt7059, this.aString72, arg0);
	}

	@OriginalMember(owner = "loader!gt", name = "b", descriptor = "(Ljava/lang/String;I)Lloader!lf;")
	private Class230 method6108(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		return arg1 < 45 ? (Class230) null : this.method6109(0, 21, (byte) -101, 0, arg0);
	}

	@OriginalMember(owner = "loader!gt", name = "a", descriptor = "(IIBILjava/lang/Object;)Lloader!lf;")
	private Class230 method6109(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Object arg4) {
		@Pc(3) Class230 local3 = new Class230();
		local3.anObject9 = arg4;
		local3.anInt7066 = arg3;
		local3.anInt7064 = arg0;
		local3.anInt7063 = arg1;
		synchronized (this) {
			if (this.aClass230_1 == null) {
				this.aClass230_1 = this.aClass230_2 = local3;
			} else {
				this.aClass230_1.aClass230_3 = local3;
				this.aClass230_1 = local3;
			}
			this.notify();
		}
		if (arg2 > -74) {
			aString70 = null;
		}
		return local3;
	}

	@OriginalMember(owner = "loader!gt", name = "c", descriptor = "(I)V")
	private void method6110(@OriginalArg(0) int arg0) {
		if (arg0 != 10000) {
			this.method6128(70);
		}
		synchronized (this) {
			this.aBoolean513 = true;
			this.notifyAll();
		}
		try {
			this.aThread4.join();
		} catch (@Pc(29) InterruptedException local29) {
		}
		if (this.aClass232_1 != null) {
			try {
				this.aClass232_1.method6148();
			} catch (@Pc(40) IOException local40) {
			}
		}
		if (this.aClass232_2 != null) {
			try {
				this.aClass232_2.method6148();
			} catch (@Pc(50) IOException local50) {
			}
		}
		if (this.aClass232Array1 != null) {
			for (@Pc(57) int local57 = 0; local57 < this.aClass232Array1.length; local57++) {
				if (this.aClass232Array1[local57] != null) {
					try {
						this.aClass232Array1[local57].method6148();
					} catch (@Pc(79) IOException local79) {
					}
				}
			}
		}
		if (this.aClass232_3 != null) {
			try {
				this.aClass232_3.method6148();
			} catch (@Pc(90) IOException local90) {
			}
		}
	}

	@OriginalMember(owner = "loader!gt", name = "a", descriptor = "(Ljava/lang/Class;B)Lloader!lf;")
	private Class230 method6111(@OriginalArg(0) Class arg0, @OriginalArg(1) byte arg1) {
		if (arg1 != -56) {
			this.method6134();
		}
		return this.method6109(0, 11, (byte) -128, 0, arg0);
	}

	@OriginalMember(owner = "loader!gt", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(16) Class230 local16;
			synchronized (this) {
				while (true) {
					if (this.aBoolean513) {
						return;
					}
					if (this.aClass230_2 != null) {
						local16 = this.aClass230_2;
						this.aClass230_2 = this.aClass230_2.aClass230_3;
						if (this.aClass230_2 == null) {
							this.aClass230_1 = null;
						}
						break;
					}
					try {
						this.wait();
					} catch (@Pc(33) InterruptedException local33) {
					}
				}
			}
			try {
				@Pc(45) int local45 = local16.anInt7063;
				if (local45 == 1) {
					if (Class231.method6141(-16756) < aLong219) {
						throw new IOException();
					}
					local16.anObject8 = new Socket(InetAddress.getByName((String) local16.anObject9), local16.anInt7064);
				} else if (local45 == 2) {
					@Pc(885) Thread local885 = new Thread((Runnable) local16.anObject9);
					local885.setDaemon(true);
					local885.start();
					local885.setPriority(local16.anInt7064);
					local16.anObject8 = local885;
				} else if (local45 == 4) {
					if (aLong219 > Class231.method6141(-16756)) {
						throw new IOException();
					}
					local16.anObject8 = new DataInputStream(((URL) local16.anObject9).openStream());
				} else {
					@Pc(119) Object[] local119;
					if (local45 == 8) {
						local119 = (Object[]) local16.anObject9;
						if (((Class) local119[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local16.anObject8 = ((Class) local119[0]).getDeclaredMethod((String) local119[1], (Class[]) local119[2]);
					} else if (local45 == 9) {
						local119 = (Object[]) local16.anObject9;
						if (((Class) local119[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local16.anObject8 = ((Class) local119[0]).getDeclaredField((String) local119[1]);
					} else if (local45 == 18) {
						@Pc(148) Clipboard local148 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local16.anObject8 = local148.getContents(null);
					} else if (local45 == 19) {
						@Pc(836) Transferable local836 = (Transferable) local16.anObject9;
						@Pc(839) Clipboard local839 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local839.setContents(local836, null);
					} else {
						@Pc(212) String local212;
						if (local45 == 3) {
							if (Class231.method6141(-16756) < aLong219) {
								throw new IOException();
							}
							local212 = (local16.anInt7064 >> 24 & 0xFF) + "." + (local16.anInt7064 >> 16 & 0xFF) + "." + (local16.anInt7064 >> 8 & 0xFF) + "." + (local16.anInt7064 & 0xFF);
							local16.anObject8 = InetAddress.getByName(local212).getHostName();
						} else if (local45 == 21) {
							if (aLong219 > Class231.method6141(-16756)) {
								throw new IOException();
							}
							local16.anObject8 = InetAddress.getByName((String) local16.anObject9).getAddress();
						} else if (local45 == 5) {
							local16.anObject8 = this.aClass227_1.method6096();
						} else if (local45 == 6) {
							@Pc(251) Frame local251 = new Frame("Jagex Full Screen");
							local16.anObject8 = local251;
							local251.setResizable(false);
							this.aClass227_1.method6098(local16.anInt7064 >>> 16, local16.anInt7064 & 0xFFFF, local251, local16.anInt7066 & 0xFFFF, local16.anInt7066 >> 16);
						} else if (local45 == 7) {
							this.aClass227_1.method6099();
						} else {
							@Pc(425) Method local425;
							@Pc(417) Class[] local417;
							@Pc(419) Runtime local419;
							if (local45 == 10) {
								local417 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
								local419 = Runtime.getRuntime();
								if (!aString71.startsWith("mac")) {
									local425 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", local417);
									local425.setAccessible(true);
									local425.invoke(local419, local16.anObject9, "jawt");
									local425.setAccessible(false);
								}
								local425 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local417);
								local425.setAccessible(true);
								if (aString71.startsWith("linux") || aString71.startsWith("sunos")) {
									local425.invoke(local419, local16.anObject9, this.method6107("libjaggl_dri.so").toString());
									@Pc(782) Class local782 = ((Class) local16.anObject9).getClassLoader().loadClass("jaggl.X11.dri");
									local782.getMethod("bind").invoke(null);
									local425.invoke(local419, local16.anObject9, this.method6107("libjaggl.so").toString());
									local782.getMethod("close").invoke(null);
								} else if (aString71.startsWith("mac")) {
									local425.invoke(local419, local16.anObject9, this.method6107("libjaggl.jnilib").toString());
								} else if (aString71.startsWith("win")) {
									local425.invoke(local419, local16.anObject9, this.method6107("jaggl.dll").toString());
								} else {
									throw new Exception();
								}
								local425.setAccessible(false);
							} else {
								@Pc(313) int local313;
								if (local45 == 11) {
									@Pc(300) Field local300 = Class.forName("java.lang.ClassLoader").getDeclaredField("nativeLibraries");
									local300.setAccessible(true);
									@Pc(311) Vector local311 = (Vector) local300.get(((Class) local16.anObject9).getClassLoader());
									for (local313 = 0; local313 < local311.size(); local313++) {
										@Pc(325) Object local325 = local311.elementAt(local313);
										@Pc(332) Method local332 = local325.getClass().getDeclaredMethod("finalize");
										local332.setAccessible(true);
										local332.invoke(local325);
										local332.setAccessible(false);
										@Pc(349) Field local349 = local325.getClass().getDeclaredField("handle");
										local349.setAccessible(true);
										local349.set(local325, Integer.valueOf(0));
										local349.setAccessible(false);
									}
									local300.setAccessible(false);
								} else {
									@Pc(625) Class232 local625;
									if (local45 == 12) {
										local625 = method6129(this.anInt7059, this.aString72);
										local16.anObject8 = local625;
									} else if (local45 == 13) {
										local625 = method6132(this.aString72, this.anInt7059);
										local16.anObject8 = local625;
									} else if (local45 == 14) {
										@Pc(608) int local608 = local16.anInt7064;
										@Pc(611) int local611 = local16.anInt7066;
										this.aClass226_1.method6095(local611, local608);
									} else if (local45 == 15) {
										@Pc(594) boolean local594 = local16.anInt7064 != 0;
										@Pc(598) Component local598 = (Component) local16.anObject9;
										this.aClass226_1.method6093(local594, local598);
									} else if (local45 == 17) {
										local119 = (Object[]) local16.anObject9;
										this.aClass226_1.method6094((Component) local119[0], local16.anInt7066, (int[]) local119[1], (Point) local119[2], local16.anInt7064);
									} else if (local45 == 16) {
										try {
											if (!aString71.startsWith("win")) {
												throw new Exception();
											}
											local212 = (String) local16.anObject9;
											if (!local212.startsWith("http://") && !local212.startsWith("https://")) {
												throw new Exception();
											}
											@Pc(515) String local515 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
											for (local313 = 0; local313 < local212.length(); local313++) {
												if (local515.indexOf(local212.charAt(local313)) == -1) {
													throw new Exception();
												}
											}
											Runtime.getRuntime().exec("cmd /c start \"j\" \"" + local212 + "\"");
											local16.anObject8 = null;
										} catch (@Pc(554) Exception local554) {
											local16.anObject8 = local554;
											throw local554;
										}
									} else if (local45 == 20) {
										try {
											local417 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
											local419 = Runtime.getRuntime();
											local425 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local417);
											local425.setAccessible(true);
											if (aString71.startsWith("win")) {
												if (aString69.startsWith("amd64") || aString69.startsWith("x86_64")) {
													local425.invoke(local419, local16.anObject9, this.method6107("jagmisc64.dll").toString());
												} else {
													local425.invoke(local419, local16.anObject9, this.method6107("jagmisc.dll").toString());
												}
											}
											local425.setAccessible(false);
										} catch (@Pc(484) Throwable local484) {
											local16.anObject8 = local484;
										}
									} else {
										throw new Exception("");
									}
								}
							}
						}
					}
				}
				local16.anInt7065 = 1;
			} catch (@Pc(902) ThreadDeath local902) {
				throw local902;
			} catch (@Pc(905) Throwable local905) {
				local16.anInt7065 = 2;
			}
			synchronized (local16) {
				local16.notify();
			}
		}
	}

	@OriginalMember(owner = "loader!gt", name = "a", descriptor = "(Ljava/awt/Point;BLjava/awt/Component;[III)Lloader!lf;")
	private Class230 method6113(@OriginalArg(0) Point arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		return this.method6109(arg4, 17, (byte) -76, arg3, new Object[] { arg1, arg2, arg0 });
	}

	@OriginalMember(owner = "loader!gt", name = "a", descriptor = "(IZLjava/awt/Component;)Lloader!lf;")
	private Class230 method6114(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Component arg2) {
		if (arg0 != 24717) {
			this.anEventQueue2 = null;
		}
		return this.method6109(arg1 ? 1 : 0, 15, (byte) -78, 0, arg2);
	}

	@OriginalMember(owner = "loader!gt", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Class;)Lloader!lf;")
	private Class230 method6115(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Class arg2) {
		if (arg0 != 0) {
			this.method6128(67);
		}
		return this.method6109(0, 9, (byte) -81, 0, new Object[] { arg2, arg1 });
	}

	@OriginalMember(owner = "loader!gt", name = "a", descriptor = "(ILjava/lang/Class;)Lloader!lf;")
	private Class230 method6116(@OriginalArg(0) int arg0, @OriginalArg(1) Class arg1) {
		if (arg0 != 0) {
			this.aClass226_1 = null;
		}
		return this.method6109(0, 20, (byte) -112, 0, arg1);
	}

	@OriginalMember(owner = "loader!gt", name = "e", descriptor = "(I)Z")
	private boolean method6117(@OriginalArg(0) int arg0) {
		if (arg0 != -335) {
			this.method6119(null, -84);
		}
		return this.aClass227_1 != null;
	}

	@OriginalMember(owner = "loader!gt", name = "a", descriptor = "(I)Lloader!kc;")
	private Interface12 method6118() {
		return this.anInterface12_1;
	}

	@OriginalMember(owner = "loader!gt", name = "a", descriptor = "(Ljava/lang/String;I)Lloader!lf;")
	private Class230 method6119(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		return arg1 == 0 ? this.method6109(0, 16, (byte) -99, 0, arg0) : (Class230) null;
	}

	@OriginalMember(owner = "loader!gt", name = "a", descriptor = "(ILjava/lang/Runnable;I)Lloader!lf;")
	private Class230 method6120(@OriginalArg(0) int arg0, @OriginalArg(1) Runnable arg1, @OriginalArg(2) int arg2) {
		if (arg2 != 26744) {
			aHashtable2 = null;
		}
		return this.method6109(arg0, 2, (byte) -121, 0, arg1);
	}

	@OriginalMember(owner = "loader!gt", name = "a", descriptor = "(IBIII)Lloader!lf;")
	private Class230 method6121(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return this.method6109(arg2 + (arg1 << 16), 6, (byte) -116, arg3 + (arg0 << 16), null);
	}

	@OriginalMember(owner = "loader!gt", name = "a", descriptor = "(Ljava/awt/datatransfer/Transferable;B)Lloader!lf;")
	private Class230 method6122(@OriginalArg(0) Transferable arg0) {
		return this.method6109(0, 19, (byte) -91, 0, arg0);
	}

	@OriginalMember(owner = "loader!gt", name = "a", descriptor = "(Ljava/lang/String;IZ)Lloader!lf;")
	private Class230 method6123(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (!arg2) {
			this.method6110(67);
		}
		return this.method6109(arg1, 1, (byte) -100, 0, arg0);
	}

	@OriginalMember(owner = "loader!gt", name = "a", descriptor = "(Ljava/net/URL;I)Lloader!lf;")
	private Class230 method6124(@OriginalArg(0) URL arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 0) {
			aLong219 = -44L;
		}
		return this.method6109(0, 4, (byte) -101, 0, arg0);
	}

	@OriginalMember(owner = "loader!gt", name = "b", descriptor = "(I)Lloader!lf;")
	private Class230 method6125(@OriginalArg(0) int arg0) {
		return arg0 == 2 ? this.method6109(0, 13, (byte) -90, 0, null) : (Class230) null;
	}

	@OriginalMember(owner = "loader!gt", name = "d", descriptor = "(I)V")
	private void method6126(@OriginalArg(0) int arg0) {
		if (arg0 != 27901) {
			aString74 = null;
		}
		aLong219 = Class231.method6141(arg0 ^ 0xFFFFD271) + 5000L;
	}

	@OriginalMember(owner = "loader!gt", name = "a", descriptor = "(BLjava/awt/Frame;)Lloader!lf;")
	private Class230 method6127(@OriginalArg(0) byte arg0, @OriginalArg(1) Frame arg1) {
		if (arg0 != 83) {
			this.method6130(-112, null, null, null);
		}
		return this.method6109(0, 7, (byte) -118, 0, arg1);
	}

	@OriginalMember(owner = "loader!gt", name = "a", descriptor = "(IB)Lloader!lf;")
	private Class230 method6128(@OriginalArg(0) int arg0) {
		return this.method6109(arg0, 3, (byte) -84, 0, null);
	}

	@OriginalMember(owner = "loader!gt", name = "a", descriptor = "(ILjava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;)Lloader!lf;")
	private Class230 method6130(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Class[] arg2, @OriginalArg(3) Class arg3) {
		if (arg0 != 0) {
			aString71 = null;
		}
		return this.method6109(0, 8, (byte) -89, 0, new Object[] { arg3, arg1, arg2 });
	}

	@OriginalMember(owner = "loader!gt", name = "a", descriptor = "(ILjava/lang/String;)[B")
	private byte[] method6131(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (arg0 != 7) {
			this.method6111(null, (byte) -87);
		}
		@Pc(16) Class230 local16 = this.method6106(arg1, 21, 0, 0, 0);
		return (byte[]) local16.anObject8;
	}

	@OriginalMember(owner = "loader!gt", name = "a", descriptor = "(Ljava/awt/Component;IBI)Lloader!lf;")
	private Class230 method6133(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) int arg3) {
		@Pc(2) Point local2 = arg0.getLocationOnScreen();
		if (arg2 != 97) {
			this.method6125(24);
		}
		return this.method6109(arg3 + local2.x, 14, (byte) -111, local2.y + arg1, null);
	}

	@OriginalMember(owner = "loader!gt", name = "a", descriptor = "(B)Lloader!lf;")
	private Class230 method6134() {
		return this.method6109(0, 5, (byte) -97, 0, null);
	}
}
