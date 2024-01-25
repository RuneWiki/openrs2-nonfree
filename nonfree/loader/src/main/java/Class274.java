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

@OriginalClass("loader!ji")
public final class Class274 implements Runnable {

	@OriginalMember(owner = "loader!ji", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString75;

	@OriginalMember(owner = "loader!ji", name = "p", descriptor = "Ljava/lang/String;")
	private static String aString76;

	@OriginalMember(owner = "loader!ji", name = "n", descriptor = "Ljava/lang/String;")
	private static String aString77;

	@OriginalMember(owner = "loader!ji", name = "s", descriptor = "Ljava/lang/String;")
	private static String aString78;

	@OriginalMember(owner = "loader!ji", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString79;

	@OriginalMember(owner = "loader!ji", name = "a", descriptor = "Ljava/lang/String;")
	private static String aString80;

	@OriginalMember(owner = "loader!ji", name = "v", descriptor = "Ljava/lang/String;")
	private static String aString81;

	@OriginalMember(owner = "loader!ji", name = "w", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod3;

	@OriginalMember(owner = "loader!ji", name = "y", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod4;

	@OriginalMember(owner = "loader!ji", name = "h", descriptor = "I")
	private static final int anInt7460 = 1;

	@OriginalMember(owner = "loader!ji", name = "l", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable4 = new Hashtable(16);

	@OriginalMember(owner = "loader!ji", name = "x", descriptor = "J")
	private static volatile long aLong227 = 0L;

	@OriginalMember(owner = "loader!ji", name = "z", descriptor = "Lloader!af;")
	private Interface13 anInterface13_1;

	@OriginalMember(owner = "loader!ji", name = "g", descriptor = "Lloader!rv;")
	private Class277 aClass277_2 = null;

	@OriginalMember(owner = "loader!ji", name = "k", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2 = null;

	@OriginalMember(owner = "loader!ji", name = "i", descriptor = "Lloader!rm;")
	private Class276 aClass276_2 = null;

	@OriginalMember(owner = "loader!ji", name = "r", descriptor = "Lloader!rv;")
	private Class277 aClass277_1 = null;

	@OriginalMember(owner = "loader!ji", name = "m", descriptor = "Lloader!rv;")
	private Class277 aClass277_3 = null;

	@OriginalMember(owner = "loader!ji", name = "A", descriptor = "Z")
	private boolean aBoolean614 = false;

	@OriginalMember(owner = "loader!ji", name = "u", descriptor = "Lloader!rm;")
	private Class276 aClass276_1 = null;

	@OriginalMember(owner = "loader!ji", name = "c", descriptor = "Ljava/lang/String;")
	private final String aString74;

	@OriginalMember(owner = "loader!ji", name = "q", descriptor = "I")
	private final int anInt7461;

	@OriginalMember(owner = "loader!ji", name = "e", descriptor = "Ljava/awt/EventQueue;")
	private EventQueue anEventQueue2;

	@OriginalMember(owner = "loader!ji", name = "d", descriptor = "[Lloader!rv;")
	private final Class277[] aClass277Array1;

	@OriginalMember(owner = "loader!ji", name = "o", descriptor = "Lloader!b;")
	private Class271 aClass271_1;

	@OriginalMember(owner = "loader!ji", name = "b", descriptor = "Lloader!g;")
	private Class273 aClass273_1;

	@OriginalMember(owner = "loader!ji", name = "t", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread4;

	@OriginalMember(owner = "loader!ji", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;I)Ljava/io/File;")
	private static File method5670(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		@Pc(4) File local4 = (File) aHashtable4.get(arg0);
		if (local4 != null) {
			return local4;
		}
		@Pc(44) String[] local44 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString77, "/tmp/", "" };
		@Pc(69) String[] local69 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
		for (@Pc(71) int local71 = 0; local71 < 2; local71++) {
			for (@Pc(78) int local78 = 0; local78 < local69.length; local78++) {
				for (@Pc(88) int local88 = 0; local88 < local44.length; local88++) {
					@Pc(122) String local122 = local44[local88] + local69[local78] + "/" + (arg1 == null ? "" : arg1 + "/") + arg0;
					@Pc(124) RandomAccessFile local124 = null;
					try {
						@Pc(129) File local129 = new File(local122);
						if (local71 != 0 || local129.exists()) {
							@Pc(139) String local139 = local44[local88];
							if (local71 != 1 || local139.length() <= 0 || (new File(local139)).exists()) {
								(new File(local44[local88] + local69[local78])).mkdir();
								if (arg1 != null) {
									(new File(local44[local88] + local69[local78] + "/" + arg1)).mkdir();
								}
								local124 = new RandomAccessFile(local129, "rw");
								@Pc(208) int local208 = local124.read();
								local124.seek(0L);
								local124.write(local208);
								local124.seek(0L);
								local124.close();
								aHashtable4.put(arg0, local129);
								return local129;
							}
						}
					} catch (@Pc(227) Exception local227) {
						try {
							if (local124 != null) {
								local124.close();
							}
						} catch (@Pc(236) Exception local236) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "loader!ji", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;Z)Lloader!rv;")
	private static Class277 method5693(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		@Pc(19) String local19;
		if (arg1 == 33) {
			local19 = "jagex_" + arg0 + "_preferences" + arg2 + "_rc.dat";
		} else if (arg1 == 34) {
			local19 = "jagex_" + arg0 + "_preferences" + arg2 + "_wip.dat";
		} else {
			local19 = "jagex_" + arg0 + "_preferences" + arg2 + ".dat";
		}
		@Pc(89) String[] local89 = new String[] { "c:/rscache/", "/rscache/", aString77, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(96) int local96 = 0; local96 < local89.length; local96++) {
			@Pc(104) String local104 = local89[local96];
			if (local104.length() <= 0 || (new File(local104)).exists()) {
				try {
					return new Class277(new File(local104, local19), "rw", 10000L);
				} catch (@Pc(130) Exception local130) {
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "loader!ji", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class274(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		aString79 = "1.1";
		this.aString74 = arg2;
		aString75 = "Unknown";
		this.anInt7461 = arg1;
		this.anApplet2 = arg0;
		try {
			aString75 = System.getProperty("java.vendor");
			aString79 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			aString76 = System.getProperty("os.name");
		} catch (@Pc(48) Exception local48) {
			aString76 = "Unknown";
		}
		aString78 = aString76.toLowerCase();
		try {
			aString81 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(59) Exception local59) {
			aString81 = "";
		}
		try {
			aString80 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(67) Exception local67) {
			aString80 = "";
		}
		try {
			aString77 = System.getProperty("user.home");
			if (aString77 != null) {
				aString77 = aString77 + "/";
			}
		} catch (@Pc(87) Exception local87) {
		}
		if (aString77 == null) {
			aString77 = "~/";
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
		} catch (@Pc(124) Exception local124) {
		}
		try {
			if (arg0 == null) {
				aMethod4 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				aMethod4 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(152) Exception local152) {
		}
		this.aClass277_1 = new Class277(method5670("random.dat", null, this.anInt7461), "rw", 25L);
		this.aClass277_2 = new Class277(this.method5672("main_file_cache.dat2"), "rw", 209715200L);
		this.aClass277_3 = new Class277(this.method5672("main_file_cache.idx255"), "rw", 1048576L);
		this.aClass277Array1 = new Class277[arg3];
		for (@Pc(193) int local193 = 0; local193 < arg3; local193++) {
			this.aClass277Array1[local193] = new Class277(this.method5672("main_file_cache.idx" + local193), "rw", 1048576L);
		}
		try {
			this.aClass271_1 = new Class271();
		} catch (@Pc(229) Throwable local229) {
		}
		try {
			this.aClass273_1 = new Class273();
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
		this.aBoolean614 = false;
		this.aThread4 = new Thread(this);
		this.aThread4.setPriority(10);
		this.aThread4.setDaemon(true);
		this.aThread4.start();
	}

	@OriginalMember(owner = "loader!ji", name = "a", descriptor = "(Ljava/lang/String;Z)Lloader!rm;")
	private Class276 method5669(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) {
		return arg1 ? this.method5685(12, arg0, 0, 0, (byte) 78) : (Class276) null;
	}

	@OriginalMember(owner = "loader!ji", name = "a", descriptor = "(ZZLjava/awt/Component;)Lloader!rm;")
	private Class276 method5671(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Component arg2) {
		return arg0 ? (Class276) null : this.method5685(15, arg2, 0, arg1 ? 1 : 0, (byte) 78);
	}

	@OriginalMember(owner = "loader!ji", name = "a", descriptor = "(BLjava/lang/String;)Ljava/io/File;")
	public File method5672(@OriginalArg(1) String arg0) {
		return method5670(arg0, this.aString74, this.anInt7461);
	}

	@OriginalMember(owner = "loader!ji", name = "a", descriptor = "(Ljava/lang/Class;Z)Lloader!rm;")
	private Class276 method5673(@OriginalArg(0) Class arg0, @OriginalArg(1) boolean arg1) {
		if (!arg1) {
			this.aClass271_1 = null;
		}
		return this.method5685(20, arg0, 0, 0, (byte) 78);
	}

	@OriginalMember(owner = "loader!ji", name = "a", descriptor = "(BLjava/lang/Class;)V")
	private void method5674(@OriginalArg(0) byte arg0, @OriginalArg(1) Class arg1) throws Exception {
		if (arg0 < 50) {
			return;
		}
		@Pc(16) Class[] local16 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
		@Pc(18) Runtime local18 = Runtime.getRuntime();
		@Pc(29) Method local29 = Class.forName("java.lang.reflect.Method").getMethod("setAccessible", Boolean.TYPE);
		@Pc(40) Method local40;
		if (!aString78.startsWith("mac")) {
			local40 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", local16);
			local29.invoke(local40, Boolean.TRUE);
			local40.invoke(local18, arg1, "jawt");
			local29.invoke(local40, Boolean.FALSE);
		}
		local40 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local16);
		local29.invoke(local40, Boolean.TRUE);
		if (!aString78.startsWith("win")) {
			throw new Exception();
		}
		local40.invoke(local18, arg1, this.method5672("sw3d.dll").toString());
		local29.invoke(local40, Boolean.FALSE);
	}

	@OriginalMember(owner = "loader!ji", name = "a", descriptor = "(IIILjava/awt/Component;)Lloader!rm;")
	private Class276 method5675(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Component arg3) {
		if (arg1 >= -95) {
			this.method5672(null);
		}
		@Pc(11) Point local11 = arg3.getLocationOnScreen();
		return this.method5685(14, null, local11.y + arg0, arg2 + local11.x, (byte) 78);
	}

	@OriginalMember(owner = "loader!ji", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(16) Class276 local16;
			synchronized (this) {
				while (true) {
					if (this.aBoolean614) {
						return;
					}
					if (this.aClass276_2 != null) {
						local16 = this.aClass276_2;
						this.aClass276_2 = this.aClass276_2.aClass276_3;
						if (this.aClass276_2 == null) {
							this.aClass276_1 = null;
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
				@Pc(45) int local45 = local16.anInt7467;
				if (local45 == 1) {
					if (aLong227 > Class275.method5699()) {
						throw new IOException();
					}
					local16.anObject12 = new Socket(InetAddress.getByName((String) local16.anObject11), local16.anInt7469);
				} else if (local45 == 2) {
					@Pc(684) Thread local684 = new Thread((Runnable) local16.anObject11);
					local684.setDaemon(true);
					local684.start();
					local684.setPriority(local16.anInt7469);
					local16.anObject12 = local684;
				} else if (local45 == 4) {
					if (aLong227 > Class275.method5699()) {
						throw new IOException();
					}
					local16.anObject12 = new DataInputStream(((URL) local16.anObject11).openStream());
				} else {
					@Pc(368) Object[] local368;
					if (local45 == 8) {
						local368 = (Object[]) local16.anObject11;
						if (((Class) local368[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local16.anObject12 = ((Class) local368[0]).getDeclaredMethod((String) local368[1], (Class[]) local368[2]);
					} else if (local45 == 9) {
						local368 = (Object[]) local16.anObject11;
						if (((Class) local368[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local16.anObject12 = ((Class) local368[0]).getDeclaredField((String) local368[1]);
					} else if (local45 == 18) {
						@Pc(96) Clipboard local96 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local16.anObject12 = local96.getContents(null);
					} else if (local45 == 19) {
						@Pc(583) Transferable local583 = (Transferable) local16.anObject11;
						@Pc(586) Clipboard local586 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local586.setContents(local583, null);
					} else {
						@Pc(303) String local303;
						if (local45 == 3) {
							if (Class275.method5699() < aLong227) {
								throw new IOException();
							}
							local303 = (local16.anInt7469 >> 24 & 0xFF) + "." + (local16.anInt7469 >> 16 & 0xFF) + "." + (local16.anInt7469 >> 8 & 0xFF) + "." + (local16.anInt7469 & 0xFF);
							local16.anObject12 = InetAddress.getByName(local303).getHostName();
						} else if (local45 == 21) {
							if (aLong227 > Class275.method5699()) {
								throw new IOException();
							}
							local16.anObject12 = InetAddress.getByName((String) local16.anObject11).getAddress();
						} else if (local45 == 5) {
							local16.anObject12 = this.aClass271_1.method5652();
						} else if (local45 == 6) {
							@Pc(482) Frame local482 = new Frame("Jagex Full Screen");
							local16.anObject12 = local482;
							local482.setResizable(false);
							this.aClass271_1.method5654(local16.anInt7469 & 0xFFFF, local16.anInt7468 & 0xFFFF, local16.anInt7469 >>> 16, local482, local16.anInt7468 >> 16);
						} else if (local45 == 7) {
							this.aClass271_1.method5653();
						} else {
							@Pc(319) int local319;
							if (local45 == 11) {
								@Pc(408) Field local408 = Class.forName("java.lang.ClassLoader").getDeclaredField("nativeLibraries");
								local408.setAccessible(true);
								@Pc(419) Vector local419 = (Vector) local408.get(((Class) local16.anObject11).getClassLoader());
								for (local319 = 0; local319 < local419.size(); local319++) {
									@Pc(429) Object local429 = local419.elementAt(local319);
									@Pc(436) Method local436 = local429.getClass().getDeclaredMethod("finalize");
									local436.setAccessible(true);
									local436.invoke(local429);
									local436.setAccessible(false);
									@Pc(453) Field local453 = local429.getClass().getDeclaredField("handle");
									local453.setAccessible(true);
									local453.set(local429, Integer.valueOf(0));
									local453.setAccessible(false);
								}
								local408.setAccessible(false);
							} else if (local45 == 12) {
								@Pc(155) Class277 local155 = method5693(this.aString74, this.anInt7461, (String) local16.anObject11);
								local16.anObject12 = local155;
							} else if (local45 == 14) {
								@Pc(393) int local393 = local16.anInt7469;
								@Pc(396) int local396 = local16.anInt7468;
								this.aClass273_1.method5667(local396, local393);
							} else if (local45 == 15) {
								@Pc(177) boolean local177 = local16.anInt7469 != 0;
								@Pc(181) Component local181 = (Component) local16.anObject11;
								this.aClass273_1.method5668(local181, local177);
							} else if (local45 == 17) {
								local368 = (Object[]) local16.anObject11;
								this.aClass273_1.method5666(local16.anInt7469, (Component) local368[0], local16.anInt7468, (Point) local368[2], (int[]) local368[1]);
							} else if (local45 == 16) {
								try {
									if (!aString78.startsWith("win")) {
										throw new Exception();
									}
									local303 = (String) local16.anObject11;
									if (!local303.startsWith("http://") && !local303.startsWith("https://")) {
										throw new Exception();
									}
									@Pc(317) String local317 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
									for (local319 = 0; local319 < local303.length(); local319++) {
										if (local317.indexOf(local303.charAt(local319)) == -1) {
											throw new Exception();
										}
									}
									Runtime.getRuntime().exec("cmd /c start \"j\" \"" + local303 + "\"");
									local16.anObject12 = null;
								} catch (@Pc(358) Exception local358) {
									local16.anObject12 = local358;
									throw local358;
								}
							} else if (local45 == 20) {
								try {
									@Pc(214) Class[] local214 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
									@Pc(216) Runtime local216 = Runtime.getRuntime();
									@Pc(222) Method local222 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local214);
									local222.setAccessible(true);
									if (aString78.startsWith("win")) {
										if (aString81.startsWith("amd64") || aString81.startsWith("x86_64")) {
											local222.invoke(local216, local16.anObject11, this.method5672("jagmisc64.dll").toString());
										} else {
											local222.invoke(local216, local16.anObject11, this.method5672("jagmisc.dll").toString());
										}
									}
									local222.setAccessible(false);
								} catch (@Pc(281) Throwable local281) {
									local16.anObject12 = local281;
								}
							} else {
								throw new Exception("");
							}
						}
					}
				}
				local16.anInt7466 = 1;
			} catch (@Pc(701) ThreadDeath local701) {
				throw local701;
			} catch (@Pc(704) Throwable local704) {
				local16.anInt7466 = 2;
			}
			synchronized (local16) {
				local16.notify();
			}
		}
	}

	@OriginalMember(owner = "loader!ji", name = "a", descriptor = "(Ljava/lang/Runnable;II)Lloader!rm;")
	private Class276 method5676(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 <= 73) {
			this.method5688(126);
		}
		return this.method5685(2, arg0, 0, arg1, (byte) 78);
	}

	@OriginalMember(owner = "loader!ji", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;I[Ljava/lang/Class;)Lloader!rm;")
	private Class276 method5677(@OriginalArg(0) Class arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class[] arg3) {
		return arg2 <= 19 ? (Class276) null : this.method5685(8, new Object[] { arg0, arg1, arg3 }, 0, 0, (byte) 78);
	}

	@OriginalMember(owner = "loader!ji", name = "a", descriptor = "(I)V")
	private void method5678(@OriginalArg(0) int arg0) {
		synchronized (this) {
			this.aBoolean614 = true;
			if (arg0 < 8) {
				aString77 = null;
			}
			this.notifyAll();
		}
		try {
			this.aThread4.join();
		} catch (@Pc(27) InterruptedException local27) {
		}
		if (this.aClass277_2 != null) {
			try {
				this.aClass277_2.method5707();
			} catch (@Pc(36) IOException local36) {
			}
		}
		if (this.aClass277_3 != null) {
			try {
				this.aClass277_3.method5707();
			} catch (@Pc(46) IOException local46) {
			}
		}
		if (this.aClass277Array1 != null) {
			for (@Pc(52) int local52 = 0; local52 < this.aClass277Array1.length; local52++) {
				if (this.aClass277Array1[local52] != null) {
					try {
						this.aClass277Array1[local52].method5707();
					} catch (@Pc(75) IOException local75) {
					}
				}
			}
		}
		if (this.aClass277_1 != null) {
			try {
				this.aClass277_1.method5707();
			} catch (@Pc(87) IOException local87) {
			}
		}
	}

	@OriginalMember(owner = "loader!ji", name = "a", descriptor = "(IIILjava/lang/Object;B)Lloader!rm;")
	private Class276 method5679(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Object arg3) {
		@Pc(3) Class276 local3 = new Class276();
		synchronized (local3) {
			local3.anInt7469 = arg0;
			local3.anObject11 = arg3;
			local3.anInt7467 = arg1;
			local3.anInt7468 = arg2;
			synchronized (this) {
				if (this.aClass276_1 == null) {
					this.aClass276_1 = this.aClass276_2 = local3;
				} else {
					this.aClass276_1.aClass276_3 = local3;
					this.aClass276_1 = local3;
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

	@OriginalMember(owner = "loader!ji", name = "c", descriptor = "(I)Lloader!af;")
	private Interface13 method5680(@OriginalArg(0) int arg0) {
		if (arg0 != 6) {
			this.method5694(62);
		}
		return this.anInterface13_1;
	}

	@OriginalMember(owner = "loader!ji", name = "b", descriptor = "(I)Lloader!rm;")
	private Class276 method5681(@OriginalArg(0) int arg0) {
		return arg0 == 0 ? this.method5685(18, null, 0, 0, (byte) 78) : (Class276) null;
	}

	@OriginalMember(owner = "loader!ji", name = "a", descriptor = "(Ljava/awt/datatransfer/Transferable;I)Lloader!rm;")
	private Class276 method5682(@OriginalArg(0) Transferable arg0, @OriginalArg(1) int arg1) {
		return arg1 == -2103 ? this.method5685(19, arg0, 0, 0, (byte) 78) : (Class276) null;
	}

	@OriginalMember(owner = "loader!ji", name = "a", descriptor = "(Ljava/lang/Class;I)Lloader!rm;")
	private Class276 method5683(@OriginalArg(0) Class arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 0) {
			this.method5680(40);
		}
		return this.method5685(11, arg0, 0, 0, (byte) 78);
	}

	@OriginalMember(owner = "loader!ji", name = "a", descriptor = "(BI)Lloader!rm;")
	private Class276 method5684(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		if (arg0 > -83) {
			this.method5695(null);
		}
		return this.method5685(3, null, 0, arg1, (byte) 78);
	}

	@OriginalMember(owner = "loader!ji", name = "a", descriptor = "(ILjava/lang/Object;IIB)Lloader!rm;")
	private Class276 method5685(@OriginalArg(0) int arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		@Pc(3) Class276 local3 = new Class276();
		local3.anInt7468 = arg2;
		local3.anObject11 = arg1;
		local3.anInt7467 = arg0;
		local3.anInt7469 = arg3;
		synchronized (this) {
			if (this.aClass276_1 == null) {
				this.aClass276_1 = this.aClass276_2 = local3;
			} else {
				this.aClass276_1.aClass276_3 = local3;
				this.aClass276_1 = local3;
			}
			this.notify();
		}
		return arg4 == 78 ? local3 : (Class276) null;
	}

	@OriginalMember(owner = "loader!ji", name = "a", descriptor = "(Ljava/net/URL;I)Lloader!rm;")
	private Class276 method5686(@OriginalArg(0) URL arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 19) {
			this.anInterface13_1 = null;
		}
		return this.method5685(4, arg0, 0, 0, (byte) 78);
	}

	@OriginalMember(owner = "loader!ji", name = "a", descriptor = "(Ljava/lang/String;IB)Lloader!rm;")
	private Class276 method5687(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		return this.method5685(1, arg0, 0, arg1, (byte) 78);
	}

	@OriginalMember(owner = "loader!ji", name = "e", descriptor = "(I)V")
	private void method5688(@OriginalArg(0) int arg0) {
		aLong227 = Class275.method5699() + (long) arg0;
	}

	@OriginalMember(owner = "loader!ji", name = "a", descriptor = "(Ljava/awt/Frame;B)Lloader!rm;")
	private Class276 method5689(@OriginalArg(0) Frame arg0, @OriginalArg(1) byte arg1) {
		return arg1 == 76 ? this.method5685(7, arg0, 0, 0, (byte) 78) : (Class276) null;
	}

	@OriginalMember(owner = "loader!ji", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/Class;)Lloader!rm;")
	private Class276 method5690(@OriginalArg(0) byte arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Class arg2) {
		if (arg0 != -99) {
			this.method5683(null, 17);
		}
		return this.method5685(9, new Object[] { arg2, arg1 }, 0, 0, (byte) 78);
	}

	@OriginalMember(owner = "loader!ji", name = "a", descriptor = "(IIIII)Lloader!rm;")
	private Class276 method5691(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		return this.method5685(6, null, (arg1 << 16) + arg0, (arg3 << 16) + arg2, (byte) 78);
	}

	@OriginalMember(owner = "loader!ji", name = "a", descriptor = "(ILjava/awt/Point;Ljava/awt/Component;[III)Lloader!rm;")
	private Class276 method5692(@OriginalArg(0) int arg0, @OriginalArg(1) Point arg1, @OriginalArg(2) Component arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return arg5 == 17 ? this.method5685(17, new Object[] { arg2, arg3, arg1 }, arg4, arg0, (byte) 78) : (Class276) null;
	}

	@OriginalMember(owner = "loader!ji", name = "d", descriptor = "(I)Z")
	private boolean method5694(@OriginalArg(0) int arg0) {
		if (arg0 > -85) {
			this.method5688(111);
		}
		return this.aClass271_1 != null;
	}

	@OriginalMember(owner = "loader!ji", name = "a", descriptor = "(ILjava/lang/String;)[B")
	private byte[] method5695(@OriginalArg(1) String arg0) {
		@Pc(15) Class276 local15 = this.method5679(0, 21, 0, arg0);
		return (byte[]) local15.anObject12;
	}

	@OriginalMember(owner = "loader!ji", name = "a", descriptor = "(ZLjava/lang/String;)Lloader!rm;")
	private Class276 method5696(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1) {
		if (!arg0) {
			method5693(null, -127, null);
		}
		return this.method5685(21, arg1, 0, 0, (byte) 78);
	}

	@OriginalMember(owner = "loader!ji", name = "a", descriptor = "(Z)Lloader!rm;")
	private Class276 method5697(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.method5669(null, false);
		}
		return this.method5685(5, null, 0, 0, (byte) 78);
	}

	@OriginalMember(owner = "loader!ji", name = "a", descriptor = "(Ljava/lang/String;I)Lloader!rm;")
	private Class276 method5698(@OriginalArg(0) String arg0) {
		return this.method5685(16, arg0, 0, 0, (byte) 78);
	}
}
