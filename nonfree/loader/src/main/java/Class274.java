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

@OriginalClass("loader!qn")
public final class Class274 implements Runnable {

	@OriginalMember(owner = "loader!qn", name = "d", descriptor = "Ljava/lang/String;")
	private static String aString78;

	@OriginalMember(owner = "loader!qn", name = "i", descriptor = "Ljava/lang/String;")
	private static String aString79;

	@OriginalMember(owner = "loader!qn", name = "p", descriptor = "Ljava/lang/String;")
	private static String aString80;

	@OriginalMember(owner = "loader!qn", name = "l", descriptor = "Ljava/lang/String;")
	private static String aString82;

	@OriginalMember(owner = "loader!qn", name = "r", descriptor = "Ljava/lang/String;")
	public static String aString83;

	@OriginalMember(owner = "loader!qn", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString84;

	@OriginalMember(owner = "loader!qn", name = "A", descriptor = "Ljava/lang/String;")
	private static String aString85;

	@OriginalMember(owner = "loader!qn", name = "w", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod3;

	@OriginalMember(owner = "loader!qn", name = "y", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod4;

	@OriginalMember(owner = "loader!qn", name = "s", descriptor = "I")
	private static final int anInt8078 = 1;

	@OriginalMember(owner = "loader!qn", name = "t", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable4 = new Hashtable(16);

	@OriginalMember(owner = "loader!qn", name = "x", descriptor = "J")
	private static volatile long aLong234 = 0L;

	@OriginalMember(owner = "loader!qn", name = "j", descriptor = "Lloader!cd;")
	private Interface13 anInterface13_1;

	@OriginalMember(owner = "loader!qn", name = "f", descriptor = "Lloader!de;")
	private Class269 aClass269_1 = null;

	@OriginalMember(owner = "loader!qn", name = "o", descriptor = "Lloader!it;")
	private Class273 aClass273_2 = null;

	@OriginalMember(owner = "loader!qn", name = "q", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3 = null;

	@OriginalMember(owner = "loader!qn", name = "b", descriptor = "Z")
	private boolean aBoolean502 = false;

	@OriginalMember(owner = "loader!qn", name = "v", descriptor = "Lloader!de;")
	private Class269 aClass269_2 = null;

	@OriginalMember(owner = "loader!qn", name = "u", descriptor = "Lloader!it;")
	private Class273 aClass273_3 = null;

	@OriginalMember(owner = "loader!qn", name = "n", descriptor = "Lloader!de;")
	private Class269 aClass269_3 = null;

	@OriginalMember(owner = "loader!qn", name = "z", descriptor = "I")
	private final int anInt8079;

	@OriginalMember(owner = "loader!qn", name = "k", descriptor = "Ljava/lang/String;")
	private final String aString81;

	@OriginalMember(owner = "loader!qn", name = "e", descriptor = "Ljava/awt/EventQueue;")
	private EventQueue anEventQueue2;

	@OriginalMember(owner = "loader!qn", name = "g", descriptor = "[Lloader!de;")
	private final Class269[] aClass269Array1;

	@OriginalMember(owner = "loader!qn", name = "a", descriptor = "Lloader!h;")
	private Class272 aClass272_1;

	@OriginalMember(owner = "loader!qn", name = "c", descriptor = "Lloader!b;")
	private Class268 aClass268_1;

	@OriginalMember(owner = "loader!qn", name = "m", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread4;

	@OriginalMember(owner = "loader!qn", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IB)Ljava/io/File;")
	private static File method6651(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(4) File local4 = (File) aHashtable4.get(arg1);
		if (local4 != null) {
			return local4;
		}
		@Pc(44) String[] local44 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString85, "/tmp/", "" };
		@Pc(69) String[] local69 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
		for (@Pc(71) int local71 = 0; local71 < 2; local71++) {
			for (@Pc(86) int local86 = 0; local86 < local69.length; local86++) {
				for (@Pc(92) int local92 = 0; local92 < local44.length; local92++) {
					@Pc(126) String local126 = local44[local92] + local69[local86] + "/" + (arg0 == null ? "" : arg0 + "/") + arg1;
					@Pc(128) RandomAccessFile local128 = null;
					try {
						@Pc(133) File local133 = new File(local126);
						if (local71 != 0 || local133.exists()) {
							@Pc(146) String local146 = local44[local92];
							if (local71 != 1 || local146.length() <= 0 || (new File(local146)).exists()) {
								(new File(local44[local92] + local69[local86])).mkdir();
								if (arg0 != null) {
									(new File(local44[local92] + local69[local86] + "/" + arg0)).mkdir();
								}
								local128 = new RandomAccessFile(local133, "rw");
								@Pc(211) int local211 = local128.read();
								local128.seek(0L);
								local128.write(local211);
								local128.seek(0L);
								local128.close();
								aHashtable4.put(arg1, local133);
								return local133;
							}
						}
					} catch (@Pc(230) Exception local230) {
						try {
							if (local128 != null) {
								local128.close();
							}
						} catch (@Pc(238) Exception local238) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "loader!qn", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;II)Lloader!de;")
	private static Class269 method6659(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(22) String local22;
		if (arg2 == 33) {
			local22 = "jagex_" + arg1 + "_preferences" + arg0 + "_rc.dat";
		} else if (arg2 == 34) {
			local22 = "jagex_" + arg1 + "_preferences" + arg0 + "_wip.dat";
		} else {
			local22 = "jagex_" + arg1 + "_preferences" + arg0 + ".dat";
		}
		@Pc(89) String[] local89 = new String[] { "c:/rscache/", "/rscache/", aString85, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(91) int local91 = 0; local91 < local89.length; local91++) {
			@Pc(105) String local105 = local89[local91];
			if (local105.length() <= 0 || (new File(local105)).exists()) {
				try {
					return new Class269(new File(local105, local22), "rw", 10000L);
				} catch (@Pc(131) Exception local131) {
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "loader!qn", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class274(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		aString84 = "Unknown";
		this.anInt8079 = arg1;
		aString83 = "1.1";
		this.anApplet3 = arg0;
		this.aString81 = arg2;
		try {
			aString84 = System.getProperty("java.vendor");
			aString83 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			aString78 = System.getProperty("os.name");
		} catch (@Pc(48) Exception local48) {
			aString78 = "Unknown";
		}
		aString79 = aString78.toLowerCase();
		try {
			aString82 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(59) Exception local59) {
			aString82 = "";
		}
		try {
			aString80 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(67) Exception local67) {
			aString80 = "";
		}
		try {
			aString85 = System.getProperty("user.home");
			if (aString85 != null) {
				aString85 = aString85 + "/";
			}
		} catch (@Pc(85) Exception local85) {
		}
		if (aString85 == null) {
			aString85 = "~/";
		}
		try {
			this.anEventQueue2 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(96) Throwable local96) {
		}
		try {
			if (arg0 == null) {
				aMethod3 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				aMethod3 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(124) Exception local124) {
		}
		try {
			if (arg0 == null) {
				aMethod4 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				aMethod4 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(151) Exception local151) {
		}
		this.aClass269_3 = new Class269(method6651(null, "random.dat", this.anInt8079), "rw", 25L);
		this.aClass269_1 = new Class269(this.method6662("main_file_cache.dat2"), "rw", 209715200L);
		this.aClass269_2 = new Class269(this.method6662("main_file_cache.idx255"), "rw", 1048576L);
		this.aClass269Array1 = new Class269[arg3];
		for (@Pc(192) int local192 = 0; local192 < arg3; local192++) {
			this.aClass269Array1[local192] = new Class269(this.method6662("main_file_cache.idx" + local192), "rw", 1048576L);
		}
		try {
			this.aClass272_1 = new Class272();
		} catch (@Pc(228) Throwable local228) {
		}
		try {
			this.aClass268_1 = new Class268();
		} catch (@Pc(235) Throwable local235) {
		}
		@Pc(238) ThreadGroup local238 = Thread.currentThread().getThreadGroup();
		for (@Pc(241) ThreadGroup local241 = local238.getParent(); local241 != null; local241 = local241.getParent()) {
			local238 = local241;
		}
		@Pc(253) Thread[] local253 = new Thread[1000];
		local238.enumerate(local253);
		for (@Pc(259) int local259 = 0; local259 < local253.length; local259++) {
			if (local253[local259] != null && local253[local259].getName().startsWith("AWT")) {
				local253[local259].setPriority(1);
			}
		}
		this.aBoolean502 = false;
		this.aThread4 = new Thread(this);
		this.aThread4.setPriority(10);
		this.aThread4.setDaemon(true);
		this.aThread4.start();
	}

	@OriginalMember(owner = "loader!qn", name = "a", descriptor = "(ZBLjava/awt/Component;)Lloader!it;")
	private Class273 method6639(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) Component arg2) {
		if (arg1 != 3) {
			this.method6649(true, null);
		}
		return this.method6653(arg0 ? 1 : 0, arg2, (byte) -53, 0, 15);
	}

	@OriginalMember(owner = "loader!qn", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;I)Lloader!it;")
	private Class273 method6640(@OriginalArg(0) String arg0, @OriginalArg(1) Class arg1, @OriginalArg(2) int arg2) {
		if (arg2 != 0) {
			aMethod4 = null;
		}
		return this.method6653(0, new Object[] { arg1, arg0 }, (byte) -53, 0, 9);
	}

	@OriginalMember(owner = "loader!qn", name = "a", descriptor = "(Ljava/lang/String;Z)Lloader!it;")
	private Class273 method6641(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) {
		return arg1 ? (Class273) null : this.method6653(0, arg0, (byte) -53, 0, 16);
	}

	@OriginalMember(owner = "loader!qn", name = "a", descriptor = "(Ljava/lang/Runnable;II)Lloader!it;")
	private Class273 method6642(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 != 2) {
			this.aClass272_1 = null;
		}
		return this.method6653(arg2, arg0, (byte) -53, 0, 2);
	}

	@OriginalMember(owner = "loader!qn", name = "a", descriptor = "(Ljava/lang/String;I)[B")
	private byte[] method6643(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (arg1 <= 49) {
			this.method6641(null, true);
		}
		@Pc(16) Class273 local16 = this.method6665(false, 0, 0, 21, arg0);
		return (byte[]) local16.anObject13;
	}

	@OriginalMember(owner = "loader!qn", name = "a", descriptor = "(IIILjava/awt/Component;)Lloader!it;")
	private Class273 method6644(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Component arg2) {
		@Pc(2) Point local2 = arg2.getLocationOnScreen();
		return this.method6653(arg1 + local2.x, null, (byte) -53, local2.y + arg0, 14);
	}

	@OriginalMember(owner = "loader!qn", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class273 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean502) {
						return;
					}
					if (this.aClass273_2 != null) {
						local15 = this.aClass273_2;
						this.aClass273_2 = this.aClass273_2.aClass273_1;
						if (this.aClass273_2 == null) {
							this.aClass273_3 = null;
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
				@Pc(45) int local45 = local15.anInt8073;
				if (local45 == 1) {
					if (Class275.method6668() < aLong234) {
						throw new IOException();
					}
					local15.anObject13 = new Socket(InetAddress.getByName((String) local15.anObject14), local15.anInt8071);
				} else if (local45 == 2) {
					@Pc(58) Thread local58 = new Thread((Runnable) local15.anObject14);
					local58.setDaemon(true);
					local58.start();
					local58.setPriority(local15.anInt8071);
					local15.anObject13 = local58;
				} else if (local45 == 4) {
					if (aLong234 > Class275.method6668()) {
						throw new IOException();
					}
					local15.anObject13 = new DataInputStream(((URL) local15.anObject14).openStream());
				} else {
					@Pc(84) Object[] local84;
					if (local45 == 8) {
						local84 = (Object[]) local15.anObject14;
						if (((Class) local84[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local15.anObject13 = ((Class) local84[0]).getDeclaredMethod((String) local84[1], (Class[]) local84[2]);
					} else if (local45 == 9) {
						local84 = (Object[]) local15.anObject14;
						if (((Class) local84[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local15.anObject13 = ((Class) local84[0]).getDeclaredField((String) local84[1]);
					} else if (local45 == 18) {
						@Pc(151) Clipboard local151 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local15.anObject13 = local151.getContents(null);
					} else if (local45 == 19) {
						@Pc(166) Transferable local166 = (Transferable) local15.anObject14;
						@Pc(169) Clipboard local169 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local169.setContents(local166, null);
					} else {
						@Pc(223) String local223;
						if (local45 == 3) {
							if (aLong234 > Class275.method6668()) {
								throw new IOException();
							}
							local223 = (local15.anInt8071 >> 24 & 0xFF) + "." + (local15.anInt8071 >> 16 & 0xFF) + "." + (local15.anInt8071 >> 8 & 0xFF) + "." + (local15.anInt8071 & 0xFF);
							local15.anObject13 = InetAddress.getByName(local223).getHostName();
						} else if (local45 == 21) {
							if (Class275.method6668() < aLong234) {
								throw new IOException();
							}
							local15.anObject13 = InetAddress.getByName((String) local15.anObject14).getAddress();
						} else if (local45 == 5) {
							local15.anObject13 = this.aClass272_1.method6629();
						} else if (local45 == 6) {
							@Pc(262) Frame local262 = new Frame("Jagex Full Screen");
							local15.anObject13 = local262;
							local262.setResizable(false);
							this.aClass272_1.method6631(local15.anInt8070 & 0xFFFF, local15.anInt8070 >> 16, local262, local15.anInt8071 & 0xFFFF, local15.anInt8071 >>> 16);
						} else if (local45 == 7) {
							this.aClass272_1.method6632();
						} else {
							@Pc(475) int local475;
							if (local45 == 11) {
								@Pc(571) Field local571 = Class.forName("java.lang.ClassLoader").getDeclaredField("nativeLibraries");
								local571.setAccessible(true);
								@Pc(582) Vector local582 = (Vector) local571.get(((Class) local15.anObject14).getClassLoader());
								for (local475 = 0; local582.size() > local475; local475++) {
									@Pc(596) Object local596 = local582.elementAt(local475);
									@Pc(603) Method local603 = local596.getClass().getDeclaredMethod("finalize");
									local603.setAccessible(true);
									local603.invoke(local596);
									local603.setAccessible(false);
									@Pc(620) Field local620 = local596.getClass().getDeclaredField("handle");
									local620.setAccessible(true);
									local620.set(local596, Integer.valueOf(0));
									local620.setAccessible(false);
								}
								local571.setAccessible(false);
							} else if (local45 == 12) {
								@Pc(318) Class269 local318 = method6659((String) local15.anObject14, this.aString81, this.anInt8079);
								local15.anObject13 = local318;
							} else if (local45 == 14) {
								@Pc(330) int local330 = local15.anInt8071;
								@Pc(333) int local333 = local15.anInt8070;
								this.aClass268_1.method6611(local330, local333);
							} else if (local45 == 15) {
								@Pc(555) boolean local555 = local15.anInt8071 != 0;
								@Pc(559) Component local559 = (Component) local15.anObject14;
								this.aClass268_1.method6610(local555, local559);
							} else if (local45 == 17) {
								local84 = (Object[]) local15.anObject14;
								this.aClass268_1.method6609(local15.anInt8070, local15.anInt8071, (Component) local84[0], (int[]) local84[1], (Point) local84[2]);
							} else if (local45 == 16) {
								try {
									if (!aString79.startsWith("win")) {
										throw new Exception();
									}
									local223 = (String) local15.anObject14;
									if (!local223.startsWith("http://") && !local223.startsWith("https://")) {
										throw new Exception();
									}
									@Pc(473) String local473 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
									for (local475 = 0; local223.length() > local475; local475++) {
										if (local473.indexOf(local223.charAt(local475)) == -1) {
											throw new Exception();
										}
									}
									Runtime.getRuntime().exec("cmd /c start \"j\" \"" + local223 + "\"");
									local15.anObject13 = null;
								} catch (@Pc(516) Exception local516) {
									local15.anObject13 = local516;
									throw local516;
								}
							} else if (local45 == 20) {
								try {
									@Pc(369) Class[] local369 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
									@Pc(371) Runtime local371 = Runtime.getRuntime();
									@Pc(377) Method local377 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local369);
									local377.setAccessible(true);
									if (aString79.startsWith("win")) {
										if (aString82.startsWith("amd64") || aString82.startsWith("x86_64")) {
											local377.invoke(local371, local15.anObject14, this.method6662("jagmisc64.dll").toString());
										} else {
											local377.invoke(local371, local15.anObject14, this.method6662("jagmisc.dll").toString());
										}
									}
									local377.setAccessible(false);
								} catch (@Pc(437) Throwable local437) {
									local15.anObject13 = local437;
								}
							} else {
								throw new Exception("");
							}
						}
					}
				}
				local15.anInt8072 = 1;
			} catch (@Pc(690) ThreadDeath local690) {
				throw local690;
			} catch (@Pc(693) Throwable local693) {
				local15.anInt8072 = 2;
			}
			synchronized (local15) {
				local15.notify();
			}
		}
	}

	@OriginalMember(owner = "loader!qn", name = "a", descriptor = "([Ljava/lang/Class;Ljava/lang/String;ILjava/lang/Class;)Lloader!it;")
	private Class273 method6645(@OriginalArg(0) Class[] arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		return arg2 == 1983 ? this.method6653(0, new Object[] { arg3, arg1, arg0 }, (byte) -53, 0, 8) : (Class273) null;
	}

	@OriginalMember(owner = "loader!qn", name = "b", descriptor = "(I)Lloader!cd;")
	private Interface13 method6646(@OriginalArg(0) int arg0) {
		return arg0 >= -26 ? (Interface13) null : this.anInterface13_1;
	}

	@OriginalMember(owner = "loader!qn", name = "a", descriptor = "(BLjava/net/URL;)Lloader!it;")
	private Class273 method6647(@OriginalArg(0) byte arg0, @OriginalArg(1) URL arg1) {
		if (arg0 != 2) {
			this.aClass269_2 = null;
		}
		return this.method6653(0, arg1, (byte) -53, 0, 4);
	}

	@OriginalMember(owner = "loader!qn", name = "c", descriptor = "(I)Lloader!it;")
	private Class273 method6648(@OriginalArg(0) int arg0) {
		if (arg0 != 29756) {
			this.aClass269_1 = null;
		}
		return this.method6653(0, null, (byte) -53, 0, 5);
	}

	@OriginalMember(owner = "loader!qn", name = "a", descriptor = "(ZLjava/awt/datatransfer/Transferable;)Lloader!it;")
	private Class273 method6649(@OriginalArg(0) boolean arg0, @OriginalArg(1) Transferable arg1) {
		return arg0 ? (Class273) null : this.method6653(0, arg1, (byte) -53, 0, 19);
	}

	@OriginalMember(owner = "loader!qn", name = "a", descriptor = "(IBLjava/lang/String;)Lloader!it;")
	private Class273 method6650(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) String arg2) {
		if (arg1 != 111) {
			this.aClass273_3 = null;
		}
		return this.method6653(arg0, arg2, (byte) -53, 0, 1);
	}

	@OriginalMember(owner = "loader!qn", name = "b", descriptor = "(B)Z")
	private boolean method6652(@OriginalArg(0) byte arg0) {
		if (arg0 != 54) {
			this.method6658(null, false);
		}
		return this.aClass272_1 != null;
	}

	@OriginalMember(owner = "loader!qn", name = "a", descriptor = "(ILjava/lang/Object;BII)Lloader!it;")
	private Class273 method6653(@OriginalArg(0) int arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(3) Class273 local3 = new Class273();
		local3.anInt8071 = arg0;
		local3.anInt8073 = arg4;
		local3.anObject14 = arg1;
		local3.anInt8070 = arg3;
		synchronized (this) {
			if (this.aClass273_3 == null) {
				this.aClass273_3 = this.aClass273_2 = local3;
			} else {
				this.aClass273_3.aClass273_1 = local3;
				this.aClass273_3 = local3;
			}
			if (arg2 != -53) {
				this.anInterface13_1 = null;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "loader!qn", name = "a", descriptor = "(ILjava/lang/String;)Lloader!it;")
	private Class273 method6654(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (arg0 != 14) {
			aString82 = null;
		}
		return this.method6653(0, arg1, (byte) -53, 0, 12);
	}

	@OriginalMember(owner = "loader!qn", name = "a", descriptor = "(I)V")
	private void method6655(@OriginalArg(0) int arg0) {
		synchronized (this) {
			this.aBoolean502 = true;
			this.notifyAll();
		}
		try {
			this.aThread4.join();
		} catch (@Pc(21) InterruptedException local21) {
		}
		if (this.aClass269_1 != null) {
			try {
				this.aClass269_1.method6624();
			} catch (@Pc(31) IOException local31) {
			}
		}
		if (arg0 <= 62) {
			return;
		}
		if (this.aClass269_2 != null) {
			try {
				this.aClass269_2.method6624();
			} catch (@Pc(44) IOException local44) {
			}
		}
		if (this.aClass269Array1 != null) {
			for (@Pc(49) int local49 = 0; local49 < this.aClass269Array1.length; local49++) {
				if (this.aClass269Array1[local49] != null) {
					try {
						this.aClass269Array1[local49].method6624();
					} catch (@Pc(72) IOException local72) {
					}
				}
			}
		}
		if (this.aClass269_3 != null) {
			try {
				this.aClass269_3.method6624();
			} catch (@Pc(85) IOException local85) {
			}
		}
	}

	@OriginalMember(owner = "loader!qn", name = "a", descriptor = "(B)Lloader!it;")
	private Class273 method6656(@OriginalArg(0) byte arg0) {
		if (arg0 != 59) {
			this.method6664(null);
		}
		return this.method6653(0, null, (byte) -53, 0, 18);
	}

	@OriginalMember(owner = "loader!qn", name = "a", descriptor = "(I[IILjava/awt/Component;ILjava/awt/Point;)Lloader!it;")
	private Class273 method6657(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) Component arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Point arg4) {
		return this.method6653(arg0, new Object[] { arg2, arg1, arg4 }, (byte) -53, arg3, 17);
	}

	@OriginalMember(owner = "loader!qn", name = "a", descriptor = "(Ljava/lang/Class;Z)Lloader!it;")
	private Class273 method6658(@OriginalArg(0) Class arg0, @OriginalArg(1) boolean arg1) {
		if (arg1) {
			this.method6662(null);
		}
		return this.method6653(0, arg0, (byte) -53, 0, 11);
	}

	@OriginalMember(owner = "loader!qn", name = "a", descriptor = "(BLjava/awt/Frame;)Lloader!it;")
	private Class273 method6660(@OriginalArg(0) byte arg0, @OriginalArg(1) Frame arg1) {
		return arg0 == 25 ? this.method6653(0, arg1, (byte) -53, 0, 7) : (Class273) null;
	}

	@OriginalMember(owner = "loader!qn", name = "a", descriptor = "(Ljava/lang/Class;B)Lloader!it;")
	private Class273 method6661(@OriginalArg(0) Class arg0, @OriginalArg(1) byte arg1) {
		if (arg1 <= 63) {
			this.method6640(null, null, 15);
		}
		return this.method6653(0, arg0, (byte) -53, 0, 20);
	}

	@OriginalMember(owner = "loader!qn", name = "b", descriptor = "(ILjava/lang/String;)Ljava/io/File;")
	public File method6662(@OriginalArg(1) String arg0) {
		return method6651(this.aString81, arg0, this.anInt8079);
	}

	@OriginalMember(owner = "loader!qn", name = "a", descriptor = "(IIIII)Lloader!it;")
	private Class273 method6663(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return arg0 == 17659 ? this.method6653(arg2 + (arg4 << 16), null, (byte) -53, (arg3 << 16) + arg1, 6) : (Class273) null;
	}

	@OriginalMember(owner = "loader!qn", name = "a", descriptor = "(Ljava/lang/String;B)Lloader!it;")
	private Class273 method6664(@OriginalArg(0) String arg0) {
		return this.method6653(0, arg0, (byte) -53, 0, 21);
	}

	@OriginalMember(owner = "loader!qn", name = "a", descriptor = "(ZIIILjava/lang/Object;)Lloader!it;")
	private Class273 method6665(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Object arg4) {
		@Pc(3) Class273 local3 = new Class273();
		synchronized (local3) {
			local3.anObject14 = arg4;
			local3.anInt8070 = arg2;
			local3.anInt8073 = arg3;
			local3.anInt8071 = arg1;
			synchronized (this) {
				if (this.aClass273_3 == null) {
					this.aClass273_3 = this.aClass273_2 = local3;
				} else {
					this.aClass273_3.aClass273_1 = local3;
					this.aClass273_3 = local3;
				}
				this.notify();
			}
			try {
				local3.wait();
			} catch (@Pc(55) InterruptedException local55) {
			}
			if (arg0) {
				this.aClass272_1 = null;
			}
			return local3;
		}
	}

	@OriginalMember(owner = "loader!qn", name = "a", descriptor = "(II)Lloader!it;")
	private Class273 method6666(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 != 0) {
			this.method6658(null, false);
		}
		return this.method6653(arg1, null, (byte) -53, 0, 3);
	}

	@OriginalMember(owner = "loader!qn", name = "a", descriptor = "(Z)V")
	private void method6667(@OriginalArg(0) boolean arg0) {
		if (!arg0) {
			this.method6664(null);
		}
		aLong234 = Class275.method6668() + 5000L;
	}
}
