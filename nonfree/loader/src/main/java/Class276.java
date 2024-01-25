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

@OriginalClass("loader!li")
public final class Class276 implements Runnable {

	@OriginalMember(owner = "loader!li", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString72;

	@OriginalMember(owner = "loader!li", name = "v", descriptor = "Ljava/lang/String;")
	private static String aString73;

	@OriginalMember(owner = "loader!li", name = "f", descriptor = "Ljava/lang/String;")
	private static String aString74;

	@OriginalMember(owner = "loader!li", name = "n", descriptor = "Ljava/lang/String;")
	private static String aString75;

	@OriginalMember(owner = "loader!li", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString76;

	@OriginalMember(owner = "loader!li", name = "t", descriptor = "Ljava/lang/String;")
	private static String aString78;

	@OriginalMember(owner = "loader!li", name = "a", descriptor = "Ljava/lang/String;")
	private static String aString79;

	@OriginalMember(owner = "loader!li", name = "y", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod3;

	@OriginalMember(owner = "loader!li", name = "w", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod4;

	@OriginalMember(owner = "loader!li", name = "r", descriptor = "I")
	private static final int anInt7687 = 1;

	@OriginalMember(owner = "loader!li", name = "k", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable4 = new Hashtable(16);

	@OriginalMember(owner = "loader!li", name = "x", descriptor = "J")
	private static volatile long aLong238 = 0L;

	@OriginalMember(owner = "loader!li", name = "p", descriptor = "Lloader!ol;")
	private Interface14 anInterface14_1;

	@OriginalMember(owner = "loader!li", name = "e", descriptor = "Lloader!ve;")
	private Class277 aClass277_2 = null;

	@OriginalMember(owner = "loader!li", name = "o", descriptor = "Lloader!ve;")
	private Class277 aClass277_1 = null;

	@OriginalMember(owner = "loader!li", name = "c", descriptor = "Lloader!cq;")
	private Class272 aClass272_2 = null;

	@OriginalMember(owner = "loader!li", name = "b", descriptor = "Lloader!ve;")
	private Class277 aClass277_3 = null;

	@OriginalMember(owner = "loader!li", name = "z", descriptor = "Z")
	private boolean aBoolean660 = false;

	@OriginalMember(owner = "loader!li", name = "i", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2 = null;

	@OriginalMember(owner = "loader!li", name = "g", descriptor = "Lloader!cq;")
	private Class272 aClass272_3 = null;

	@OriginalMember(owner = "loader!li", name = "q", descriptor = "Ljava/lang/String;")
	private final String aString77;

	@OriginalMember(owner = "loader!li", name = "m", descriptor = "I")
	private final int anInt7688;

	@OriginalMember(owner = "loader!li", name = "s", descriptor = "Ljava/awt/EventQueue;")
	private EventQueue anEventQueue2;

	@OriginalMember(owner = "loader!li", name = "l", descriptor = "[Lloader!ve;")
	private Class277[] aClass277Array1;

	@OriginalMember(owner = "loader!li", name = "u", descriptor = "Lloader!c;")
	private Class271 aClass271_1;

	@OriginalMember(owner = "loader!li", name = "A", descriptor = "Lloader!b;")
	private Class270 aClass270_1;

	@OriginalMember(owner = "loader!li", name = "j", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread4;

	@OriginalMember(owner = "loader!li", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ZI)Ljava/io/File;")
	private static File method6027(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2) {
		@Pc(4) File local4 = (File) aHashtable4.get(arg0);
		if (local4 != null) {
			return local4;
		}
		@Pc(44) String[] local44 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString79, "/tmp/", "" };
		@Pc(79) String[] local79 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
		for (@Pc(81) int local81 = 0; local81 < 2; local81++) {
			for (@Pc(86) int local86 = 0; local86 < local79.length; local86++) {
				for (@Pc(96) int local96 = 0; local96 < local44.length; local96++) {
					@Pc(134) String local134 = local44[local96] + local79[local86] + "/" + (arg1 == null ? "" : arg1 + "/") + arg0;
					@Pc(136) RandomAccessFile local136 = null;
					try {
						@Pc(141) File local141 = new File(local134);
						if (local81 != 0 || local141.exists()) {
							@Pc(151) String local151 = local44[local96];
							if (local81 != 1 || local151.length() <= 0 || (new File(local151)).exists()) {
								(new File(local44[local96] + local79[local86])).mkdir();
								if (arg1 != null) {
									(new File(local44[local96] + local79[local86] + "/" + arg1)).mkdir();
								}
								local136 = new RandomAccessFile(local141, "rw");
								@Pc(220) int local220 = local136.read();
								local136.seek(0L);
								local136.write(local220);
								local136.seek(0L);
								local136.close();
								aHashtable4.put(arg0, local141);
								return local141;
							}
						}
					} catch (@Pc(239) Exception local239) {
						try {
							if (local136 != null) {
								local136.close();
							}
						} catch (@Pc(248) Exception local248) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "loader!li", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;I)Lloader!ve;")
	private static Class277 method6048(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		@Pc(24) String local24;
		if (arg2 == 33) {
			local24 = "jagex_" + arg0 + "_preferences" + arg1 + "_rc.dat";
		} else if (arg2 == 34) {
			local24 = "jagex_" + arg0 + "_preferences" + arg1 + "_wip.dat";
		} else {
			local24 = "jagex_" + arg0 + "_preferences" + arg1 + ".dat";
		}
		@Pc(91) String[] local91 = new String[] { "c:/rscache/", "/rscache/", aString79, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(93) int local93 = 0; local93 < local91.length; local93++) {
			@Pc(112) String local112 = local91[local93];
			if (local112.length() <= 0 || (new File(local112)).exists()) {
				try {
					return new Class277(new File(local112, local24), "rw", 10000L);
				} catch (@Pc(136) Exception local136) {
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "loader!li", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class276(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		this.aString77 = arg2;
		aString72 = "1.1";
		this.anApplet2 = arg0;
		this.anInt7688 = arg1;
		aString76 = "Unknown";
		try {
			aString76 = System.getProperty("java.vendor");
			aString72 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			aString78 = System.getProperty("os.name");
		} catch (@Pc(48) Exception local48) {
			aString78 = "Unknown";
		}
		aString74 = aString78.toLowerCase();
		try {
			aString75 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(59) Exception local59) {
			aString75 = "";
		}
		try {
			aString73 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(67) Exception local67) {
			aString73 = "";
		}
		try {
			aString79 = System.getProperty("user.home");
			if (aString79 != null) {
				aString79 = aString79 + "/";
			}
		} catch (@Pc(85) Exception local85) {
		}
		if (aString79 == null) {
			aString79 = "~/";
		}
		try {
			this.anEventQueue2 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(96) Throwable local96) {
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
		} catch (@Pc(151) Exception local151) {
		}
		this.aClass277_1 = new Class277(method6027("random.dat", null, this.anInt7688), "rw", 25L);
		this.aClass277_2 = new Class277(this.method6039("main_file_cache.dat2"), "rw", 209715200L);
		this.aClass277_3 = new Class277(this.method6039("main_file_cache.idx255"), "rw", 1048576L);
		this.aClass277Array1 = new Class277[arg3];
		for (@Pc(192) int local192 = 0; local192 < arg3; local192++) {
			this.aClass277Array1[local192] = new Class277(this.method6039("main_file_cache.idx" + local192), "rw", 1048576L);
		}
		try {
			this.aClass271_1 = new Class271();
		} catch (@Pc(228) Throwable local228) {
		}
		try {
			this.aClass270_1 = new Class270();
		} catch (@Pc(235) Throwable local235) {
		}
		@Pc(238) ThreadGroup local238 = Thread.currentThread().getThreadGroup();
		for (@Pc(241) ThreadGroup local241 = local238.getParent(); local241 != null; local241 = local241.getParent()) {
			local238 = local241;
		}
		@Pc(252) Thread[] local252 = new Thread[1000];
		local238.enumerate(local252);
		for (@Pc(258) int local258 = 0; local258 < local252.length; local258++) {
			if (local252[local258] != null && local252[local258].getName().startsWith("AWT")) {
				local252[local258].setPriority(1);
			}
		}
		this.aBoolean660 = false;
		this.aThread4 = new Thread(this);
		this.aThread4.setPriority(10);
		this.aThread4.setDaemon(true);
		this.aThread4.start();
	}

	@OriginalMember(owner = "loader!li", name = "c", descriptor = "(I)V")
	private void method6024(@OriginalArg(0) int arg0) {
		aLong238 = Class274.method6023(arg0 ^ 0x21F1) + 5000L;
		if (arg0 != 5000) {
			this.method6049(8, null);
		}
	}

	@OriginalMember(owner = "loader!li", name = "a", descriptor = "(Ljava/awt/Frame;I)Lloader!cq;")
	private Class272 method6025(@OriginalArg(0) Frame arg0, @OriginalArg(1) int arg1) {
		return arg1 == 7 ? this.method6031(7, 0, 0, arg0, 0) : (Class272) null;
	}

	@OriginalMember(owner = "loader!li", name = "a", descriptor = "(ILjava/lang/String;B)Lloader!cq;")
	private Class272 method6026(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) byte arg2) {
		if (arg2 != 38) {
			this.aClass277Array1 = null;
		}
		return this.method6031(1, 0, arg0, arg1, 0);
	}

	@OriginalMember(owner = "loader!li", name = "e", descriptor = "(I)Lloader!cq;")
	private Class272 method6028(@OriginalArg(0) int arg0) {
		if (arg0 != 5) {
			this.method6032(-53, 38, -102, -78, -99);
		}
		return this.method6031(5, 0, 0, null, 0);
	}

	@OriginalMember(owner = "loader!li", name = "a", descriptor = "(ILjava/lang/Class;)V")
	private void method6029(@OriginalArg(0) int arg0, @OriginalArg(1) Class arg1) throws Exception {
		@Pc(12) Class[] local12 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
		@Pc(14) Runtime local14 = Runtime.getRuntime();
		if (arg0 != 4) {
			this.method6044(-9, null);
		}
		@Pc(34) Method local34 = Class.forName("java.lang.reflect.Method").getMethod("setAccessible", Boolean.TYPE);
		@Pc(45) Method local45;
		if (!aString74.startsWith("mac")) {
			local45 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", local12);
			local34.invoke(local45, Boolean.TRUE);
			local45.invoke(local14, arg1, "jawt");
			local34.invoke(local45, Boolean.FALSE);
		}
		local45 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local12);
		local34.invoke(local45, Boolean.TRUE);
		if (!aString74.startsWith("win")) {
			throw new Exception();
		}
		local45.invoke(local14, arg1, this.method6039("sw3d.dll").toString());
		local34.invoke(local45, Boolean.FALSE);
	}

	@OriginalMember(owner = "loader!li", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Class;)Lloader!cq;")
	private Class272 method6030(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Class arg2) {
		return arg0 == -10 ? this.method6031(9, 0, 0, new Object[] { arg2, arg1 }, 0) : (Class272) null;
	}

	@OriginalMember(owner = "loader!li", name = "a", descriptor = "(IIILjava/lang/Object;I)Lloader!cq;")
	private Class272 method6031(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Object arg3, @OriginalArg(4) int arg4) {
		@Pc(3) Class272 local3 = new Class272();
		local3.anObject14 = arg3;
		local3.anInt7683 = arg2;
		if (arg4 != 0) {
			return (Class272) null;
		}
		local3.anInt7681 = arg1;
		local3.anInt7682 = arg0;
		synchronized (this) {
			if (this.aClass272_2 == null) {
				this.aClass272_2 = this.aClass272_3 = local3;
			} else {
				this.aClass272_2.aClass272_1 = local3;
				this.aClass272_2 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "loader!li", name = "a", descriptor = "(IIIII)Lloader!cq;")
	private Class272 method6032(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return arg1 == 12 ? this.method6031(6, (arg3 << 16) + arg2, arg4 + (arg0 << 16), null, 0) : (Class272) null;
	}

	@OriginalMember(owner = "loader!li", name = "a", descriptor = "(ZLjava/lang/Class;)Lloader!cq;")
	private Class272 method6033(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class arg1) {
		return arg0 ? (Class272) null : this.method6031(11, 0, 0, arg1, 0);
	}

	@OriginalMember(owner = "loader!li", name = "a", descriptor = "(IBILjava/awt/Component;)Lloader!cq;")
	private Class272 method6034(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Component arg3) {
		@Pc(2) Point local2 = arg3.getLocationOnScreen();
		if (arg1 != -14) {
			this.method6039(null);
		}
		return this.method6031(14, arg2 + local2.y, arg0 - -local2.x, null, arg1 ^ 0xFFFFFFF2);
	}

	@OriginalMember(owner = "loader!li", name = "d", descriptor = "(I)Lloader!ol;")
	private Interface14 method6035(@OriginalArg(0) int arg0) {
		return arg0 == -34009168 ? this.anInterface14_1 : (Interface14) null;
	}

	@OriginalMember(owner = "loader!li", name = "a", descriptor = "(IIB[ILjava/awt/Point;Ljava/awt/Component;)Lloader!cq;")
	private Class272 method6036(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) Point arg4, @OriginalArg(5) Component arg5) {
		if (arg2 != -2) {
			this.method6025(null, 109);
		}
		return this.method6031(17, arg0, arg1, new Object[] { arg5, arg3, arg4 }, 0);
	}

	@OriginalMember(owner = "loader!li", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(16) Class272 local16;
			synchronized (this) {
				while (true) {
					if (this.aBoolean660) {
						return;
					}
					if (this.aClass272_3 != null) {
						local16 = this.aClass272_3;
						this.aClass272_3 = this.aClass272_3.aClass272_1;
						if (this.aClass272_3 == null) {
							this.aClass272_2 = null;
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
				@Pc(45) int local45 = local16.anInt7682;
				if (local45 == 1) {
					if (aLong238 > Class274.method6023(12921)) {
						throw new IOException();
					}
					local16.anObject15 = new Socket(InetAddress.getByName((String) local16.anObject14), local16.anInt7683);
				} else if (local45 == 2) {
					@Pc(679) Thread local679 = new Thread((Runnable) local16.anObject14);
					local679.setDaemon(true);
					local679.start();
					local679.setPriority(local16.anInt7683);
					local16.anObject15 = local679;
				} else if (local45 == 4) {
					if (Class274.method6023(12921) < aLong238) {
						throw new IOException();
					}
					local16.anObject15 = new DataInputStream(((URL) local16.anObject14).openStream());
				} else {
					@Pc(466) Object[] local466;
					if (local45 == 8) {
						local466 = (Object[]) local16.anObject14;
						if (((Class) local466[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local16.anObject15 = ((Class) local466[0]).getDeclaredMethod((String) local466[1], (Class[]) local466[2]);
					} else if (local45 == 9) {
						local466 = (Object[]) local16.anObject14;
						if (((Class) local466[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local16.anObject15 = ((Class) local466[0]).getDeclaredField((String) local466[1]);
					} else if (local45 == 18) {
						@Pc(116) Clipboard local116 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local16.anObject15 = local116.getContents(null);
					} else if (local45 == 19) {
						@Pc(604) Transferable local604 = (Transferable) local16.anObject14;
						@Pc(607) Clipboard local607 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local607.setContents(local604, null);
					} else {
						@Pc(178) String local178;
						if (local45 == 3) {
							if (aLong238 > Class274.method6023(12921)) {
								throw new IOException();
							}
							local178 = (local16.anInt7683 >> 24 & 0xFF) + "." + (local16.anInt7683 >> 16 & 0xFF) + "." + (local16.anInt7683 >> 8 & 0xFF) + "." + (local16.anInt7683 & 0xFF);
							local16.anObject15 = InetAddress.getByName(local178).getHostName();
						} else if (local45 == 21) {
							if (Class274.method6023(12921) < aLong238) {
								throw new IOException();
							}
							local16.anObject15 = InetAddress.getByName((String) local16.anObject14).getAddress();
						} else if (local45 == 5) {
							local16.anObject15 = this.aClass271_1.method6016();
						} else if (local45 == 6) {
							@Pc(220) Frame local220 = new Frame("Jagex Full Screen");
							local16.anObject15 = local220;
							local220.setResizable(false);
							this.aClass271_1.method6017(local16.anInt7683 & 0xFFFF, local16.anInt7681 >> 16, local16.anInt7683 >>> 16, local16.anInt7681 & 0xFFFF, local220);
						} else if (local45 == 7) {
							this.aClass271_1.method6015();
						} else {
							@Pc(420) int local420;
							if (local45 == 11) {
								@Pc(520) Field local520 = Class.forName("java.lang.ClassLoader").getDeclaredField("nativeLibraries");
								local520.setAccessible(true);
								@Pc(531) Vector local531 = (Vector) local520.get(((Class) local16.anObject14).getClassLoader());
								for (local420 = 0; local531.size() > local420; local420++) {
									@Pc(545) Object local545 = local531.elementAt(local420);
									@Pc(552) Method local552 = local545.getClass().getDeclaredMethod("finalize");
									local552.setAccessible(true);
									local552.invoke(local545);
									local552.setAccessible(false);
									@Pc(569) Field local569 = local545.getClass().getDeclaredField("handle");
									local569.setAccessible(true);
									local569.set(local545, Integer.valueOf(0));
									local569.setAccessible(false);
								}
								local520.setAccessible(false);
							} else if (local45 == 12) {
								@Pc(511) Class277 local511 = method6048(this.aString77, (String) local16.anObject14, this.anInt7688);
								local16.anObject15 = local511;
							} else if (local45 == 14) {
								@Pc(491) int local491 = local16.anInt7683;
								@Pc(494) int local494 = local16.anInt7681;
								this.aClass270_1.method6013(local491, local494);
							} else if (local45 == 15) {
								@Pc(277) boolean local277 = local16.anInt7683 != 0;
								@Pc(281) Component local281 = (Component) local16.anObject14;
								this.aClass270_1.method6011(local277, local281);
							} else if (local45 == 17) {
								local466 = (Object[]) local16.anObject14;
								this.aClass270_1.method6012((int[]) local466[1], local16.anInt7683, local16.anInt7681, (Point) local466[2], (Component) local466[0]);
							} else if (local45 == 16) {
								try {
									if (!aString74.startsWith("win")) {
										throw new Exception();
									}
									local178 = (String) local16.anObject14;
									if (!local178.startsWith("http://") && !local178.startsWith("https://")) {
										throw new Exception();
									}
									@Pc(418) String local418 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
									for (local420 = 0; local178.length() > local420; local420++) {
										if (local418.indexOf(local178.charAt(local420)) == -1) {
											throw new Exception();
										}
									}
									Runtime.getRuntime().exec("cmd /c start \"j\" \"" + local178 + "\"");
									local16.anObject15 = null;
								} catch (@Pc(456) Exception local456) {
									local16.anObject15 = local456;
									throw local456;
								}
							} else if (local45 == 20) {
								try {
									@Pc(314) Class[] local314 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
									@Pc(316) Runtime local316 = Runtime.getRuntime();
									@Pc(322) Method local322 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local314);
									local322.setAccessible(true);
									if (aString74.startsWith("win")) {
										if (aString75.startsWith("amd64") || aString75.startsWith("x86_64")) {
											local322.invoke(local316, local16.anObject14, this.method6039("jagmisc64.dll").toString());
										} else {
											local322.invoke(local316, local16.anObject14, this.method6039("jagmisc.dll").toString());
										}
									}
									local322.setAccessible(false);
								} catch (@Pc(382) Throwable local382) {
									local16.anObject15 = local382;
								}
							} else {
								throw new Exception("");
							}
						}
					}
				}
				local16.anInt7684 = 1;
			} catch (@Pc(696) ThreadDeath local696) {
				throw local696;
			} catch (@Pc(699) Throwable local699) {
				local16.anInt7684 = 2;
			}
			synchronized (local16) {
				local16.notify();
			}
		}
	}

	@OriginalMember(owner = "loader!li", name = "a", descriptor = "(IZLjava/lang/Runnable;)Lloader!cq;")
	private Class272 method6037(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Runnable arg2) {
		return arg1 ? this.method6031(2, 0, arg0, arg2, 0) : (Class272) null;
	}

	@OriginalMember(owner = "loader!li", name = "b", descriptor = "(I)Lloader!cq;")
	private Class272 method6038(@OriginalArg(0) int arg0) {
		return arg0 >= -1 ? (Class272) null : this.method6031(18, 0, 0, null, 0);
	}

	@OriginalMember(owner = "loader!li", name = "b", descriptor = "(ZLjava/lang/String;)Ljava/io/File;")
	public File method6039(@OriginalArg(1) String arg0) {
		return method6027(arg0, this.aString77, this.anInt7688);
	}

	@OriginalMember(owner = "loader!li", name = "a", descriptor = "(ILjava/lang/Class;[Ljava/lang/Class;Ljava/lang/String;)Lloader!cq;")
	private Class272 method6040(@OriginalArg(0) int arg0, @OriginalArg(1) Class arg1, @OriginalArg(2) Class[] arg2, @OriginalArg(3) String arg3) {
		if (arg0 != 0) {
			this.method6035(-53);
		}
		return this.method6031(8, 0, 0, new Object[] { arg1, arg3, arg2 }, arg0);
	}

	@OriginalMember(owner = "loader!li", name = "a", descriptor = "(Ljava/lang/String;B)[B")
	private byte[] method6041(@OriginalArg(0) String arg0, @OriginalArg(1) byte arg1) {
		if (arg1 != 67) {
			this.method6036(-5, 64, (byte) -16, null, null, null);
		}
		@Pc(22) Class272 local22 = this.method6042(0, 0, 21, arg0);
		return (byte[]) local22.anObject15;
	}

	@OriginalMember(owner = "loader!li", name = "a", descriptor = "(IBIILjava/lang/Object;)Lloader!cq;")
	private Class272 method6042(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Object arg3) {
		@Pc(3) Class272 local3 = new Class272();
		synchronized (local3) {
			local3.anInt7681 = arg0;
			local3.anInt7683 = arg1;
			local3.anInt7682 = arg2;
			local3.anObject14 = arg3;
			synchronized (this) {
				if (this.aClass272_2 == null) {
					this.aClass272_2 = this.aClass272_3 = local3;
				} else {
					this.aClass272_2.aClass272_1 = local3;
					this.aClass272_2 = local3;
				}
				this.notify();
			}
			try {
				local3.wait();
			} catch (@Pc(63) InterruptedException local63) {
			}
			return local3;
		}
	}

	@OriginalMember(owner = "loader!li", name = "a", descriptor = "(ILjava/lang/String;)Lloader!cq;")
	private Class272 method6043(@OriginalArg(1) String arg0) {
		return this.method6031(21, 0, 0, arg0, 0);
	}

	@OriginalMember(owner = "loader!li", name = "b", descriptor = "(ILjava/lang/String;)Lloader!cq;")
	private Class272 method6044(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		return arg0 == 0 ? this.method6031(12, 0, 0, arg1, 0) : (Class272) null;
	}

	@OriginalMember(owner = "loader!li", name = "a", descriptor = "(ZILjava/awt/Component;)Lloader!cq;")
	private Class272 method6045(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Component arg2) {
		if (arg1 <= 88) {
			this.method6035(-15);
		}
		return this.method6031(15, 0, arg0 ? 1 : 0, arg2, 0);
	}

	@OriginalMember(owner = "loader!li", name = "a", descriptor = "(Z)Z")
	private boolean method6046(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.aClass272_3 = null;
		}
		return this.aClass271_1 != null;
	}

	@OriginalMember(owner = "loader!li", name = "a", descriptor = "(ZLjava/lang/String;)Lloader!cq;")
	private Class272 method6047(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1) {
		return arg0 ? (Class272) null : this.method6031(16, 0, 0, arg1, 0);
	}

	@OriginalMember(owner = "loader!li", name = "a", descriptor = "(ILjava/net/URL;)Lloader!cq;")
	private Class272 method6049(@OriginalArg(0) int arg0, @OriginalArg(1) URL arg1) {
		if (arg0 != 0) {
			this.method6052(false, null);
		}
		return this.method6031(4, 0, 0, arg1, 0);
	}

	@OriginalMember(owner = "loader!li", name = "a", descriptor = "(IB)Lloader!cq;")
	private Class272 method6050(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		if (arg1 >= -106) {
			this.method6037(11, true, null);
		}
		return this.method6031(3, 0, arg0, null, 0);
	}

	@OriginalMember(owner = "loader!li", name = "a", descriptor = "(Ljava/lang/Class;B)Lloader!cq;")
	private Class272 method6051(@OriginalArg(0) Class arg0, @OriginalArg(1) byte arg1) {
		if (arg1 != -18) {
			this.method6052(false, null);
		}
		return this.method6031(20, 0, 0, arg0, 0);
	}

	@OriginalMember(owner = "loader!li", name = "a", descriptor = "(ZLjava/awt/datatransfer/Transferable;)Lloader!cq;")
	private Class272 method6052(@OriginalArg(0) boolean arg0, @OriginalArg(1) Transferable arg1) {
		return arg0 ? (Class272) null : this.method6031(19, 0, 0, arg1, 0);
	}

	@OriginalMember(owner = "loader!li", name = "a", descriptor = "(I)V")
	private void method6053(@OriginalArg(0) int arg0) {
		synchronized (this) {
			this.aBoolean660 = true;
			this.notifyAll();
		}
		try {
			this.aThread4.join();
		} catch (@Pc(21) InterruptedException local21) {
		}
		if (this.aClass277_2 != null) {
			try {
				this.aClass277_2.method6071();
			} catch (@Pc(31) IOException local31) {
			}
		}
		if (this.aClass277_3 != null) {
			try {
				this.aClass277_3.method6071();
			} catch (@Pc(41) IOException local41) {
			}
		}
		if (arg0 != 0) {
			return;
		}
		if (this.aClass277Array1 != null) {
			for (@Pc(50) int local50 = 0; local50 < this.aClass277Array1.length; local50++) {
				if (this.aClass277Array1[local50] != null) {
					try {
						this.aClass277Array1[local50].method6071();
					} catch (@Pc(72) IOException local72) {
					}
				}
			}
		}
		if (this.aClass277_1 != null) {
			try {
				this.aClass277_1.method6071();
			} catch (@Pc(84) IOException local84) {
			}
		}
	}
}
