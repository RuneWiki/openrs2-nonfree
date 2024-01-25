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

@OriginalClass("loader!sc")
public final class Class231 implements Runnable {

	@OriginalMember(owner = "loader!sc", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString79;

	@OriginalMember(owner = "loader!sc", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString80;

	@OriginalMember(owner = "loader!sc", name = "r", descriptor = "Ljava/lang/String;")
	private static String aString81;

	@OriginalMember(owner = "loader!sc", name = "d", descriptor = "Ljava/lang/String;")
	private static String aString82;

	@OriginalMember(owner = "loader!sc", name = "A", descriptor = "Ljava/lang/String;")
	private static String aString84;

	@OriginalMember(owner = "loader!sc", name = "k", descriptor = "Ljava/lang/String;")
	private static String aString85;

	@OriginalMember(owner = "loader!sc", name = "i", descriptor = "Ljava/lang/String;")
	private static String aString86;

	@OriginalMember(owner = "loader!sc", name = "v", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod3;

	@OriginalMember(owner = "loader!sc", name = "t", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod4;

	@OriginalMember(owner = "loader!sc", name = "n", descriptor = "I")
	private static final int anInt7050 = 1;

	@OriginalMember(owner = "loader!sc", name = "w", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable2 = new Hashtable(16);

	@OriginalMember(owner = "loader!sc", name = "u", descriptor = "J")
	private static volatile long aLong222 = 0L;

	@OriginalMember(owner = "loader!sc", name = "p", descriptor = "Lloader!ea;")
	private Interface12 anInterface12_1;

	@OriginalMember(owner = "loader!sc", name = "f", descriptor = "Lloader!bl;")
	private Class227 aClass227_2 = null;

	@OriginalMember(owner = "loader!sc", name = "l", descriptor = "Lloader!bl;")
	private Class227 aClass227_3 = null;

	@OriginalMember(owner = "loader!sc", name = "s", descriptor = "Lloader!vn;")
	private Class232 aClass232_1 = null;

	@OriginalMember(owner = "loader!sc", name = "q", descriptor = "Lloader!vn;")
	private Class232 aClass232_2 = null;

	@OriginalMember(owner = "loader!sc", name = "h", descriptor = "Lloader!vn;")
	private Class232 aClass232_3 = null;

	@OriginalMember(owner = "loader!sc", name = "x", descriptor = "Z")
	private boolean aBoolean630 = false;

	@OriginalMember(owner = "loader!sc", name = "m", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3 = null;

	@OriginalMember(owner = "loader!sc", name = "z", descriptor = "Ljava/lang/String;")
	private final String aString83;

	@OriginalMember(owner = "loader!sc", name = "o", descriptor = "I")
	private int anInt7051;

	@OriginalMember(owner = "loader!sc", name = "c", descriptor = "Ljava/awt/EventQueue;")
	private EventQueue anEventQueue2;

	@OriginalMember(owner = "loader!sc", name = "b", descriptor = "[Lloader!vn;")
	private Class232[] aClass232Array1;

	@OriginalMember(owner = "loader!sc", name = "y", descriptor = "Lloader!f;")
	private Class229 aClass229_1;

	@OriginalMember(owner = "loader!sc", name = "g", descriptor = "Lloader!b;")
	private Class225 aClass225_1;

	@OriginalMember(owner = "loader!sc", name = "j", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread4;

	@OriginalMember(owner = "loader!sc", name = "a", descriptor = "(Ljava/lang/String;II)Lloader!vn;")
	private static Class232 method5932(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(16) String local16;
		if (arg1 == 33) {
			local16 = "jagex_" + arg0 + "_preferences2_rc.dat";
		} else if (arg1 == 34) {
			local16 = "jagex_" + arg0 + "_preferences2_wip.dat";
		} else {
			local16 = "jagex_" + arg0 + "_preferences2.dat";
		}
		@Pc(75) String[] local75 = new String[] { "c:/rscache/", "/rscache/", aString84, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(83) int local83 = 0; local83 < local75.length; local83++) {
			@Pc(91) String local91 = local75[local83];
			if (local91.length() <= 0 || (new File(local91)).exists()) {
				try {
					return new Class232(new File(local91, local16), "rw", 10000L);
				} catch (@Pc(115) Exception local115) {
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "loader!sc", name = "a", descriptor = "(BLjava/lang/String;ILjava/lang/String;)Ljava/io/File;")
	private static File method5934(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		@Pc(4) File local4 = (File) aHashtable2.get(arg0);
		if (local4 != null) {
			return local4;
		}
		@Pc(52) String[] local52 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString84, "/tmp/", "" };
		@Pc(77) String[] local77 = new String[] { ".jagex_cache_" + arg1, ".file_store_" + arg1 };
		for (@Pc(79) int local79 = 0; local79 < 2; local79++) {
			for (@Pc(84) int local84 = 0; local84 < local77.length; local84++) {
				for (@Pc(94) int local94 = 0; local94 < local52.length; local94++) {
					@Pc(133) String local133 = local52[local94] + local77[local84] + "/" + (arg2 == null ? "" : arg2 + "/") + arg0;
					@Pc(135) RandomAccessFile local135 = null;
					try {
						@Pc(140) File local140 = new File(local133);
						if (local79 != 0 || local140.exists()) {
							@Pc(151) String local151 = local52[local94];
							if (local79 != 1 || local151.length() <= 0 || (new File(local151)).exists()) {
								(new File(local52[local94] + local77[local84])).mkdir();
								if (arg2 != null) {
									(new File(local52[local94] + local77[local84] + "/" + arg2)).mkdir();
								}
								local135 = new RandomAccessFile(local140, "rw");
								@Pc(218) int local218 = local135.read();
								local135.seek(0L);
								local135.write(local218);
								local135.seek(0L);
								local135.close();
								aHashtable2.put(arg0, local140);
								return local140;
							}
						}
					} catch (@Pc(237) Exception local237) {
						try {
							if (local135 != null) {
								local135.close();
							}
						} catch (@Pc(246) Exception local246) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "loader!sc", name = "a", descriptor = "(Ljava/lang/String;IB)Lloader!vn;")
	private static Class232 method5944(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(18) String local18;
		if (arg1 == 33) {
			local18 = "jagex_" + arg0 + "_preferences_rc.dat";
		} else if (arg1 == 34) {
			local18 = "jagex_" + arg0 + "_preferences_wip.dat";
		} else {
			local18 = "jagex_" + arg0 + "_preferences.dat";
		}
		@Pc(77) String[] local77 = new String[] { "c:/rscache/", "/rscache/", aString84, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(85) int local85 = 0; local85 < local77.length; local85++) {
			@Pc(93) String local93 = local77[local85];
			if (local93.length() <= 0 || (new File(local93)).exists()) {
				try {
					return new Class232(new File(local93, local18), "rw", 10000L);
				} catch (@Pc(117) Exception local117) {
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "loader!sc", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class231(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		aString79 = "1.1";
		this.aString83 = arg2;
		this.anApplet3 = arg0;
		this.anInt7051 = arg1;
		aString80 = "Unknown";
		try {
			aString80 = System.getProperty("java.vendor");
			aString79 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			aString81 = System.getProperty("os.name");
		} catch (@Pc(48) Exception local48) {
			aString81 = "Unknown";
		}
		aString82 = aString81.toLowerCase();
		try {
			aString85 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(59) Exception local59) {
			aString85 = "";
		}
		try {
			aString86 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(67) Exception local67) {
			aString86 = "";
		}
		try {
			aString84 = System.getProperty("user.home");
			if (aString84 != null) {
				aString84 = aString84 + "/";
			}
		} catch (@Pc(85) Exception local85) {
		}
		if (aString84 == null) {
			aString84 = "~/";
		}
		try {
			this.anEventQueue2 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(97) Throwable local97) {
		}
		try {
			if (arg0 == null) {
				aMethod4 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				aMethod4 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(124) Exception local124) {
		}
		try {
			if (arg0 == null) {
				aMethod3 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				aMethod3 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(152) Exception local152) {
		}
		this.aClass232_1 = new Class232(method5934("random.dat", this.anInt7051, null), "rw", 25L);
		this.aClass232_2 = new Class232(this.method5952("main_file_cache.dat2"), "rw", 209715200L);
		this.aClass232_3 = new Class232(this.method5952("main_file_cache.idx255"), "rw", 1048576L);
		this.aClass232Array1 = new Class232[arg3];
		for (@Pc(193) int local193 = 0; local193 < arg3; local193++) {
			this.aClass232Array1[local193] = new Class232(this.method5952("main_file_cache.idx" + local193), "rw", 1048576L);
		}
		try {
			this.aClass229_1 = new Class229();
		} catch (@Pc(225) Throwable local225) {
		}
		try {
			this.aClass225_1 = new Class225();
		} catch (@Pc(232) Throwable local232) {
		}
		@Pc(235) ThreadGroup local235 = Thread.currentThread().getThreadGroup();
		for (@Pc(238) ThreadGroup local238 = local235.getParent(); local238 != null; local238 = local238.getParent()) {
			local235 = local238;
		}
		@Pc(249) Thread[] local249 = new Thread[1000];
		local235.enumerate(local249);
		for (@Pc(255) int local255 = 0; local255 < local249.length; local255++) {
			if (local249[local255] != null && local249[local255].getName().startsWith("AWT")) {
				local249[local255].setPriority(1);
			}
		}
		this.aBoolean630 = false;
		this.aThread4 = new Thread(this);
		this.aThread4.setPriority(10);
		this.aThread4.setDaemon(true);
		this.aThread4.start();
	}

	@OriginalMember(owner = "loader!sc", name = "a", descriptor = "(Ljava/net/URL;B)Lloader!bl;")
	private Class227 method5922(@OriginalArg(0) URL arg0, @OriginalArg(1) byte arg1) {
		if (arg1 != 65) {
			this.method5940(124, null, null);
		}
		return this.method5947(0, 0, arg0, 4, 0);
	}

	@OriginalMember(owner = "loader!sc", name = "a", descriptor = "(IZ)Lloader!bl;")
	private Class227 method5923(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (arg1) {
			aString82 = null;
		}
		return this.method5947(arg0, 0, null, 3, 0);
	}

	@OriginalMember(owner = "loader!sc", name = "a", descriptor = "(Ljava/awt/Component;IZ)Lloader!bl;")
	private Class227 method5924(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (arg1 != 15) {
			aString82 = null;
		}
		return this.method5947(arg2 ? 1 : 0, 0, arg0, 15, 0);
	}

	@OriginalMember(owner = "loader!sc", name = "a", descriptor = "(BILjava/lang/String;)Lloader!bl;")
	private Class227 method5925(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		if (arg0 != -71) {
			this.aBoolean630 = true;
		}
		return this.method5947(arg1, 0, arg2, 1, 0);
	}

	@OriginalMember(owner = "loader!sc", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(18) Class227 local18;
			synchronized (this) {
				while (true) {
					if (this.aBoolean630) {
						return;
					}
					if (this.aClass227_3 != null) {
						local18 = this.aClass227_3;
						this.aClass227_3 = this.aClass227_3.aClass227_1;
						if (this.aClass227_3 == null) {
							this.aClass227_2 = null;
						}
						break;
					}
					try {
						this.wait();
					} catch (@Pc(34) InterruptedException local34) {
					}
				}
			}
			try {
				@Pc(46) int local46 = local18.anInt7041;
				if (local46 == 1) {
					if (aLong222 > Class226.method5898()) {
						throw new IOException();
					}
					local18.anObject9 = new Socket(InetAddress.getByName((String) local18.anObject8), local18.anInt7038);
				} else if (local46 == 2) {
					@Pc(84) Thread local84 = new Thread((Runnable) local18.anObject8);
					local84.setDaemon(true);
					local84.start();
					local84.setPriority(local18.anInt7038);
					local18.anObject9 = local84;
				} else if (local46 == 4) {
					if (aLong222 > Class226.method5898()) {
						throw new IOException();
					}
					local18.anObject9 = new DataInputStream(((URL) local18.anObject8).openStream());
				} else {
					@Pc(112) Object[] local112;
					if (local46 == 8) {
						local112 = (Object[]) local18.anObject8;
						if (((Class) local112[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local18.anObject9 = ((Class) local112[0]).getDeclaredMethod((String) local112[1], (Class[]) local112[2]);
					} else if (local46 == 9) {
						local112 = (Object[]) local18.anObject8;
						if (((Class) local112[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local18.anObject9 = ((Class) local112[0]).getDeclaredField((String) local112[1]);
					} else if (local46 == 18) {
						@Pc(150) Clipboard local150 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local18.anObject9 = local150.getContents(null);
					} else if (local46 == 19) {
						@Pc(839) Transferable local839 = (Transferable) local18.anObject8;
						@Pc(842) Clipboard local842 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local842.setContents(local839, null);
					} else {
						@Pc(212) String local212;
						if (local46 == 3) {
							if (Class226.method5898() < aLong222) {
								throw new IOException();
							}
							local212 = (local18.anInt7038 >> 24 & 0xFF) + "." + (local18.anInt7038 >> 16 & 0xFF) + "." + (local18.anInt7038 >> 8 & 0xFF) + "." + (local18.anInt7038 & 0xFF);
							local18.anObject9 = InetAddress.getByName(local212).getHostName();
						} else if (local46 == 21) {
							if (Class226.method5898() < aLong222) {
								throw new IOException();
							}
							local18.anObject9 = InetAddress.getByName((String) local18.anObject8).getAddress();
						} else if (local46 == 5) {
							local18.anObject9 = this.aClass229_1.method5914();
						} else if (local46 == 6) {
							@Pc(263) Frame local263 = new Frame("Jagex Full Screen");
							local18.anObject9 = local263;
							local263.setResizable(false);
							this.aClass229_1.method5912(local18.anInt7038 >>> 16, local263, local18.anInt7038 & 0xFFFF, local18.anInt7040 >> 16, local18.anInt7040 & 0xFFFF);
						} else if (local46 == 7) {
							this.aClass229_1.method5913();
						} else {
							@Pc(551) Method local551;
							@Pc(543) Class[] local543;
							@Pc(545) Runtime local545;
							if (local46 == 10) {
								local543 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
								local545 = Runtime.getRuntime();
								if (!aString82.startsWith("mac")) {
									local551 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", local543);
									local551.setAccessible(true);
									local551.invoke(local545, local18.anObject8, "jawt");
									local551.setAccessible(false);
								}
								local551 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local543);
								local551.setAccessible(true);
								if (aString82.startsWith("linux") || aString82.startsWith("sunos")) {
									local551.invoke(local545, local18.anObject8, this.method5952("libjaggl_dri.so").toString());
									@Pc(792) Class local792 = ((Class) local18.anObject8).getClassLoader().loadClass("jaggl.X11.dri");
									local792.getMethod("bind").invoke(null);
									local551.invoke(local545, local18.anObject8, this.method5952("libjaggl.so").toString());
									local792.getMethod("close").invoke(null);
								} else if (aString82.startsWith("mac")) {
									local551.invoke(local545, local18.anObject8, this.method5952("libjaggl.jnilib").toString());
								} else if (aString82.startsWith("win")) {
									local551.invoke(local545, local18.anObject8, this.method5952("jaggl.dll").toString());
								} else {
									throw new Exception();
								}
								local551.setAccessible(false);
							} else {
								@Pc(327) int local327;
								if (local46 == 11) {
									@Pc(314) Field local314 = Class.forName("java.lang.ClassLoader").getDeclaredField("nativeLibraries");
									local314.setAccessible(true);
									@Pc(325) Vector local325 = (Vector) local314.get(((Class) local18.anObject8).getClassLoader());
									for (local327 = 0; local327 < local325.size(); local327++) {
										@Pc(335) Object local335 = local325.elementAt(local327);
										@Pc(342) Method local342 = local335.getClass().getDeclaredMethod("finalize");
										local342.setAccessible(true);
										local342.invoke(local335);
										local342.setAccessible(false);
										@Pc(359) Field local359 = local335.getClass().getDeclaredField("handle");
										local359.setAccessible(true);
										local359.set(local335, Integer.valueOf(0));
										local359.setAccessible(false);
									}
									local314.setAccessible(false);
								} else {
									@Pc(635) Class232 local635;
									if (local46 == 12) {
										local635 = method5944(this.aString83, this.anInt7051);
										local18.anObject9 = local635;
									} else if (local46 == 13) {
										local635 = method5932(this.aString83, this.anInt7051);
										local18.anObject9 = local635;
									} else if (local46 == 14) {
										@Pc(618) int local618 = local18.anInt7038;
										@Pc(621) int local621 = local18.anInt7040;
										this.aClass225_1.method5897(local618, local621);
									} else if (local46 == 15) {
										@Pc(401) boolean local401 = local18.anInt7038 != 0;
										@Pc(405) Component local405 = (Component) local18.anObject8;
										this.aClass225_1.method5896(local401, local405);
									} else if (local46 == 17) {
										local112 = (Object[]) local18.anObject8;
										this.aClass225_1.method5895(local18.anInt7038, (Component) local112[0], (int[]) local112[1], (Point) local112[2], local18.anInt7040);
									} else if (local46 == 16) {
										try {
											if (!aString82.startsWith("win")) {
												throw new Exception();
											}
											local212 = (String) local18.anObject8;
											if (!local212.startsWith("http://") && !local212.startsWith("https://")) {
												throw new Exception();
											}
											@Pc(475) String local475 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
											for (local327 = 0; local327 < local212.length(); local327++) {
												if (local475.indexOf(local212.charAt(local327)) == -1) {
													throw new Exception();
												}
											}
											Runtime.getRuntime().exec("cmd /c start \"j\" \"" + local212 + "\"");
											local18.anObject9 = null;
										} catch (@Pc(517) Exception local517) {
											local18.anObject9 = local517;
											throw local517;
										}
									} else if (local46 == 20) {
										try {
											local543 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
											local545 = Runtime.getRuntime();
											local551 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local543);
											local551.setAccessible(true);
											if (aString82.startsWith("win")) {
												if (aString85.startsWith("amd64") || aString85.startsWith("x86_64")) {
													local551.invoke(local545, local18.anObject8, this.method5952("jagmisc64.dll").toString());
												} else {
													local551.invoke(local545, local18.anObject8, this.method5952("jagmisc.dll").toString());
												}
											}
											local551.setAccessible(false);
										} catch (@Pc(611) Throwable local611) {
											local18.anObject9 = local611;
										}
									} else {
										throw new Exception("");
									}
								}
							}
						}
					}
				}
				local18.anInt7039 = 1;
			} catch (@Pc(902) ThreadDeath local902) {
				throw local902;
			} catch (@Pc(905) Throwable local905) {
				local18.anInt7039 = 2;
			}
			synchronized (local18) {
				local18.notify();
			}
		}
	}

	@OriginalMember(owner = "loader!sc", name = "a", descriptor = "(ZILjava/lang/Runnable;)Lloader!bl;")
	private Class227 method5926(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Runnable arg2) {
		return arg0 ? (Class227) null : this.method5947(arg1, 0, arg2, 2, 0);
	}

	@OriginalMember(owner = "loader!sc", name = "a", descriptor = "(Ljava/lang/String;I)[B")
	private byte[] method5927(@OriginalArg(0) String arg0) {
		@Pc(15) Class227 local15 = this.method5933(21, true, 0, 0, arg0);
		return (byte[]) local15.anObject9;
	}

	@OriginalMember(owner = "loader!sc", name = "a", descriptor = "(IIIIB)Lloader!bl;")
	private Class227 method5928(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		if (arg4 != -36) {
			this.method5949();
		}
		return this.method5947(arg2 + (arg1 << 16), (arg0 << 16) + arg3, null, 6, 0);
	}

	@OriginalMember(owner = "loader!sc", name = "a", descriptor = "(Z)Z")
	private boolean method5929(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			return this.aClass229_1 != null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "loader!sc", name = "a", descriptor = "(ILjava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;)Lloader!bl;")
	private Class227 method5930(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Class[] arg2, @OriginalArg(3) Class arg3) {
		return arg0 == 0 ? this.method5947(0, 0, new Object[] { arg3, arg1, arg2 }, 8, 0) : (Class227) null;
	}

	@OriginalMember(owner = "loader!sc", name = "a", descriptor = "(ILjava/lang/Class;)Lloader!bl;")
	private Class227 method5931(@OriginalArg(0) int arg0, @OriginalArg(1) Class arg1) {
		if (arg0 != -11733) {
			this.aClass227_3 = null;
		}
		return this.method5947(0, 0, arg1, 10, 0);
	}

	@OriginalMember(owner = "loader!sc", name = "a", descriptor = "(IZIILjava/lang/Object;)Lloader!bl;")
	private Class227 method5933(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Object arg4) {
		if (!arg1) {
			this.aClass227_3 = null;
		}
		@Pc(10) Class227 local10 = new Class227();
		synchronized (local10) {
			local10.anInt7038 = arg2;
			local10.anInt7041 = arg0;
			local10.anObject8 = arg4;
			local10.anInt7040 = arg3;
			synchronized (this) {
				if (this.aClass227_2 == null) {
					this.aClass227_2 = this.aClass227_3 = local10;
				} else {
					this.aClass227_2.aClass227_1 = local10;
					this.aClass227_2 = local10;
				}
				this.notify();
			}
			try {
				local10.wait();
			} catch (@Pc(62) InterruptedException local62) {
			}
			return local10;
		}
	}

	@OriginalMember(owner = "loader!sc", name = "a", descriptor = "(IILjava/awt/Component;B)Lloader!bl;")
	private Class227 method5935(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Component arg2, @OriginalArg(3) byte arg3) {
		if (arg3 != -73) {
			aString81 = null;
		}
		@Pc(8) Point local8 = arg2.getLocationOnScreen();
		return this.method5947(local8.x + arg0, arg1 - -local8.y, null, 14, 0);
	}

	@OriginalMember(owner = "loader!sc", name = "c", descriptor = "(I)Lloader!bl;")
	private Class227 method5936(@OriginalArg(0) int arg0) {
		return arg0 == 19204 ? this.method5947(0, 0, null, 13, 0) : (Class227) null;
	}

	@OriginalMember(owner = "loader!sc", name = "a", descriptor = "(BLjava/awt/Frame;)Lloader!bl;")
	private Class227 method5937(@OriginalArg(0) byte arg0, @OriginalArg(1) Frame arg1) {
		if (arg0 != -29) {
			method5934(null, 105, null);
		}
		return this.method5947(0, 0, arg1, 7, 0);
	}

	@OriginalMember(owner = "loader!sc", name = "a", descriptor = "(Ljava/lang/String;Z)Lloader!bl;")
	private Class227 method5938(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) {
		return arg1 ? (Class227) null : this.method5947(0, 0, arg0, 21, 0);
	}

	@OriginalMember(owner = "loader!sc", name = "b", descriptor = "(Ljava/lang/String;Z)Lloader!bl;")
	private Class227 method5939(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) {
		if (!arg1) {
			this.method5951(16);
		}
		return this.method5947(0, 0, arg0, 16, 0);
	}

	@OriginalMember(owner = "loader!sc", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Class;)Lloader!bl;")
	private Class227 method5940(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Class arg2) {
		if (arg0 != 0) {
			method5934(null, -59, null);
		}
		return this.method5947(0, 0, new Object[] { arg2, arg1 }, 9, 0);
	}

	@OriginalMember(owner = "loader!sc", name = "a", descriptor = "(BLjava/lang/Class;)Lloader!bl;")
	private Class227 method5941(@OriginalArg(0) byte arg0, @OriginalArg(1) Class arg1) {
		if (arg0 != 85) {
			this.method5922(null, (byte) -99);
		}
		return this.method5947(0, 0, arg1, 11, 0);
	}

	@OriginalMember(owner = "loader!sc", name = "b", descriptor = "(Z)V")
	private void method5942(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.aBoolean630 = false;
		}
		aLong222 = Class226.method5898() + 5000L;
	}

	@OriginalMember(owner = "loader!sc", name = "a", descriptor = "(Ljava/lang/Class;I)Lloader!bl;")
	private Class227 method5943(@OriginalArg(0) Class arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 0) {
			aMethod3 = null;
		}
		return this.method5947(0, 0, arg0, 20, 0);
	}

	@OriginalMember(owner = "loader!sc", name = "a", descriptor = "(B)Lloader!bl;")
	private Class227 method5945(@OriginalArg(0) byte arg0) {
		if (arg0 >= -85) {
			this.method5946(null, null, true, 102, 0, null);
		}
		return this.method5947(0, 0, null, 12, 0);
	}

	@OriginalMember(owner = "loader!sc", name = "a", descriptor = "(Ljava/awt/Point;[IZIILjava/awt/Component;)Lloader!bl;")
	private Class227 method5946(@OriginalArg(0) Point arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Component arg5) {
		if (!arg2) {
			this.aClass232Array1 = null;
		}
		return this.method5947(arg3, arg4, new Object[] { arg5, arg1, arg0 }, 17, 0);
	}

	@OriginalMember(owner = "loader!sc", name = "a", descriptor = "(IILjava/lang/Object;II)Lloader!bl;")
	private Class227 method5947(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Object arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(3) Class227 local3 = new Class227();
		local3.anInt7041 = arg3;
		local3.anObject8 = arg2;
		local3.anInt7038 = arg0;
		local3.anInt7040 = arg1;
		synchronized (this) {
			if (arg4 != 0) {
				return (Class227) null;
			}
			if (this.aClass227_2 == null) {
				this.aClass227_2 = this.aClass227_3 = local3;
			} else {
				this.aClass227_2.aClass227_1 = local3;
				this.aClass227_2 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "loader!sc", name = "a", descriptor = "(Ljava/awt/datatransfer/Transferable;B)Lloader!bl;")
	private Class227 method5948(@OriginalArg(0) Transferable arg0, @OriginalArg(1) byte arg1) {
		return arg1 > -45 ? (Class227) null : this.method5947(0, 0, arg0, 19, 0);
	}

	@OriginalMember(owner = "loader!sc", name = "b", descriptor = "(B)Lloader!bl;")
	private Class227 method5949() {
		return this.method5947(0, 0, null, 5, 0);
	}

	@OriginalMember(owner = "loader!sc", name = "a", descriptor = "(I)Lloader!bl;")
	private Class227 method5950(@OriginalArg(0) int arg0) {
		if (arg0 != 21) {
			this.aClass232Array1 = null;
		}
		return this.method5947(0, 0, null, 18, 0);
	}

	@OriginalMember(owner = "loader!sc", name = "d", descriptor = "(I)V")
	private void method5951(@OriginalArg(0) int arg0) {
		synchronized (this) {
			this.aBoolean630 = true;
			this.notifyAll();
		}
		try {
			if (arg0 != 0) {
				this.anInt7051 = -127;
			}
			this.aThread4.join();
		} catch (@Pc(26) InterruptedException local26) {
		}
		if (this.aClass232_2 != null) {
			try {
				this.aClass232_2.method5958();
			} catch (@Pc(35) IOException local35) {
			}
		}
		if (this.aClass232_3 != null) {
			try {
				this.aClass232_3.method5958();
			} catch (@Pc(45) IOException local45) {
			}
		}
		if (this.aClass232Array1 != null) {
			for (@Pc(52) int local52 = 0; local52 < this.aClass232Array1.length; local52++) {
				if (this.aClass232Array1[local52] != null) {
					try {
						this.aClass232Array1[local52].method5958();
					} catch (@Pc(71) IOException local71) {
					}
				}
			}
		}
		if (this.aClass232_1 != null) {
			try {
				this.aClass232_1.method5958();
			} catch (@Pc(82) IOException local82) {
			}
		}
	}

	@OriginalMember(owner = "loader!sc", name = "b", descriptor = "(Ljava/lang/String;I)Ljava/io/File;")
	public File method5952(@OriginalArg(0) String arg0) {
		return method5934(arg0, this.anInt7051, this.aString83);
	}

	@OriginalMember(owner = "loader!sc", name = "b", descriptor = "(I)Lloader!ea;")
	private Interface12 method5953(@OriginalArg(0) int arg0) {
		if (arg0 != -31623) {
			aString81 = null;
		}
		return this.anInterface12_1;
	}
}
