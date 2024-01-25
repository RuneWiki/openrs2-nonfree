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

@OriginalClass("loader!wd")
public final class Class228 implements Runnable {

	@OriginalMember(owner = "loader!wd", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString282;

	@OriginalMember(owner = "loader!wd", name = "o", descriptor = "Ljava/lang/String;")
	private static String aString283;

	@OriginalMember(owner = "loader!wd", name = "q", descriptor = "Ljava/lang/String;")
	public static String aString285;

	@OriginalMember(owner = "loader!wd", name = "l", descriptor = "Ljava/lang/String;")
	private static String aString286;

	@OriginalMember(owner = "loader!wd", name = "b", descriptor = "Ljava/lang/String;")
	private static String aString287;

	@OriginalMember(owner = "loader!wd", name = "s", descriptor = "Ljava/lang/String;")
	private static String aString288;

	@OriginalMember(owner = "loader!wd", name = "A", descriptor = "Ljava/lang/String;")
	private static String aString289;

	@OriginalMember(owner = "loader!wd", name = "u", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod3;

	@OriginalMember(owner = "loader!wd", name = "t", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod4;

	@OriginalMember(owner = "loader!wd", name = "j", descriptor = "I")
	private static final int anInt6814 = 1;

	@OriginalMember(owner = "loader!wd", name = "p", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable2 = new Hashtable(16);

	@OriginalMember(owner = "loader!wd", name = "v", descriptor = "J")
	private static volatile long aLong219 = 0L;

	@OriginalMember(owner = "loader!wd", name = "y", descriptor = "Lloader!ci;")
	private Interface11 anInterface11_1;

	@OriginalMember(owner = "loader!wd", name = "e", descriptor = "Lloader!tj;")
	private Class227 aClass227_2 = null;

	@OriginalMember(owner = "loader!wd", name = "r", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3 = null;

	@OriginalMember(owner = "loader!wd", name = "m", descriptor = "Z")
	private boolean aBoolean562 = false;

	@OriginalMember(owner = "loader!wd", name = "n", descriptor = "Lloader!tj;")
	private Class227 aClass227_3 = null;

	@OriginalMember(owner = "loader!wd", name = "d", descriptor = "Lloader!im;")
	private Class225 aClass225_1 = null;

	@OriginalMember(owner = "loader!wd", name = "i", descriptor = "Lloader!im;")
	private Class225 aClass225_2 = null;

	@OriginalMember(owner = "loader!wd", name = "c", descriptor = "Lloader!im;")
	private Class225 aClass225_3 = null;

	@OriginalMember(owner = "loader!wd", name = "g", descriptor = "Ljava/lang/String;")
	private String aString284;

	@OriginalMember(owner = "loader!wd", name = "x", descriptor = "I")
	private final int anInt6813;

	@OriginalMember(owner = "loader!wd", name = "h", descriptor = "Ljava/awt/EventQueue;")
	private EventQueue anEventQueue2;

	@OriginalMember(owner = "loader!wd", name = "a", descriptor = "[Lloader!im;")
	private final Class225[] aClass225Array1;

	@OriginalMember(owner = "loader!wd", name = "z", descriptor = "Lloader!h;")
	private Class224 aClass224_1;

	@OriginalMember(owner = "loader!wd", name = "k", descriptor = "Lloader!c;")
	private Class221 aClass221_1;

	@OriginalMember(owner = "loader!wd", name = "w", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread4;

	@OriginalMember(owner = "loader!wd", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;)Ljava/io/File;")
	private static File method5907(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2) {
		@Pc(4) File local4 = (File) aHashtable2.get(arg0);
		if (local4 != null) {
			return local4;
		}
		@Pc(45) String[] local45 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString289, "/tmp/", "" };
		@Pc(70) String[] local70 = new String[] { ".jagex_cache_" + arg1, ".file_store_" + arg1 };
		for (@Pc(72) int local72 = 0; local72 < 2; local72++) {
			for (@Pc(79) int local79 = 0; local79 < local70.length; local79++) {
				for (@Pc(85) int local85 = 0; local85 < local45.length; local85++) {
					@Pc(119) String local119 = local45[local85] + local70[local79] + "/" + (arg2 == null ? "" : arg2 + "/") + arg0;
					@Pc(121) RandomAccessFile local121 = null;
					try {
						@Pc(126) File local126 = new File(local119);
						if (local72 != 0 || local126.exists()) {
							@Pc(140) String local140 = local45[local85];
							if (local72 != 1 || local140.length() <= 0 || (new File(local140)).exists()) {
								(new File(local45[local85] + local70[local79])).mkdir();
								if (arg2 != null) {
									(new File(local45[local85] + local70[local79] + "/" + arg2)).mkdir();
								}
								local121 = new RandomAccessFile(local126, "rw");
								@Pc(207) int local207 = local121.read();
								local121.seek(0L);
								local121.write(local207);
								local121.seek(0L);
								local121.close();
								aHashtable2.put(arg0, local126);
								return local126;
							}
						}
					} catch (@Pc(226) Exception local226) {
						try {
							if (local121 != null) {
								local121.close();
							}
						} catch (@Pc(236) Exception local236) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "loader!wd", name = "a", descriptor = "(Ljava/lang/String;II)Lloader!im;")
	private static Class225 method5923(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		@Pc(18) String local18;
		if (arg1 == 33) {
			local18 = "jagex_" + arg0 + "_preferences_rc.dat";
		} else if (arg1 == 34) {
			local18 = "jagex_" + arg0 + "_preferences_wip.dat";
		} else {
			local18 = "jagex_" + arg0 + "_preferences.dat";
		}
		@Pc(77) String[] local77 = new String[] { "c:/rscache/", "/rscache/", aString289, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(79) int local79 = 0; local79 < local77.length; local79++) {
			@Pc(87) String local87 = local77[local79];
			if (local87.length() <= 0 || (new File(local87)).exists()) {
				try {
					return new Class225(new File(local87, local18), "rw", 10000L);
				} catch (@Pc(113) Exception local113) {
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "loader!wd", name = "a", descriptor = "(ILjava/lang/String;I)Lloader!im;")
	private static Class225 method5934(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		@Pc(16) String local16;
		if (arg1 == 33) {
			local16 = "jagex_" + arg0 + "_preferences2_rc.dat";
		} else if (arg1 == 34) {
			local16 = "jagex_" + arg0 + "_preferences2_wip.dat";
		} else {
			local16 = "jagex_" + arg0 + "_preferences2.dat";
		}
		@Pc(75) String[] local75 = new String[] { "c:/rscache/", "/rscache/", aString289, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(77) int local77 = 0; local77 < local75.length; local77++) {
			@Pc(89) String local89 = local75[local77];
			if (local89.length() <= 0 || (new File(local89)).exists()) {
				try {
					return new Class225(new File(local89, local16), "rw", 10000L);
				} catch (@Pc(114) Exception local114) {
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "loader!wd", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class228(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		this.aString284 = arg2;
		this.anInt6813 = arg1;
		aString285 = "1.1";
		this.anApplet3 = arg0;
		aString282 = "Unknown";
		try {
			aString282 = System.getProperty("java.vendor");
			aString285 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			aString287 = System.getProperty("os.name");
		} catch (@Pc(48) Exception local48) {
			aString287 = "Unknown";
		}
		aString283 = aString287.toLowerCase();
		try {
			aString286 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(59) Exception local59) {
			aString286 = "";
		}
		try {
			aString288 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(67) Exception local67) {
			aString288 = "";
		}
		try {
			aString289 = System.getProperty("user.home");
			if (aString289 != null) {
				aString289 = aString289 + "/";
			}
		} catch (@Pc(87) Exception local87) {
		}
		if (aString289 == null) {
			aString289 = "~/";
		}
		try {
			this.anEventQueue2 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(97) Throwable local97) {
		}
		try {
			if (arg0 == null) {
				aMethod3 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				aMethod3 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(125) Exception local125) {
		}
		try {
			if (arg0 == null) {
				aMethod4 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				aMethod4 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(152) Exception local152) {
		}
		this.aClass225_2 = new Class225(method5907("random.dat", this.anInt6813, null), "rw", 25L);
		this.aClass225_1 = new Class225(this.method5935("main_file_cache.dat2"), "rw", 209715200L);
		this.aClass225_3 = new Class225(this.method5935("main_file_cache.idx255"), "rw", 1048576L);
		this.aClass225Array1 = new Class225[arg3];
		for (@Pc(193) int local193 = 0; local193 < arg3; local193++) {
			this.aClass225Array1[local193] = new Class225(this.method5935("main_file_cache.idx" + local193), "rw", 1048576L);
		}
		try {
			this.aClass224_1 = new Class224();
		} catch (@Pc(229) Throwable local229) {
		}
		try {
			this.aClass221_1 = new Class221();
		} catch (@Pc(236) Throwable local236) {
		}
		@Pc(239) ThreadGroup local239 = Thread.currentThread().getThreadGroup();
		for (@Pc(242) ThreadGroup local242 = local239.getParent(); local242 != null; local242 = local242.getParent()) {
			local239 = local242;
		}
		@Pc(254) Thread[] local254 = new Thread[1000];
		local239.enumerate(local254);
		for (@Pc(260) int local260 = 0; local260 < local254.length; local260++) {
			if (local254[local260] != null && local254[local260].getName().startsWith("AWT")) {
				local254[local260].setPriority(1);
			}
		}
		this.aBoolean562 = false;
		this.aThread4 = new Thread(this);
		this.aThread4.setPriority(10);
		this.aThread4.setDaemon(true);
		this.aThread4.start();
	}

	@OriginalMember(owner = "loader!wd", name = "a", descriptor = "(ZLjava/awt/Component;II)Lloader!tj;")
	private Class227 method5906(@OriginalArg(0) boolean arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0) {
			@Pc(8) Point local8 = arg1.getLocationOnScreen();
			return this.method5925(arg3 + local8.y, 0, null, arg2 + local8.x, 14);
		} else {
			return (Class227) null;
		}
	}

	@OriginalMember(owner = "loader!wd", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(18) Class227 local18;
			synchronized (this) {
				while (true) {
					if (this.aBoolean562) {
						return;
					}
					if (this.aClass227_2 != null) {
						local18 = this.aClass227_2;
						this.aClass227_2 = this.aClass227_2.aClass227_1;
						if (this.aClass227_2 == null) {
							this.aClass227_3 = null;
						}
						break;
					}
					try {
						this.wait();
					} catch (@Pc(35) InterruptedException local35) {
					}
				}
			}
			try {
				@Pc(47) int local47 = local18.anInt6812;
				if (local47 == 1) {
					if (aLong219 > Class226.method5905()) {
						throw new IOException();
					}
					local18.anObject9 = new Socket(InetAddress.getByName((String) local18.anObject10), local18.anInt6811);
				} else if (local47 == 2) {
					@Pc(60) Thread local60 = new Thread((Runnable) local18.anObject10);
					local60.setDaemon(true);
					local60.start();
					local60.setPriority(local18.anInt6811);
					local18.anObject9 = local60;
				} else if (local47 == 4) {
					if (Class226.method5905() < aLong219) {
						throw new IOException();
					}
					local18.anObject9 = new DataInputStream(((URL) local18.anObject10).openStream());
				} else {
					@Pc(105) Object[] local105;
					if (local47 == 8) {
						local105 = (Object[]) local18.anObject10;
						if (((Class) local105[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local18.anObject9 = ((Class) local105[0]).getDeclaredMethod((String) local105[1], (Class[]) local105[2]);
					} else if (local47 == 9) {
						local105 = (Object[]) local18.anObject10;
						if (((Class) local105[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local18.anObject9 = ((Class) local105[0]).getDeclaredField((String) local105[1]);
					} else if (local47 == 18) {
						@Pc(859) Clipboard local859 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local18.anObject9 = local859.getContents(null);
					} else if (local47 == 19) {
						@Pc(175) Transferable local175 = (Transferable) local18.anObject10;
						@Pc(178) Clipboard local178 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local178.setContents(local175, null);
					} else {
						@Pc(236) String local236;
						if (local47 == 3) {
							if (aLong219 > Class226.method5905()) {
								throw new IOException();
							}
							local236 = (local18.anInt6811 >> 24 & 0xFF) + "." + (local18.anInt6811 >> 16 & 0xFF) + "." + (local18.anInt6811 >> 8 & 0xFF) + "." + (local18.anInt6811 & 0xFF);
							local18.anObject9 = InetAddress.getByName(local236).getHostName();
						} else if (local47 == 21) {
							if (aLong219 > Class226.method5905()) {
								throw new IOException();
							}
							local18.anObject9 = InetAddress.getByName((String) local18.anObject10).getAddress();
						} else if (local47 == 5) {
							local18.anObject9 = this.aClass224_1.method5891();
						} else if (local47 == 6) {
							@Pc(799) Frame local799 = new Frame("Jagex Full Screen");
							local18.anObject9 = local799;
							local799.setResizable(false);
							this.aClass224_1.method5890(local18.anInt6811 >>> 16, local18.anInt6810 & 0xFFFF, local18.anInt6810 >> 16, local799, local18.anInt6811 & 0xFFFF);
						} else if (local47 == 7) {
							this.aClass224_1.method5889();
						} else {
							@Pc(296) Method local296;
							@Pc(283) Class[] local283;
							@Pc(285) Runtime local285;
							if (local47 == 10) {
								local283 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
								local285 = Runtime.getRuntime();
								if (!aString283.startsWith("mac")) {
									local296 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", local283);
									local296.setAccessible(true);
									local296.invoke(local285, local18.anObject10, "jawt");
									local296.setAccessible(false);
								}
								local296 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local283);
								local296.setAccessible(true);
								if (aString283.startsWith("linux") || aString283.startsWith("sunos")) {
									local296.invoke(local285, local18.anObject10, this.method5935("libjaggl_dri.so").toString());
									@Pc(360) Class local360 = ((Class) local18.anObject10).getClassLoader().loadClass("jaggl.X11.dri");
									local360.getMethod("bind").invoke(null);
									local296.invoke(local285, local18.anObject10, this.method5935("libjaggl.so").toString());
									local360.getMethod("close").invoke(null);
								} else if (aString283.startsWith("mac")) {
									local296.invoke(local285, local18.anObject10, this.method5935("libjaggl.jnilib").toString());
								} else if (aString283.startsWith("win")) {
									local296.invoke(local285, local18.anObject10, this.method5935("jaggl.dll").toString());
								} else {
									throw new Exception();
								}
								local296.setAccessible(false);
							} else {
								@Pc(476) int local476;
								if (local47 == 11) {
									@Pc(463) Field local463 = Class.forName("java.lang.ClassLoader").getDeclaredField("nativeLibraries");
									local463.setAccessible(true);
									@Pc(474) Vector local474 = (Vector) local463.get(((Class) local18.anObject10).getClassLoader());
									for (local476 = 0; local474.size() > local476; local476++) {
										@Pc(484) Object local484 = local474.elementAt(local476);
										@Pc(491) Method local491 = local484.getClass().getDeclaredMethod("finalize");
										local491.setAccessible(true);
										local491.invoke(local484);
										local491.setAccessible(false);
										@Pc(508) Field local508 = local484.getClass().getDeclaredField("handle");
										local508.setAccessible(true);
										local508.set(local484, Integer.valueOf(0));
										local508.setAccessible(false);
									}
									local463.setAccessible(false);
								} else {
									@Pc(537) Class225 local537;
									if (local47 == 12) {
										local537 = method5923(this.aString284, this.anInt6813);
										local18.anObject9 = local537;
									} else if (local47 == 13) {
										local537 = method5934(this.aString284, this.anInt6813);
										local18.anObject9 = local537;
									} else if (local47 == 14) {
										@Pc(561) int local561 = local18.anInt6811;
										@Pc(564) int local564 = local18.anInt6810;
										this.aClass221_1.method5877(local561, local564);
									} else if (local47 == 15) {
										@Pc(783) boolean local783 = local18.anInt6811 != 0;
										@Pc(787) Component local787 = (Component) local18.anObject10;
										this.aClass221_1.method5876(local787, local783);
									} else if (local47 == 17) {
										local105 = (Object[]) local18.anObject10;
										this.aClass221_1.method5878(local18.anInt6810, (int[]) local105[1], (Point) local105[2], local18.anInt6811, (Component) local105[0]);
									} else if (local47 == 16) {
										try {
											if (!aString283.startsWith("win")) {
												throw new Exception();
											}
											local236 = (String) local18.anObject10;
											if (!local236.startsWith("http://") && !local236.startsWith("https://")) {
												throw new Exception();
											}
											@Pc(638) String local638 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
											for (local476 = 0; local236.length() > local476; local476++) {
												if (local638.indexOf(local236.charAt(local476)) == -1) {
													throw new Exception();
												}
											}
											Runtime.getRuntime().exec("cmd /c start \"j\" \"" + local236 + "\"");
											local18.anObject9 = null;
										} catch (@Pc(676) Exception local676) {
											local18.anObject9 = local676;
										}
									} else if (local47 == 20) {
										try {
											local283 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
											local285 = Runtime.getRuntime();
											local296 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local283);
											local296.setAccessible(true);
											if (aString283.startsWith("win")) {
												if (aString286.startsWith("amd64") || aString286.startsWith("x86_64")) {
													local296.invoke(local285, local18.anObject10, this.method5935("jagmisc64.dll").toString());
												} else {
													local296.invoke(local285, local18.anObject10, this.method5935("jagmisc.dll").toString());
												}
											}
											local296.setAccessible(false);
										} catch (@Pc(771) Throwable local771) {
											local18.anObject9 = local771;
										}
									} else {
										throw new Exception("");
									}
								}
							}
						}
					}
				}
				local18.anInt6809 = 1;
			} catch (@Pc(895) ThreadDeath local895) {
				throw local895;
			} catch (@Pc(898) Throwable local898) {
				local18.anInt6809 = 2;
			}
			synchronized (local18) {
				local18.notify();
			}
		}
	}

	@OriginalMember(owner = "loader!wd", name = "a", descriptor = "(Ljava/lang/Class;I)Lloader!tj;")
	private Class227 method5908(@OriginalArg(0) Class arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 0) {
			this.method5913(false);
		}
		return this.method5925(0, arg1, arg0, 0, 20);
	}

	@OriginalMember(owner = "loader!wd", name = "a", descriptor = "(Ljava/lang/Object;IIII)Lloader!tj;")
	private Class227 method5909(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(3) Class227 local3 = new Class227();
		synchronized (local3) {
			local3.anInt6810 = arg3;
			local3.anInt6811 = arg2;
			local3.anObject10 = arg0;
			local3.anInt6812 = arg1;
			synchronized (this) {
				if (this.aClass227_3 == null) {
					this.aClass227_3 = this.aClass227_2 = local3;
				} else {
					this.aClass227_3.aClass227_1 = local3;
					this.aClass227_3 = local3;
				}
				this.notify();
			}
			try {
				local3.wait();
				if (arg4 != 0) {
					this.method5924(null, -48);
				}
			} catch (@Pc(62) InterruptedException local62) {
			}
			return local3;
		}
	}

	@OriginalMember(owner = "loader!wd", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Class;)Lloader!tj;")
	private Class227 method5910(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Class arg2) {
		if (arg0 != 9) {
			this.method5917(null);
		}
		return this.method5925(0, 0, new Object[] { arg2, arg1 }, 0, 9);
	}

	@OriginalMember(owner = "loader!wd", name = "e", descriptor = "(I)Z")
	private boolean method5911(@OriginalArg(0) int arg0) {
		if (arg0 == 18) {
			return this.aClass224_1 != null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "loader!wd", name = "a", descriptor = "(B)Lloader!ci;")
	private Interface11 method5912(@OriginalArg(0) byte arg0) {
		return arg0 > -72 ? (Interface11) null : this.anInterface11_1;
	}

	@OriginalMember(owner = "loader!wd", name = "a", descriptor = "(Z)V")
	private void method5913(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			aLong219 = Class226.method5905() + 5000L;
		}
	}

	@OriginalMember(owner = "loader!wd", name = "a", descriptor = "(Ljava/awt/Frame;B)Lloader!tj;")
	private Class227 method5914(@OriginalArg(0) Frame arg0, @OriginalArg(1) byte arg1) {
		if (arg1 != -90) {
			this.method5915(null, (byte) -39, 70);
		}
		return this.method5925(0, 0, arg0, 0, 7);
	}

	@OriginalMember(owner = "loader!wd", name = "a", descriptor = "(Ljava/lang/Runnable;BI)Lloader!tj;")
	private Class227 method5915(@OriginalArg(0) Runnable arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2) {
		if (arg1 != -102) {
			this.method5931(null, -60);
		}
		return this.method5925(0, 0, arg0, arg2, 2);
	}

	@OriginalMember(owner = "loader!wd", name = "a", descriptor = "(IILjava/lang/String;)Lloader!tj;")
	private Class227 method5916(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		if (arg0 != -5159) {
			this.aString284 = null;
		}
		return this.method5925(0, 0, arg2, arg1, 1);
	}

	@OriginalMember(owner = "loader!wd", name = "a", descriptor = "(BLjava/lang/Class;)Lloader!tj;")
	private Class227 method5917(@OriginalArg(1) Class arg0) {
		return this.method5925(0, 0, arg0, 0, 10);
	}

	@OriginalMember(owner = "loader!wd", name = "a", descriptor = "(Ljava/net/URL;I)Lloader!tj;")
	private Class227 method5918(@OriginalArg(0) URL arg0, @OriginalArg(1) int arg1) {
		return arg1 >= -68 ? (Class227) null : this.method5925(0, 0, arg0, 0, 4);
	}

	@OriginalMember(owner = "loader!wd", name = "a", descriptor = "(II)Lloader!tj;")
	private Class227 method5919(@OriginalArg(1) int arg0) {
		return this.method5925(0, 0, null, arg0, 3);
	}

	@OriginalMember(owner = "loader!wd", name = "a", descriptor = "(Ljava/awt/datatransfer/Transferable;Z)Lloader!tj;")
	private Class227 method5920(@OriginalArg(0) Transferable arg0, @OriginalArg(1) boolean arg1) {
		if (arg1) {
			this.method5926(null);
		}
		return this.method5925(0, 0, arg0, 0, 19);
	}

	@OriginalMember(owner = "loader!wd", name = "b", descriptor = "(B)Lloader!tj;")
	private Class227 method5921(@OriginalArg(0) byte arg0) {
		if (arg0 != 44) {
			this.aClass225_3 = null;
		}
		return this.method5925(0, 0, null, 0, 12);
	}

	@OriginalMember(owner = "loader!wd", name = "a", descriptor = "(Ljava/lang/String;Z)[B")
	private byte[] method5922(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) {
		if (arg1) {
			this.aClass225_1 = null;
		}
		@Pc(13) Class227 local13 = this.method5909(arg0, 21, 0, 0, 0);
		return (byte[]) local13.anObject9;
	}

	@OriginalMember(owner = "loader!wd", name = "b", descriptor = "(Ljava/lang/Class;I)Lloader!tj;")
	private Class227 method5924(@OriginalArg(0) Class arg0, @OriginalArg(1) int arg1) {
		return arg1 == 10000 ? this.method5925(0, 0, arg0, 0, 11) : (Class227) null;
	}

	@OriginalMember(owner = "loader!wd", name = "a", descriptor = "(IILjava/lang/Object;II)Lloader!tj;")
	private Class227 method5925(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Object arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(3) Class227 local3 = new Class227();
		local3.anInt6812 = arg4;
		if (arg1 != 0) {
			return (Class227) null;
		}
		local3.anObject10 = arg2;
		local3.anInt6811 = arg3;
		local3.anInt6810 = arg0;
		synchronized (this) {
			if (this.aClass227_3 == null) {
				this.aClass227_3 = this.aClass227_2 = local3;
			} else {
				this.aClass227_3.aClass227_1 = local3;
				this.aClass227_3 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "loader!wd", name = "a", descriptor = "(Ljava/lang/String;I)Lloader!tj;")
	private Class227 method5926(@OriginalArg(0) String arg0) {
		return this.method5925(0, 0, arg0, 0, 16);
	}

	@OriginalMember(owner = "loader!wd", name = "d", descriptor = "(I)Lloader!tj;")
	private Class227 method5927(@OriginalArg(0) int arg0) {
		if (arg0 != 0) {
			this.method5914(null, (byte) 75);
		}
		return this.method5925(0, arg0, null, 0, 18);
	}

	@OriginalMember(owner = "loader!wd", name = "a", descriptor = "(IB[IILjava/awt/Point;Ljava/awt/Component;)Lloader!tj;")
	private Class227 method5928(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Point arg4, @OriginalArg(5) Component arg5) {
		if (arg1 != -125) {
			this.method5913(true);
		}
		return this.method5925(arg0, arg1 ^ 0xFFFFFF83, new Object[] { arg5, arg2, arg4 }, arg3, 17);
	}

	@OriginalMember(owner = "loader!wd", name = "b", descriptor = "(I)V")
	private void method5929(@OriginalArg(0) int arg0) {
		synchronized (this) {
			this.aBoolean562 = true;
			if (arg0 != -32636) {
				this.run();
			}
			this.notifyAll();
		}
		try {
			this.aThread4.join();
		} catch (@Pc(26) InterruptedException local26) {
		}
		if (this.aClass225_1 != null) {
			try {
				this.aClass225_1.method5893();
			} catch (@Pc(36) IOException local36) {
			}
		}
		if (this.aClass225_3 != null) {
			try {
				this.aClass225_3.method5893();
			} catch (@Pc(45) IOException local45) {
			}
		}
		if (this.aClass225Array1 != null) {
			for (@Pc(50) int local50 = 0; local50 < this.aClass225Array1.length; local50++) {
				if (this.aClass225Array1[local50] != null) {
					try {
						this.aClass225Array1[local50].method5893();
					} catch (@Pc(68) IOException local68) {
					}
				}
			}
		}
		if (this.aClass225_2 != null) {
			try {
				this.aClass225_2.method5893();
			} catch (@Pc(80) IOException local80) {
			}
		}
	}

	@OriginalMember(owner = "loader!wd", name = "a", descriptor = "(IIIBI)Lloader!tj;")
	private Class227 method5930(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4) {
		if (arg3 != 55) {
			this.aClass227_2 = null;
		}
		return this.method5925((arg1 << 16) + arg4, arg3 ^ 0x37, null, arg2 + (arg0 << 16), 6);
	}

	@OriginalMember(owner = "loader!wd", name = "b", descriptor = "(Ljava/lang/String;I)Lloader!tj;")
	private Class227 method5931(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 0) {
			method5907(null, -69, null);
		}
		return this.method5925(0, 0, arg0, 0, 21);
	}

	@OriginalMember(owner = "loader!wd", name = "c", descriptor = "(I)Lloader!tj;")
	private Class227 method5932(@OriginalArg(0) int arg0) {
		if (arg0 != 1503) {
			this.method5924(null, -39);
		}
		return this.method5925(0, 0, null, 0, 5);
	}

	@OriginalMember(owner = "loader!wd", name = "a", descriptor = "(Ljava/awt/Component;IZ)Lloader!tj;")
	private Class227 method5933(@OriginalArg(0) Component arg0, @OriginalArg(2) boolean arg1) {
		return this.method5925(0, 0, arg0, arg1 ? 1 : 0, 15);
	}

	@OriginalMember(owner = "loader!wd", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/io/File;")
	public File method5935(@OriginalArg(1) String arg0) {
		return method5907(arg0, this.anInt6813, this.aString284);
	}

	@OriginalMember(owner = "loader!wd", name = "a", descriptor = "(I)Lloader!tj;")
	private Class227 method5936(@OriginalArg(0) int arg0) {
		if (arg0 != 0) {
			this.run();
		}
		return this.method5925(0, 0, null, 0, 13);
	}

	@OriginalMember(owner = "loader!wd", name = "a", descriptor = "(Ljava/lang/Class;B[Ljava/lang/Class;Ljava/lang/String;)Lloader!tj;")
	private Class227 method5937(@OriginalArg(0) Class arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) Class[] arg2, @OriginalArg(3) String arg3) {
		return arg1 == 67 ? this.method5925(0, 0, new Object[] { arg0, arg3, arg2 }, 0, 8) : (Class227) null;
	}
}
