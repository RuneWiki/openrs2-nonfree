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

@OriginalClass("loader!kj")
public final class Class277 implements Runnable {

	@OriginalMember(owner = "loader!kj", name = "g", descriptor = "Ljava/lang/String;")
	private static String aString70;

	@OriginalMember(owner = "loader!kj", name = "k", descriptor = "Ljava/lang/String;")
	private static String aString71;

	@OriginalMember(owner = "loader!kj", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString72;

	@OriginalMember(owner = "loader!kj", name = "f", descriptor = "Ljava/lang/String;")
	private static String aString74;

	@OriginalMember(owner = "loader!kj", name = "a", descriptor = "Ljava/lang/String;")
	private static String aString75;

	@OriginalMember(owner = "loader!kj", name = "s", descriptor = "Ljava/lang/String;")
	private static String aString76;

	@OriginalMember(owner = "loader!kj", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString77;

	@OriginalMember(owner = "loader!kj", name = "y", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod3;

	@OriginalMember(owner = "loader!kj", name = "x", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod4;

	@OriginalMember(owner = "loader!kj", name = "h", descriptor = "I")
	private static int anInt7862 = 1;

	@OriginalMember(owner = "loader!kj", name = "t", descriptor = "Ljava/util/Hashtable;")
	private static Hashtable aHashtable4 = new Hashtable(16);

	@OriginalMember(owner = "loader!kj", name = "w", descriptor = "J")
	private static volatile long aLong232 = 0L;

	@OriginalMember(owner = "loader!kj", name = "z", descriptor = "Lloader!pu;")
	private Interface14 anInterface14_1;

	@OriginalMember(owner = "loader!kj", name = "c", descriptor = "Lloader!gu;")
	private Class274 aClass274_2 = null;

	@OriginalMember(owner = "loader!kj", name = "l", descriptor = "Lloader!jo;")
	private Class276 aClass276_1 = null;

	@OriginalMember(owner = "loader!kj", name = "e", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2 = null;

	@OriginalMember(owner = "loader!kj", name = "r", descriptor = "Z")
	private boolean aBoolean496 = false;

	@OriginalMember(owner = "loader!kj", name = "p", descriptor = "Lloader!jo;")
	private Class276 aClass276_2 = null;

	@OriginalMember(owner = "loader!kj", name = "d", descriptor = "Lloader!jo;")
	private Class276 aClass276_3 = null;

	@OriginalMember(owner = "loader!kj", name = "A", descriptor = "Lloader!gu;")
	private Class274 aClass274_3 = null;

	@OriginalMember(owner = "loader!kj", name = "j", descriptor = "Ljava/lang/String;")
	private final String aString73;

	@OriginalMember(owner = "loader!kj", name = "q", descriptor = "I")
	private int anInt7861;

	@OriginalMember(owner = "loader!kj", name = "o", descriptor = "Ljava/awt/EventQueue;")
	private EventQueue anEventQueue2;

	@OriginalMember(owner = "loader!kj", name = "b", descriptor = "[Lloader!jo;")
	private final Class276[] aClass276Array1;

	@OriginalMember(owner = "loader!kj", name = "u", descriptor = "Lloader!h;")
	private Class275 aClass275_1;

	@OriginalMember(owner = "loader!kj", name = "v", descriptor = "Lloader!d;")
	private Class271 aClass271_1;

	@OriginalMember(owner = "loader!kj", name = "m", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread4;

	@OriginalMember(owner = "loader!kj", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;I)Lloader!jo;")
	private static Class276 method6143(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		@Pc(17) String local17;
		if (arg2 == 33) {
			local17 = "jagex_" + arg1 + "_preferences" + arg0 + "_rc.dat";
		} else if (arg2 == 34) {
			local17 = "jagex_" + arg1 + "_preferences" + arg0 + "_wip.dat";
		} else {
			local17 = "jagex_" + arg1 + "_preferences" + arg0 + ".dat";
		}
		@Pc(100) String[] local100 = new String[] { "c:/rscache/", "/rscache/", aString76, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(102) int local102 = 0; local102 < local100.length; local102++) {
			@Pc(114) String local114 = local100[local102];
			if (local114.length() <= 0 || (new File(local114)).exists()) {
				try {
					return new Class276(new File(local114, local17), "rw", 10000L);
				} catch (@Pc(140) Exception local140) {
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "loader!kj", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;I)Ljava/io/File;")
	private static File method6150(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		@Pc(4) File local4 = (File) aHashtable4.get(arg2);
		if (local4 != null) {
			return local4;
		}
		@Pc(44) String[] local44 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString76, "/tmp/", "" };
		@Pc(69) String[] local69 = new String[] { ".jagex_cache_" + arg1, ".file_store_" + arg1 };
		for (@Pc(71) int local71 = 0; local71 < 2; local71++) {
			for (@Pc(76) int local76 = 0; local76 < local69.length; local76++) {
				for (@Pc(82) int local82 = 0; local82 < local44.length; local82++) {
					@Pc(117) String local117 = local44[local82] + local69[local76] + "/" + (arg0 == null ? "" : arg0 + "/") + arg2;
					@Pc(119) RandomAccessFile local119 = null;
					try {
						@Pc(124) File local124 = new File(local117);
						if (local71 != 0 || local124.exists()) {
							@Pc(137) String local137 = local44[local82];
							if (local71 != 1 || local137.length() <= 0 || (new File(local137)).exists()) {
								(new File(local44[local82] + local69[local76])).mkdir();
								if (arg0 != null) {
									(new File(local44[local82] + local69[local76] + "/" + arg0)).mkdir();
								}
								local119 = new RandomAccessFile(local124, "rw");
								@Pc(204) int local204 = local119.read();
								local119.seek(0L);
								local119.write(local204);
								local119.seek(0L);
								local119.close();
								aHashtable4.put(arg2, local124);
								return local124;
							}
						}
					} catch (@Pc(223) Exception local223) {
						try {
							if (local119 != null) {
								local119.close();
							}
						} catch (@Pc(232) Exception local232) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "loader!kj", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class277(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		this.aString73 = arg2;
		aString77 = "Unknown";
		this.anApplet2 = arg0;
		this.anInt7861 = arg1;
		aString72 = "1.1";
		try {
			aString77 = System.getProperty("java.vendor");
			aString72 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			aString70 = System.getProperty("os.name");
		} catch (@Pc(48) Exception local48) {
			aString70 = "Unknown";
		}
		aString74 = aString70.toLowerCase();
		try {
			aString71 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(59) Exception local59) {
			aString71 = "";
		}
		try {
			aString75 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(67) Exception local67) {
			aString75 = "";
		}
		try {
			aString76 = System.getProperty("user.home");
			if (aString76 != null) {
				aString76 = aString76 + "/";
			}
		} catch (@Pc(87) Exception local87) {
		}
		if (aString76 == null) {
			aString76 = "~/";
		}
		try {
			this.anEventQueue2 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(99) Throwable local99) {
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
		} catch (@Pc(153) Exception local153) {
		}
		this.aClass276_3 = new Class276(method6150(null, this.anInt7861, "random.dat"), "rw", 25L);
		this.aClass276_1 = new Class276(this.method6146("main_file_cache.dat2"), "rw", 209715200L);
		this.aClass276_2 = new Class276(this.method6146("main_file_cache.idx255"), "rw", 1048576L);
		this.aClass276Array1 = new Class276[arg3];
		for (@Pc(194) int local194 = 0; local194 < arg3; local194++) {
			this.aClass276Array1[local194] = new Class276(this.method6146("main_file_cache.idx" + local194), "rw", 1048576L);
		}
		try {
			this.aClass275_1 = new Class275();
		} catch (@Pc(230) Throwable local230) {
		}
		try {
			this.aClass271_1 = new Class271();
		} catch (@Pc(237) Throwable local237) {
		}
		@Pc(240) ThreadGroup local240 = Thread.currentThread().getThreadGroup();
		for (@Pc(243) ThreadGroup local243 = local240.getParent(); local243 != null; local243 = local243.getParent()) {
			local240 = local243;
		}
		@Pc(254) Thread[] local254 = new Thread[1000];
		local240.enumerate(local254);
		for (@Pc(260) int local260 = 0; local260 < local254.length; local260++) {
			if (local254[local260] != null && local254[local260].getName().startsWith("AWT")) {
				local254[local260].setPriority(1);
			}
		}
		this.aBoolean496 = false;
		this.aThread4 = new Thread(this);
		this.aThread4.setPriority(10);
		this.aThread4.setDaemon(true);
		this.aThread4.start();
	}

	@OriginalMember(owner = "loader!kj", name = "a", descriptor = "(BLjava/lang/String;)Lloader!gu;")
	private Class274 method6125(@OriginalArg(0) byte arg0, @OriginalArg(1) String arg1) {
		if (arg0 < 37) {
			this.method6148((byte) 110);
		}
		return this.method6126(-2122504624, arg1, 0, 0, 12);
	}

	@OriginalMember(owner = "loader!kj", name = "a", descriptor = "(ILjava/lang/Object;III)Lloader!gu;")
	private Class274 method6126(@OriginalArg(0) int arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(3) Class274 local3 = new Class274();
		if (arg0 != -2122504624) {
			this.aBoolean496 = true;
		}
		local3.anInt7860 = arg2;
		local3.anObject13 = arg1;
		local3.anInt7859 = arg4;
		local3.anInt7858 = arg3;
		synchronized (this) {
			if (this.aClass274_2 == null) {
				this.aClass274_2 = this.aClass274_3 = local3;
			} else {
				this.aClass274_2.aClass274_1 = local3;
				this.aClass274_2 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "loader!kj", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(16) Class274 local16;
			synchronized (this) {
				while (true) {
					if (this.aBoolean496) {
						return;
					}
					if (this.aClass274_3 != null) {
						local16 = this.aClass274_3;
						this.aClass274_3 = this.aClass274_3.aClass274_1;
						if (this.aClass274_3 == null) {
							this.aClass274_2 = null;
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
				@Pc(45) int local45 = local16.anInt7859;
				if (local45 == 1) {
					if (aLong232 > Class272.method6113()) {
						throw new IOException();
					}
					local16.anObject12 = new Socket(InetAddress.getByName((String) local16.anObject13), local16.anInt7858);
				} else if (local45 == 2) {
					@Pc(672) Thread local672 = new Thread((Runnable) local16.anObject13);
					local672.setDaemon(true);
					local672.start();
					local672.setPriority(local16.anInt7858);
					local16.anObject12 = local672;
				} else if (local45 == 4) {
					if (Class272.method6113() < aLong232) {
						throw new IOException();
					}
					local16.anObject12 = new DataInputStream(((URL) local16.anObject13).openStream());
				} else {
					@Pc(92) Object[] local92;
					if (local45 == 8) {
						local92 = (Object[]) local16.anObject13;
						if (((Class) local92[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local16.anObject12 = ((Class) local92[0]).getDeclaredMethod((String) local92[1], (Class[]) local92[2]);
					} else if (local45 == 9) {
						local92 = (Object[]) local16.anObject13;
						if (((Class) local92[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local16.anObject12 = ((Class) local92[0]).getDeclaredField((String) local92[1]);
					} else if (local45 == 18) {
						@Pc(607) Clipboard local607 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local16.anObject12 = local607.getContents(null);
					} else if (local45 == 19) {
						@Pc(596) Transferable local596 = (Transferable) local16.anObject13;
						@Pc(599) Clipboard local599 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local599.setContents(local596, null);
					} else {
						@Pc(173) String local173;
						if (local45 == 3) {
							if (aLong232 > Class272.method6113()) {
								throw new IOException();
							}
							local173 = (local16.anInt7858 >> 24 & 0xFF) + "." + (local16.anInt7858 >> 16 & 0xFF) + "." + (local16.anInt7858 >> 8 & 0xFF) + "." + (local16.anInt7858 & 0xFF);
							local16.anObject12 = InetAddress.getByName(local173).getHostName();
						} else if (local45 == 21) {
							if (Class272.method6113() < aLong232) {
								throw new IOException();
							}
							local16.anObject12 = InetAddress.getByName((String) local16.anObject13).getAddress();
						} else if (local45 == 5) {
							local16.anObject12 = this.aClass275_1.method6115();
						} else if (local45 == 6) {
							@Pc(200) Frame local200 = new Frame("Jagex Full Screen");
							local16.anObject12 = local200;
							local200.setResizable(false);
							this.aClass275_1.method6117(local200, local16.anInt7858 >>> 16, local16.anInt7860 & 0xFFFF, local16.anInt7858 & 0xFFFF, local16.anInt7860 >> 16);
						} else if (local45 == 7) {
							this.aClass275_1.method6116();
						} else {
							@Pc(254) int local254;
							if (local45 == 11) {
								@Pc(241) Field local241 = Class.forName("java.lang.ClassLoader").getDeclaredField("nativeLibraries");
								local241.setAccessible(true);
								@Pc(252) Vector local252 = (Vector) local241.get(((Class) local16.anObject13).getClassLoader());
								for (local254 = 0; local254 < local252.size(); local254++) {
									@Pc(266) Object local266 = local252.elementAt(local254);
									@Pc(273) Method local273 = local266.getClass().getDeclaredMethod("finalize");
									local273.setAccessible(true);
									local273.invoke(local266);
									local273.setAccessible(false);
									@Pc(290) Field local290 = local266.getClass().getDeclaredField("handle");
									local290.setAccessible(true);
									local290.set(local266, Integer.valueOf(0));
									local290.setAccessible(false);
								}
								local241.setAccessible(false);
							} else if (local45 == 12) {
								@Pc(566) Class276 local566 = method6143((String) local16.anObject13, this.aString73, this.anInt7861);
								local16.anObject12 = local566;
							} else if (local45 == 14) {
								@Pc(322) int local322 = local16.anInt7858;
								@Pc(325) int local325 = local16.anInt7860;
								this.aClass271_1.method6109(local325, local322);
							} else if (local45 == 15) {
								@Pc(347) boolean local347 = local16.anInt7858 != 0;
								@Pc(351) Component local351 = (Component) local16.anObject13;
								this.aClass271_1.method6107(local347, local351);
							} else if (local45 == 17) {
								local92 = (Object[]) local16.anObject13;
								this.aClass271_1.method6108((int[]) local92[1], local16.anInt7860, (Point) local92[2], local16.anInt7858, (Component) local92[0]);
							} else if (local45 == 16) {
								try {
									if (!aString74.startsWith("win")) {
										throw new Exception();
									}
									local173 = (String) local16.anObject13;
									if (!local173.startsWith("http://") && !local173.startsWith("https://")) {
										throw new Exception();
									}
									@Pc(418) String local418 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
									for (local254 = 0; local173.length() > local254; local254++) {
										if (local418.indexOf(local173.charAt(local254)) == -1) {
											throw new Exception();
										}
									}
									Runtime.getRuntime().exec("cmd /c start \"j\" \"" + local173 + "\"");
									local16.anObject12 = null;
								} catch (@Pc(459) Exception local459) {
									local16.anObject12 = local459;
									throw local459;
								}
							} else if (local45 == 20) {
								try {
									@Pc(480) Class[] local480 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
									@Pc(482) Runtime local482 = Runtime.getRuntime();
									@Pc(488) Method local488 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local480);
									local488.setAccessible(true);
									if (aString74.startsWith("win")) {
										if (aString71.startsWith("amd64") || aString71.startsWith("x86_64")) {
											local488.invoke(local482, local16.anObject13, this.method6146("jagmisc64.dll").toString());
										} else {
											local488.invoke(local482, local16.anObject13, this.method6146("jagmisc.dll").toString());
										}
									}
									local488.setAccessible(false);
								} catch (@Pc(547) Throwable local547) {
									local16.anObject12 = local547;
								}
							} else {
								throw new Exception("");
							}
						}
					}
				}
				local16.anInt7857 = 1;
			} catch (@Pc(689) ThreadDeath local689) {
				throw local689;
			} catch (@Pc(692) Throwable local692) {
				local16.anInt7857 = 2;
			}
			synchronized (local16) {
				local16.notify();
			}
		}
	}

	@OriginalMember(owner = "loader!kj", name = "a", descriptor = "(BLjava/lang/Class;)Lloader!gu;")
	private Class274 method6127(@OriginalArg(0) byte arg0, @OriginalArg(1) Class arg1) {
		if (arg0 != 28) {
			aLong232 = 118L;
		}
		return this.method6126(-2122504624, arg1, 0, 0, 11);
	}

	@OriginalMember(owner = "loader!kj", name = "a", descriptor = "(ILjava/lang/String;)Lloader!gu;")
	private Class274 method6128(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		return arg0 < 87 ? (Class274) null : this.method6126(-2122504624, arg1, 0, 0, 21);
	}

	@OriginalMember(owner = "loader!kj", name = "a", descriptor = "(Ljava/awt/Frame;B)Lloader!gu;")
	private Class274 method6129(@OriginalArg(0) Frame arg0, @OriginalArg(1) byte arg1) {
		if (arg1 != 12) {
			aString71 = null;
		}
		return this.method6126(-2122504624, arg0, 0, 0, 7);
	}

	@OriginalMember(owner = "loader!kj", name = "a", descriptor = "(Z)Lloader!gu;")
	private Class274 method6130(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.anInt7861 = -61;
		}
		return this.method6126(-2122504624, null, 0, 0, 5);
	}

	@OriginalMember(owner = "loader!kj", name = "a", descriptor = "(Ljava/lang/Class;ILjava/lang/String;)Lloader!gu;")
	private Class274 method6131(@OriginalArg(0) Class arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		return arg1 == 0 ? this.method6126(arg1 - 2122504624, new Object[] { arg0, arg2 }, 0, 0, 9) : (Class274) null;
	}

	@OriginalMember(owner = "loader!kj", name = "a", descriptor = "(Ljava/awt/Component;III)Lloader!gu;")
	private Class274 method6132(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) Point local2 = arg0.getLocationOnScreen();
		if (arg3 != 0) {
			this.method6132(null, -124, 25, -52);
		}
		return this.method6126(-2122504624, null, local2.y + arg2, local2.x + arg1, 14);
	}

	@OriginalMember(owner = "loader!kj", name = "b", descriptor = "(BLjava/lang/Class;)V")
	private void method6133(@OriginalArg(0) byte arg0, @OriginalArg(1) Class arg1) throws Exception {
		@Pc(12) Class[] local12 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
		@Pc(14) Runtime local14 = Runtime.getRuntime();
		@Pc(25) Method local25 = Class.forName("java.lang.reflect.Method").getMethod("setAccessible", Boolean.TYPE);
		@Pc(36) Method local36;
		if (!aString74.startsWith("mac")) {
			local36 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", local12);
			local25.invoke(local36, Boolean.TRUE);
			local36.invoke(local14, arg1, "jawt");
			local25.invoke(local36, Boolean.FALSE);
		}
		if (arg0 > -58) {
			aString74 = null;
		}
		local36 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local12);
		local25.invoke(local36, Boolean.TRUE);
		if (!aString74.startsWith("win")) {
			throw new Exception();
		}
		local36.invoke(local14, arg1, this.method6146("sw3d.dll").toString());
		local25.invoke(local36, Boolean.FALSE);
	}

	@OriginalMember(owner = "loader!kj", name = "a", descriptor = "(Ljava/lang/String;I)Lloader!gu;")
	private Class274 method6134(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (arg1 < 92) {
			this.method6146(null);
		}
		return this.method6126(-2122504624, arg0, 0, 0, 16);
	}

	@OriginalMember(owner = "loader!kj", name = "a", descriptor = "([Ljava/lang/Class;ILjava/lang/String;Ljava/lang/Class;)Lloader!gu;")
	private Class274 method6135(@OriginalArg(0) Class[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) Class arg3) {
		return arg1 == -8413 ? this.method6126(-2122504624, new Object[] { arg3, arg2, arg0 }, 0, 0, 8) : (Class274) null;
	}

	@OriginalMember(owner = "loader!kj", name = "a", descriptor = "(ZILjava/lang/String;)Lloader!gu;")
	private Class274 method6136(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		return arg0 ? this.method6126(-2122504624, arg2, 0, arg1, 1) : (Class274) null;
	}

	@OriginalMember(owner = "loader!kj", name = "a", descriptor = "(IBIII)Lloader!gu;")
	private Class274 method6137(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return this.method6126(-2122504624, null, arg1 + (arg2 << 16), (arg3 << 16) + arg0, 6);
	}

	@OriginalMember(owner = "loader!kj", name = "b", descriptor = "(B)Z")
	private boolean method6138(@OriginalArg(0) byte arg0) {
		if (arg0 > -14) {
			this.method6145(88, null, (byte) -104);
		}
		return this.aClass275_1 != null;
	}

	@OriginalMember(owner = "loader!kj", name = "a", descriptor = "(ZLjava/net/URL;)Lloader!gu;")
	private Class274 method6139(@OriginalArg(0) boolean arg0, @OriginalArg(1) URL arg1) {
		if (!arg0) {
			this.method6142(100, -83, 70, -93, null);
		}
		return this.method6126(-2122504624, arg1, 0, 0, 4);
	}

	@OriginalMember(owner = "loader!kj", name = "c", descriptor = "(B)V")
	private void method6140(@OriginalArg(0) byte arg0) {
		synchronized (this) {
			this.aBoolean496 = true;
			this.notifyAll();
			if (arg0 != -79) {
				this.method6154((byte) -68);
			}
		}
		try {
			this.aThread4.join();
		} catch (@Pc(28) InterruptedException local28) {
		}
		if (this.aClass276_1 != null) {
			try {
				this.aClass276_1.method6121();
			} catch (@Pc(39) IOException local39) {
			}
		}
		if (this.aClass276_2 != null) {
			try {
				this.aClass276_2.method6121();
			} catch (@Pc(48) IOException local48) {
			}
		}
		if (this.aClass276Array1 != null) {
			for (@Pc(54) int local54 = 0; local54 < this.aClass276Array1.length; local54++) {
				if (this.aClass276Array1[local54] != null) {
					try {
						this.aClass276Array1[local54].method6121();
					} catch (@Pc(76) IOException local76) {
					}
				}
			}
		}
		if (this.aClass276_3 != null) {
			try {
				this.aClass276_3.method6121();
			} catch (@Pc(88) IOException local88) {
			}
		}
	}

	@OriginalMember(owner = "loader!kj", name = "a", descriptor = "(Ljava/lang/String;B)[B")
	private byte[] method6141(@OriginalArg(0) String arg0, @OriginalArg(1) byte arg1) {
		@Pc(7) Class274 local7 = this.method6142(21, 0, 0, 23632, arg0);
		if (arg1 != -16) {
			aString76 = null;
		}
		return (byte[]) local7.anObject12;
	}

	@OriginalMember(owner = "loader!kj", name = "a", descriptor = "(IIIILjava/lang/Object;)Lloader!gu;")
	private Class274 method6142(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Object arg4) {
		@Pc(3) Class274 local3 = new Class274();
		synchronized (local3) {
			local3.anObject13 = arg4;
			local3.anInt7858 = arg2;
			local3.anInt7859 = arg0;
			local3.anInt7860 = arg1;
			synchronized (this) {
				if (this.aClass274_2 == null) {
					this.aClass274_2 = this.aClass274_3 = local3;
				} else {
					this.aClass274_2.aClass274_1 = local3;
					this.aClass274_2 = local3;
				}
				this.notify();
			}
			try {
				local3.wait();
			} catch (@Pc(54) InterruptedException local54) {
			}
			if (arg3 != 23632) {
				aString70 = null;
			}
			return local3;
		}
	}

	@OriginalMember(owner = "loader!kj", name = "a", descriptor = "(I)V")
	private void method6144(@OriginalArg(0) int arg0) {
		aLong232 = Class272.method6113() + 5000L;
		if (arg0 != -11384) {
			anInt7862 = -91;
		}
	}

	@OriginalMember(owner = "loader!kj", name = "a", descriptor = "(ILjava/lang/Runnable;B)Lloader!gu;")
	private Class274 method6145(@OriginalArg(0) int arg0, @OriginalArg(1) Runnable arg1, @OriginalArg(2) byte arg2) {
		if (arg2 != 32) {
			aString75 = null;
		}
		return this.method6126(-2122504624, arg1, 0, arg0, 2);
	}

	@OriginalMember(owner = "loader!kj", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/io/File;")
	public File method6146(@OriginalArg(1) String arg0) {
		return method6150(this.aString73, this.anInt7861, arg0);
	}

	@OriginalMember(owner = "loader!kj", name = "a", descriptor = "(Ljava/awt/Component;Ljava/awt/Point;II[II)Lloader!gu;")
	private Class274 method6147(@OriginalArg(0) Component arg0, @OriginalArg(1) Point arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5) {
		return arg3 == 21124 ? this.method6126(-2122504624, new Object[] { arg0, arg4, arg1 }, arg5, arg2, 17) : (Class274) null;
	}

	@OriginalMember(owner = "loader!kj", name = "d", descriptor = "(B)Lloader!pu;")
	private Interface14 method6148(@OriginalArg(0) byte arg0) {
		if (arg0 != -42) {
			aMethod3 = null;
		}
		return this.anInterface14_1;
	}

	@OriginalMember(owner = "loader!kj", name = "a", descriptor = "(Ljava/awt/Component;BZ)Lloader!gu;")
	private Class274 method6149(@OriginalArg(0) Component arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) boolean arg2) {
		if (arg1 != -98) {
			this.method6128(50, null);
		}
		return this.method6126(arg1 ^ 0x7E82D9CE, arg0, 0, arg2 ? 1 : 0, 15);
	}

	@OriginalMember(owner = "loader!kj", name = "a", descriptor = "(Ljava/lang/Class;I)Lloader!gu;")
	private Class274 method6151(@OriginalArg(0) Class arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 0) {
			this.method6128(-34, null);
		}
		return this.method6126(-2122504624, arg0, 0, 0, 20);
	}

	@OriginalMember(owner = "loader!kj", name = "a", descriptor = "(Ljava/awt/datatransfer/Transferable;I)Lloader!gu;")
	private Class274 method6152(@OriginalArg(0) Transferable arg0, @OriginalArg(1) int arg1) {
		if (arg1 != -13915) {
			aString77 = null;
		}
		return this.method6126(-2122504624, arg0, 0, 0, 19);
	}

	@OriginalMember(owner = "loader!kj", name = "a", descriptor = "(II)Lloader!gu;")
	private Class274 method6153(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 0) {
			aHashtable4 = null;
		}
		return this.method6126(-2122504624, null, 0, arg0, 3);
	}

	@OriginalMember(owner = "loader!kj", name = "a", descriptor = "(B)Lloader!gu;")
	private Class274 method6154(@OriginalArg(0) byte arg0) {
		return arg0 == 71 ? this.method6126(-2122504624, null, 0, 0, 18) : (Class274) null;
	}
}
