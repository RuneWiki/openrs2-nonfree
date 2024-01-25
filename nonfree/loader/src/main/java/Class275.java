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

@OriginalClass("loader!js")
public final class Class275 implements Runnable {

	@OriginalMember(owner = "loader!js", name = "b", descriptor = "Ljava/lang/String;")
	private static String aString74;

	@OriginalMember(owner = "loader!js", name = "a", descriptor = "Ljava/lang/String;")
	private static String aString75;

	@OriginalMember(owner = "loader!js", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString77;

	@OriginalMember(owner = "loader!js", name = "h", descriptor = "Ljava/lang/String;")
	private static String aString78;

	@OriginalMember(owner = "loader!js", name = "r", descriptor = "Ljava/lang/String;")
	private static String aString79;

	@OriginalMember(owner = "loader!js", name = "t", descriptor = "Ljava/lang/String;")
	private static String aString80;

	@OriginalMember(owner = "loader!js", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString81;

	@OriginalMember(owner = "loader!js", name = "w", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod3;

	@OriginalMember(owner = "loader!js", name = "x", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod4;

	@OriginalMember(owner = "loader!js", name = "d", descriptor = "I")
	private static final int anInt7863 = 1;

	@OriginalMember(owner = "loader!js", name = "v", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable4 = new Hashtable(16);

	@OriginalMember(owner = "loader!js", name = "y", descriptor = "J")
	private static volatile long aLong228 = 0L;

	@OriginalMember(owner = "loader!js", name = "A", descriptor = "Lloader!cq;")
	private Interface13 anInterface13_1;

	@OriginalMember(owner = "loader!js", name = "n", descriptor = "Lloader!jk;")
	private Class274 aClass274_2 = null;

	@OriginalMember(owner = "loader!js", name = "j", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2 = null;

	@OriginalMember(owner = "loader!js", name = "m", descriptor = "Lloader!sr;")
	private Class277 aClass277_2 = null;

	@OriginalMember(owner = "loader!js", name = "q", descriptor = "Lloader!jk;")
	private Class274 aClass274_3 = null;

	@OriginalMember(owner = "loader!js", name = "l", descriptor = "Lloader!sr;")
	private Class277 aClass277_1 = null;

	@OriginalMember(owner = "loader!js", name = "p", descriptor = "Z")
	private boolean aBoolean669 = false;

	@OriginalMember(owner = "loader!js", name = "g", descriptor = "Lloader!sr;")
	private Class277 aClass277_3 = null;

	@OriginalMember(owner = "loader!js", name = "i", descriptor = "I")
	private int anInt7862;

	@OriginalMember(owner = "loader!js", name = "o", descriptor = "Ljava/lang/String;")
	private final String aString76;

	@OriginalMember(owner = "loader!js", name = "u", descriptor = "Ljava/awt/EventQueue;")
	private EventQueue anEventQueue2;

	@OriginalMember(owner = "loader!js", name = "f", descriptor = "[Lloader!sr;")
	private final Class277[] aClass277Array1;

	@OriginalMember(owner = "loader!js", name = "e", descriptor = "Lloader!c;")
	private Class271 aClass271_1;

	@OriginalMember(owner = "loader!js", name = "s", descriptor = "Lloader!a;")
	private Class270 aClass270_1;

	@OriginalMember(owner = "loader!js", name = "z", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread4;

	@OriginalMember(owner = "loader!js", name = "a", descriptor = "(Ljava/lang/String;IBLjava/lang/String;)Lloader!sr;")
	private static Class277 method6122(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2) {
		@Pc(30) String local30;
		if (arg1 == 33) {
			local30 = "jagex_" + arg0 + "_preferences" + arg2 + "_rc.dat";
		} else if (arg1 == 34) {
			local30 = "jagex_" + arg0 + "_preferences" + arg2 + "_wip.dat";
		} else {
			local30 = "jagex_" + arg0 + "_preferences" + arg2 + ".dat";
		}
		@Pc(97) String[] local97 = new String[] { "c:/rscache/", "/rscache/", aString80, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(99) int local99 = 0; local99 < local97.length; local99++) {
			@Pc(111) String local111 = local97[local99];
			if (local111.length() <= 0 || (new File(local111)).exists()) {
				try {
					return new Class277(new File(local111, local30), "rw", 10000L);
				} catch (@Pc(136) Exception local136) {
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "loader!js", name = "a", descriptor = "(ILjava/lang/String;ZLjava/lang/String;)Ljava/io/File;")
	private static File method6144(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) String arg2) {
		@Pc(4) File local4 = (File) aHashtable4.get(arg2);
		if (local4 != null) {
			return local4;
		}
		@Pc(44) String[] local44 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString80, "/tmp/", "" };
		@Pc(69) String[] local69 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
		for (@Pc(71) int local71 = 0; local71 < 2; local71++) {
			for (@Pc(76) int local76 = 0; local76 < local69.length; local76++) {
				for (@Pc(86) int local86 = 0; local86 < local44.length; local86++) {
					@Pc(125) String local125 = local44[local86] + local69[local76] + "/" + (arg1 == null ? "" : arg1 + "/") + arg2;
					@Pc(127) RandomAccessFile local127 = null;
					try {
						@Pc(132) File local132 = new File(local125);
						if (local71 != 0 || local132.exists()) {
							@Pc(144) String local144 = local44[local86];
							if (local71 != 1 || local144.length() <= 0 || (new File(local144)).exists()) {
								(new File(local44[local86] + local69[local76])).mkdir();
								if (arg1 != null) {
									(new File(local44[local86] + local69[local76] + "/" + arg1)).mkdir();
								}
								local127 = new RandomAccessFile(local132, "rw");
								@Pc(207) int local207 = local127.read();
								local127.seek(0L);
								local127.write(local207);
								local127.seek(0L);
								local127.close();
								aHashtable4.put(arg2, local132);
								return local132;
							}
						}
					} catch (@Pc(226) Exception local226) {
						try {
							if (local127 != null) {
								local127.close();
							}
						} catch (@Pc(234) Exception local234) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "loader!js", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class275(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		this.anInt7862 = arg1;
		this.anApplet2 = arg0;
		aString81 = "1.1";
		aString77 = "Unknown";
		this.aString76 = arg2;
		try {
			aString77 = System.getProperty("java.vendor");
			aString81 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			aString75 = System.getProperty("os.name");
		} catch (@Pc(48) Exception local48) {
			aString75 = "Unknown";
		}
		aString78 = aString75.toLowerCase();
		try {
			aString79 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(59) Exception local59) {
			aString79 = "";
		}
		try {
			aString74 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(67) Exception local67) {
			aString74 = "";
		}
		try {
			aString80 = System.getProperty("user.home");
			if (aString80 != null) {
				aString80 = aString80 + "/";
			}
		} catch (@Pc(87) Exception local87) {
		}
		if (aString80 == null) {
			aString80 = "~/";
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
		} catch (@Pc(153) Exception local153) {
		}
		this.aClass277_1 = new Class277(method6144(this.anInt7862, null, "random.dat"), "rw", 25L);
		this.aClass277_2 = new Class277(this.method6131("main_file_cache.dat2"), "rw", 209715200L);
		this.aClass277_3 = new Class277(this.method6131("main_file_cache.idx255"), "rw", 1048576L);
		this.aClass277Array1 = new Class277[arg3];
		for (@Pc(194) int local194 = 0; local194 < arg3; local194++) {
			this.aClass277Array1[local194] = new Class277(this.method6131("main_file_cache.idx" + local194), "rw", 1048576L);
		}
		try {
			this.aClass271_1 = new Class271();
		} catch (@Pc(226) Throwable local226) {
		}
		try {
			this.aClass270_1 = new Class270();
		} catch (@Pc(233) Throwable local233) {
		}
		@Pc(236) ThreadGroup local236 = Thread.currentThread().getThreadGroup();
		for (@Pc(239) ThreadGroup local239 = local236.getParent(); local239 != null; local239 = local239.getParent()) {
			local236 = local239;
		}
		@Pc(251) Thread[] local251 = new Thread[1000];
		local236.enumerate(local251);
		for (@Pc(257) int local257 = 0; local257 < local251.length; local257++) {
			if (local251[local257] != null && local251[local257].getName().startsWith("AWT")) {
				local251[local257].setPriority(1);
			}
		}
		this.aBoolean669 = false;
		this.aThread4 = new Thread(this);
		this.aThread4.setPriority(10);
		this.aThread4.setDaemon(true);
		this.aThread4.start();
	}

	@OriginalMember(owner = "loader!js", name = "a", descriptor = "(Ljava/net/URL;I)Lloader!jk;")
	private Class274 method6121(@OriginalArg(0) URL arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 0) {
			this.method6150(115, true, null);
		}
		return this.method6143(4, 0, 0, arg0);
	}

	@OriginalMember(owner = "loader!js", name = "a", descriptor = "(IIIII)Lloader!jk;")
	private Class274 method6123(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return arg2 == -246664304 ? this.method6143(6, (arg0 << 16) + arg4, (arg3 << 16) + arg1, null) : (Class274) null;
	}

	@OriginalMember(owner = "loader!js", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class274 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean669) {
						return;
					}
					if (this.aClass274_3 != null) {
						local15 = this.aClass274_3;
						this.aClass274_3 = this.aClass274_3.aClass274_1;
						if (this.aClass274_3 == null) {
							this.aClass274_2 = null;
						}
						break;
					}
					try {
						this.wait();
					} catch (@Pc(31) InterruptedException local31) {
					}
				}
			}
			try {
				@Pc(43) int local43 = local15.anInt7859;
				if (local43 == 1) {
					if (Class276.method6151(-122) < aLong228) {
						throw new IOException();
					}
					local15.anObject11 = new Socket(InetAddress.getByName((String) local15.anObject12), local15.anInt7858);
				} else if (local43 == 2) {
					@Pc(58) Thread local58 = new Thread((Runnable) local15.anObject12);
					local58.setDaemon(true);
					local58.start();
					local58.setPriority(local15.anInt7858);
					local15.anObject11 = local58;
				} else if (local43 == 4) {
					if (Class276.method6151(-128) < aLong228) {
						throw new IOException();
					}
					local15.anObject11 = new DataInputStream(((URL) local15.anObject12).openStream());
				} else {
					@Pc(314) Object[] local314;
					if (local43 == 8) {
						local314 = (Object[]) local15.anObject12;
						if (((Class) local314[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local15.anObject11 = ((Class) local314[0]).getDeclaredMethod((String) local314[1], (Class[]) local314[2]);
					} else if (local43 == 9) {
						local314 = (Object[]) local15.anObject12;
						if (((Class) local314[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local15.anObject11 = ((Class) local314[0]).getDeclaredField((String) local314[1]);
					} else if (local43 == 18) {
						@Pc(105) Clipboard local105 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local15.anObject11 = local105.getContents(null);
					} else if (local43 == 19) {
						@Pc(118) Transferable local118 = (Transferable) local15.anObject12;
						@Pc(121) Clipboard local121 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local121.setContents(local118, null);
					} else {
						@Pc(351) String local351;
						if (local43 == 3) {
							if (Class276.method6151(-110) < aLong228) {
								throw new IOException();
							}
							local351 = (local15.anInt7858 >> 24 & 0xFF) + "." + (local15.anInt7858 >> 16 & 0xFF) + "." + (local15.anInt7858 >> 8 & 0xFF) + "." + (local15.anInt7858 & 0xFF);
							local15.anObject11 = InetAddress.getByName(local351).getHostName();
						} else if (local43 == 21) {
							if (aLong228 > Class276.method6151(-110)) {
								throw new IOException();
							}
							local15.anObject11 = InetAddress.getByName((String) local15.anObject12).getAddress();
						} else if (local43 == 5) {
							local15.anObject11 = this.aClass271_1.method6106();
						} else if (local43 == 6) {
							@Pc(510) Frame local510 = new Frame("Jagex Full Screen");
							local15.anObject11 = local510;
							local510.setResizable(false);
							this.aClass271_1.method6104(local15.anInt7858 >>> 16, local15.anInt7861 & 0xFFFF, local15.anInt7861 >> 16, local510, local15.anInt7858 & 0xFFFF);
						} else if (local43 == 7) {
							this.aClass271_1.method6103();
						} else {
							@Pc(194) int local194;
							if (local43 == 11) {
								@Pc(181) Field local181 = Class.forName("java.lang.ClassLoader").getDeclaredField("nativeLibraries");
								local181.setAccessible(true);
								@Pc(192) Vector local192 = (Vector) local181.get(((Class) local15.anObject12).getClassLoader());
								for (local194 = 0; local192.size() > local194; local194++) {
									@Pc(202) Object local202 = local192.elementAt(local194);
									@Pc(209) Method local209 = local202.getClass().getDeclaredMethod("finalize");
									local209.setAccessible(true);
									local209.invoke(local202);
									local209.setAccessible(false);
									@Pc(226) Field local226 = local202.getClass().getDeclaredField("handle");
									local226.setAccessible(true);
									local226.set(local202, Integer.valueOf(0));
									local226.setAccessible(false);
								}
								local181.setAccessible(false);
							} else if (local43 == 12) {
								@Pc(260) Class277 local260 = method6122(this.aString76, this.anInt7862, (String) local15.anObject12);
								local15.anObject11 = local260;
							} else if (local43 == 14) {
								@Pc(272) int local272 = local15.anInt7858;
								@Pc(275) int local275 = local15.anInt7861;
								this.aClass270_1.method6099(local272, local275);
							} else if (local43 == 15) {
								@Pc(295) boolean local295 = local15.anInt7858 != 0;
								@Pc(299) Component local299 = (Component) local15.anObject12;
								this.aClass270_1.method6098(local299, local295);
							} else if (local43 == 17) {
								local314 = (Object[]) local15.anObject12;
								this.aClass270_1.method6100((Point) local314[2], (Component) local314[0], (int[]) local314[1], local15.anInt7861, local15.anInt7858);
							} else if (local43 == 16) {
								try {
									if (!aString78.startsWith("win")) {
										throw new Exception();
									}
									local351 = (String) local15.anObject12;
									if (!local351.startsWith("http://") && !local351.startsWith("https://")) {
										throw new Exception();
									}
									@Pc(365) String local365 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
									for (local194 = 0; local351.length() > local194; local194++) {
										if (local365.indexOf(local351.charAt(local194)) == -1) {
											throw new Exception();
										}
									}
									Runtime.getRuntime().exec("cmd /c start \"j\" \"" + local351 + "\"");
									local15.anObject11 = null;
								} catch (@Pc(407) Exception local407) {
									local15.anObject11 = local407;
									throw local407;
								}
							} else if (local43 == 20) {
								try {
									@Pc(433) Class[] local433 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
									@Pc(435) Runtime local435 = Runtime.getRuntime();
									@Pc(441) Method local441 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local433);
									local441.setAccessible(true);
									if (aString78.startsWith("win")) {
										if (aString79.startsWith("amd64") || aString79.startsWith("x86_64")) {
											local441.invoke(local435, local15.anObject12, this.method6131("jagmisc64.dll").toString());
										} else {
											local441.invoke(local435, local15.anObject12, this.method6131("jagmisc.dll").toString());
										}
									}
									local441.setAccessible(false);
								} catch (@Pc(501) Throwable local501) {
									local15.anObject11 = local501;
								}
							} else {
								throw new Exception("");
							}
						}
					}
				}
				local15.anInt7860 = 1;
			} catch (@Pc(686) ThreadDeath local686) {
				throw local686;
			} catch (@Pc(689) Throwable local689) {
				local15.anInt7860 = 2;
			}
			synchronized (local15) {
				local15.notify();
			}
		}
	}

	@OriginalMember(owner = "loader!js", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Class;[Ljava/lang/Class;)Lloader!jk;")
	private Class274 method6124(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Class arg2, @OriginalArg(3) Class[] arg3) {
		return arg0 == 8 ? this.method6143(8, 0, 0, new Object[] { arg2, arg1, arg3 }) : (Class274) null;
	}

	@OriginalMember(owner = "loader!js", name = "a", descriptor = "(ILjava/awt/Frame;)Lloader!jk;")
	private Class274 method6125(@OriginalArg(0) int arg0, @OriginalArg(1) Frame arg1) {
		if (arg0 > -64) {
			aString79 = null;
		}
		return this.method6143(7, 0, 0, arg1);
	}

	@OriginalMember(owner = "loader!js", name = "a", descriptor = "(IILjava/lang/String;)Lloader!jk;")
	private Class274 method6126(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		return arg0 == 1 ? this.method6143(1, arg1, 0, arg2) : (Class274) null;
	}

	@OriginalMember(owner = "loader!js", name = "a", descriptor = "(IILjava/lang/Runnable;)Lloader!jk;")
	private Class274 method6127(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Runnable arg2) {
		return arg1 == -34 ? this.method6143(2, arg0, 0, arg2) : (Class274) null;
	}

	@OriginalMember(owner = "loader!js", name = "a", descriptor = "(I)Z")
	private boolean method6128(@OriginalArg(0) int arg0) {
		if (arg0 != -5) {
			this.method6128(-67);
		}
		return this.aClass271_1 != null;
	}

	@OriginalMember(owner = "loader!js", name = "d", descriptor = "(ILjava/lang/String;)[B")
	private byte[] method6129(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(7) Class274 local7 = this.method6130((byte) -92, arg1, 0, 21, arg0);
		return (byte[]) local7.anObject11;
	}

	@OriginalMember(owner = "loader!js", name = "a", descriptor = "(BLjava/lang/Object;III)Lloader!jk;")
	private Class274 method6130(@OriginalArg(0) byte arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(3) Class274 local3 = new Class274();
		synchronized (local3) {
			local3.anObject12 = arg1;
			local3.anInt7858 = arg4;
			local3.anInt7861 = arg2;
			if (arg0 > -32) {
				this.aClass271_1 = null;
			}
			local3.anInt7859 = arg3;
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
			} catch (@Pc(62) InterruptedException local62) {
			}
			return local3;
		}
	}

	@OriginalMember(owner = "loader!js", name = "a", descriptor = "(BLjava/lang/String;)Ljava/io/File;")
	public File method6131(@OriginalArg(1) String arg0) {
		return method6144(this.anInt7862, this.aString76, arg0);
	}

	@OriginalMember(owner = "loader!js", name = "a", descriptor = "(ZLjava/lang/Class;)Lloader!jk;")
	private Class274 method6132(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class arg1) {
		if (!arg0) {
			this.aBoolean669 = false;
		}
		return this.method6143(11, 0, 0, arg1);
	}

	@OriginalMember(owner = "loader!js", name = "b", descriptor = "(Z)Lloader!cq;")
	private Interface13 method6133(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.method6148(true);
		}
		return this.anInterface13_1;
	}

	@OriginalMember(owner = "loader!js", name = "b", descriptor = "(I)Lloader!jk;")
	private Class274 method6134(@OriginalArg(0) int arg0) {
		if (arg0 != 0) {
			aString75 = null;
		}
		return this.method6143(5, 0, 0, null);
	}

	@OriginalMember(owner = "loader!js", name = "c", descriptor = "(ILjava/lang/String;)Lloader!jk;")
	private Class274 method6135(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (arg0 != 16) {
			this.anEventQueue2 = null;
		}
		return this.method6143(12, 0, 0, arg1);
	}

	@OriginalMember(owner = "loader!js", name = "d", descriptor = "(I)V")
	private void method6136(@OriginalArg(0) int arg0) {
		synchronized (this) {
			this.aBoolean669 = true;
			this.notifyAll();
		}
		if (arg0 <= 59) {
			this.anInt7862 = 74;
		}
		try {
			this.aThread4.join();
		} catch (@Pc(27) InterruptedException local27) {
		}
		if (this.aClass277_2 != null) {
			try {
				this.aClass277_2.method6160();
			} catch (@Pc(36) IOException local36) {
			}
		}
		if (this.aClass277_3 != null) {
			try {
				this.aClass277_3.method6160();
			} catch (@Pc(47) IOException local47) {
			}
		}
		if (this.aClass277Array1 != null) {
			for (@Pc(52) int local52 = 0; local52 < this.aClass277Array1.length; local52++) {
				if (this.aClass277Array1[local52] != null) {
					try {
						this.aClass277Array1[local52].method6160();
					} catch (@Pc(71) IOException local71) {
					}
				}
			}
		}
		if (this.aClass277_1 != null) {
			try {
				this.aClass277_1.method6160();
			} catch (@Pc(82) IOException local82) {
			}
		}
	}

	@OriginalMember(owner = "loader!js", name = "a", descriptor = "(Ljava/lang/Class;B)Lloader!jk;")
	private Class274 method6137(@OriginalArg(0) Class arg0, @OriginalArg(1) byte arg1) {
		return arg1 == -27 ? this.method6143(20, 0, 0, arg0) : (Class274) null;
	}

	@OriginalMember(owner = "loader!js", name = "a", descriptor = "(Ljava/awt/Component;Ljava/awt/Point;[IIII)Lloader!jk;")
	private Class274 method6138(@OriginalArg(0) Component arg0, @OriginalArg(1) Point arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg3 != 17) {
			this.aClass271_1 = null;
		}
		return this.method6143(17, arg5, arg4, new Object[] { arg0, arg2, arg1 });
	}

	@OriginalMember(owner = "loader!js", name = "a", descriptor = "(ILjava/lang/Class;)V")
	private void method6139(@OriginalArg(0) int arg0, @OriginalArg(1) Class arg1) throws Exception {
		@Pc(12) Class[] local12 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
		if (arg0 < 42) {
			this.method6136(118);
		}
		@Pc(20) Runtime local20 = Runtime.getRuntime();
		@Pc(31) Method local31 = Class.forName("java.lang.reflect.Method").getMethod("setAccessible", Boolean.TYPE);
		@Pc(41) Method local41;
		if (!aString78.startsWith("mac")) {
			local41 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", local12);
			local31.invoke(local41, Boolean.TRUE);
			local41.invoke(local20, arg1, "jawt");
			local31.invoke(local41, Boolean.FALSE);
		}
		local41 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local12);
		local31.invoke(local41, Boolean.TRUE);
		if (!aString78.startsWith("win")) {
			throw new Exception();
		}
		local41.invoke(local20, arg1, this.method6131("sw3d.dll").toString());
		local31.invoke(local41, Boolean.FALSE);
	}

	@OriginalMember(owner = "loader!js", name = "a", descriptor = "(Ljava/awt/datatransfer/Transferable;Z)Lloader!jk;")
	private Class274 method6140(@OriginalArg(0) Transferable arg0, @OriginalArg(1) boolean arg1) {
		if (arg1) {
			aString74 = null;
		}
		return this.method6143(19, 0, 0, arg0);
	}

	@OriginalMember(owner = "loader!js", name = "c", descriptor = "(I)V")
	private void method6141(@OriginalArg(0) int arg0) {
		if (arg0 != 3) {
			this.method6145(-44, null);
		}
		aLong228 = Class276.method6151(arg0 ^ 0xFFFFFF86) + 5000L;
	}

	@OriginalMember(owner = "loader!js", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/Class;)Lloader!jk;")
	private Class274 method6142(@OriginalArg(0) byte arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Class arg2) {
		return arg0 == -23 ? this.method6143(9, 0, 0, new Object[] { arg2, arg1 }) : (Class274) null;
	}

	@OriginalMember(owner = "loader!js", name = "a", descriptor = "(IIIBLjava/lang/Object;)Lloader!jk;")
	private Class274 method6143(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Object arg3) {
		@Pc(3) Class274 local3 = new Class274();
		local3.anObject12 = arg3;
		local3.anInt7861 = arg2;
		local3.anInt7858 = arg1;
		local3.anInt7859 = arg0;
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

	@OriginalMember(owner = "loader!js", name = "b", descriptor = "(ILjava/lang/String;)Lloader!jk;")
	private Class274 method6145(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (arg0 > -93) {
			method6122(null, -112, null);
		}
		return this.method6143(21, 0, 0, arg1);
	}

	@OriginalMember(owner = "loader!js", name = "a", descriptor = "(BI)Lloader!jk;")
	private Class274 method6146(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		return arg0 == -33 ? this.method6143(3, arg1, 0, null) : (Class274) null;
	}

	@OriginalMember(owner = "loader!js", name = "a", descriptor = "(ILjava/lang/String;)Lloader!jk;")
	private Class274 method6147(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (arg0 != 19) {
			aMethod4 = null;
		}
		return this.method6143(16, 0, 0, arg1);
	}

	@OriginalMember(owner = "loader!js", name = "a", descriptor = "(Z)Lloader!jk;")
	private Class274 method6148(@OriginalArg(0) boolean arg0) {
		if (!arg0) {
			this.run();
		}
		return this.method6143(18, 0, 0, null);
	}

	@OriginalMember(owner = "loader!js", name = "a", descriptor = "(ILjava/awt/Component;II)Lloader!jk;")
	private Class274 method6149(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) Point local2 = arg1.getLocationOnScreen();
		return arg3 == 14 ? this.method6143(14, local2.x + arg2, arg0 - -local2.y, null) : (Class274) null;
	}

	@OriginalMember(owner = "loader!js", name = "a", descriptor = "(IZLjava/awt/Component;)Lloader!jk;")
	private Class274 method6150(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Component arg2) {
		if (arg0 != 15) {
			this.aBoolean669 = false;
		}
		return this.method6143(15, arg1 ? 1 : 0, 0, arg2);
	}
}
