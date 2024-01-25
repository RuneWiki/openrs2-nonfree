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

@OriginalClass("loader!et")
public final class Class272 implements Runnable {

	@OriginalMember(owner = "loader!et", name = "m", descriptor = "Ljava/lang/String;")
	private static String aString75;

	@OriginalMember(owner = "loader!et", name = "q", descriptor = "Ljava/lang/String;")
	public static String aString76;

	@OriginalMember(owner = "loader!et", name = "s", descriptor = "Ljava/lang/String;")
	private static String aString77;

	@OriginalMember(owner = "loader!et", name = "f", descriptor = "Ljava/lang/String;")
	private static String aString78;

	@OriginalMember(owner = "loader!et", name = "g", descriptor = "Ljava/lang/String;")
	private static String aString79;

	@OriginalMember(owner = "loader!et", name = "h", descriptor = "Ljava/lang/String;")
	private static String aString80;

	@OriginalMember(owner = "loader!et", name = "p", descriptor = "Ljava/lang/String;")
	public static String aString82;

	@OriginalMember(owner = "loader!et", name = "w", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod3;

	@OriginalMember(owner = "loader!et", name = "x", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod4;

	@OriginalMember(owner = "loader!et", name = "r", descriptor = "I")
	private static final int anInt7385 = 1;

	@OriginalMember(owner = "loader!et", name = "b", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable3 = new Hashtable(16);

	@OriginalMember(owner = "loader!et", name = "y", descriptor = "J")
	private static volatile long aLong225 = 0L;

	@OriginalMember(owner = "loader!et", name = "z", descriptor = "Lloader!qn;")
	private Interface14 anInterface14_1;

	@OriginalMember(owner = "loader!et", name = "c", descriptor = "Lloader!qt;")
	private Class276 aClass276_1 = null;

	@OriginalMember(owner = "loader!et", name = "l", descriptor = "Lloader!qt;")
	private Class276 aClass276_2 = null;

	@OriginalMember(owner = "loader!et", name = "j", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2 = null;

	@OriginalMember(owner = "loader!et", name = "d", descriptor = "Z")
	private boolean aBoolean694 = false;

	@OriginalMember(owner = "loader!et", name = "a", descriptor = "Lloader!rp;")
	private Class277 aClass277_2 = null;

	@OriginalMember(owner = "loader!et", name = "n", descriptor = "Lloader!rp;")
	private Class277 aClass277_1 = null;

	@OriginalMember(owner = "loader!et", name = "v", descriptor = "Lloader!rp;")
	private Class277 aClass277_3 = null;

	@OriginalMember(owner = "loader!et", name = "o", descriptor = "Ljava/lang/String;")
	private final String aString81;

	@OriginalMember(owner = "loader!et", name = "k", descriptor = "I")
	private int anInt7386;

	@OriginalMember(owner = "loader!et", name = "u", descriptor = "Ljava/awt/EventQueue;")
	private EventQueue anEventQueue2;

	@OriginalMember(owner = "loader!et", name = "i", descriptor = "[Lloader!rp;")
	private final Class277[] aClass277Array1;

	@OriginalMember(owner = "loader!et", name = "t", descriptor = "Lloader!g;")
	private Class274 aClass274_1;

	@OriginalMember(owner = "loader!et", name = "A", descriptor = "Lloader!f;")
	private Class273 aClass273_1;

	@OriginalMember(owner = "loader!et", name = "e", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread4;

	@OriginalMember(owner = "loader!et", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;II)Lloader!rp;")
	private static Class277 method5708(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(17) String local17;
		if (arg2 == 33) {
			local17 = "jagex_" + arg1 + "_preferences" + arg0 + "_rc.dat";
		} else if (arg2 == 34) {
			local17 = "jagex_" + arg1 + "_preferences" + arg0 + "_wip.dat";
		} else {
			local17 = "jagex_" + arg1 + "_preferences" + arg0 + ".dat";
		}
		@Pc(87) String[] local87 = new String[] { "c:/rscache/", "/rscache/", aString79, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(89) int local89 = 0; local89 < local87.length; local89++) {
			@Pc(97) String local97 = local87[local89];
			if (local97.length() <= 0 || (new File(local97)).exists()) {
				try {
					return new Class277(new File(local97, local17), "rw", 10000L);
				} catch (@Pc(124) Exception local124) {
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "loader!et", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;)Ljava/io/File;")
	private static File method5716(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		@Pc(4) File local4 = (File) aHashtable3.get(arg0);
		if (local4 != null) {
			return local4;
		}
		@Pc(44) String[] local44 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString79, "/tmp/", "" };
		@Pc(69) String[] local69 = new String[] { ".jagex_cache_" + arg1, ".file_store_" + arg1 };
		for (@Pc(71) int local71 = 0; local71 < 2; local71++) {
			for (@Pc(78) int local78 = 0; local78 < local69.length; local78++) {
				for (@Pc(84) int local84 = 0; local84 < local44.length; local84++) {
					@Pc(123) String local123 = local44[local84] + local69[local78] + "/" + (arg2 == null ? "" : arg2 + "/") + arg0;
					@Pc(125) RandomAccessFile local125 = null;
					try {
						@Pc(130) File local130 = new File(local123);
						if (local71 != 0 || local130.exists()) {
							@Pc(143) String local143 = local44[local84];
							if (local71 != 1 || local143.length() <= 0 || (new File(local143)).exists()) {
								(new File(local44[local84] + local69[local78])).mkdir();
								if (arg2 != null) {
									(new File(local44[local84] + local69[local78] + "/" + arg2)).mkdir();
								}
								local125 = new RandomAccessFile(local130, "rw");
								@Pc(212) int local212 = local125.read();
								local125.seek(0L);
								local125.write(local212);
								local125.seek(0L);
								local125.close();
								aHashtable3.put(arg0, local130);
								return local130;
							}
						}
					} catch (@Pc(231) Exception local231) {
						try {
							if (local125 != null) {
								local125.close();
							}
						} catch (@Pc(240) Exception local240) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "loader!et", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class272(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		aString82 = "Unknown";
		this.aString81 = arg2;
		this.anInt7386 = arg1;
		this.anApplet2 = arg0;
		aString76 = "1.1";
		try {
			aString82 = System.getProperty("java.vendor");
			aString76 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			aString78 = System.getProperty("os.name");
		} catch (@Pc(48) Exception local48) {
			aString78 = "Unknown";
		}
		aString77 = aString78.toLowerCase();
		try {
			aString80 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(59) Exception local59) {
			aString80 = "";
		}
		try {
			aString75 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(67) Exception local67) {
			aString75 = "";
		}
		try {
			aString79 = System.getProperty("user.home");
			if (aString79 != null) {
				aString79 = aString79 + "/";
			}
		} catch (@Pc(87) Exception local87) {
		}
		if (aString79 == null) {
			aString79 = "~/";
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
		this.aClass277_1 = new Class277(method5716("random.dat", this.anInt7386, null), "rw", 25L);
		this.aClass277_3 = new Class277(this.method5699("main_file_cache.dat2"), "rw", 209715200L);
		this.aClass277_2 = new Class277(this.method5699("main_file_cache.idx255"), "rw", 1048576L);
		this.aClass277Array1 = new Class277[arg3];
		for (@Pc(193) int local193 = 0; local193 < arg3; local193++) {
			this.aClass277Array1[local193] = new Class277(this.method5699("main_file_cache.idx" + local193), "rw", 1048576L);
		}
		try {
			this.aClass274_1 = new Class274();
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
		@Pc(253) Thread[] local253 = new Thread[1000];
		local239.enumerate(local253);
		for (@Pc(259) int local259 = 0; local259 < local253.length; local259++) {
			if (local253[local259] != null && local253[local259].getName().startsWith("AWT")) {
				local253[local259].setPriority(1);
			}
		}
		this.aBoolean694 = false;
		this.aThread4 = new Thread(this);
		this.aThread4.setPriority(10);
		this.aThread4.setDaemon(true);
		this.aThread4.start();
	}

	@OriginalMember(owner = "loader!et", name = "a", descriptor = "(IBLjava/lang/Object;II)Lloader!qt;")
	private Class276 method5695(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) Object arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(3) Class276 local3 = new Class276();
		synchronized (local3) {
			local3.anInt7391 = arg4;
			local3.anInt7392 = arg3;
			local3.anObject35 = arg2;
			local3.anInt7394 = arg0;
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
				if (arg1 != 117) {
					this.method5724((byte) -79, null);
				}
				local3.wait();
			} catch (@Pc(64) InterruptedException local64) {
			}
			return local3;
		}
	}

	@OriginalMember(owner = "loader!et", name = "a", descriptor = "(B)Lloader!qt;")
	private Class276 method5696(@OriginalArg(0) byte arg0) {
		if (arg0 != -128) {
			this.aClass277_1 = null;
		}
		return this.method5700(18, null, (byte) 99, 0, 0);
	}

	@OriginalMember(owner = "loader!et", name = "a", descriptor = "(Ljava/awt/datatransfer/Transferable;B)Lloader!qt;")
	private Class276 method5697(@OriginalArg(0) Transferable arg0, @OriginalArg(1) byte arg1) {
		return arg1 == 87 ? this.method5700(19, arg0, (byte) 99, 0, 0) : (Class276) null;
	}

	@OriginalMember(owner = "loader!et", name = "a", descriptor = "(IIIZI)Lloader!qt;")
	private Class276 method5698(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		if (!arg3) {
			aString82 = null;
		}
		return this.method5700(6, null, (byte) 99, arg0 + (arg4 << 16), arg1 + (arg2 << 16));
	}

	@OriginalMember(owner = "loader!et", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/io/File;")
	public File method5699(@OriginalArg(0) String arg0) {
		return method5716(arg0, this.anInt7386, this.aString81);
	}

	@OriginalMember(owner = "loader!et", name = "a", descriptor = "(ILjava/lang/Object;BII)Lloader!qt;")
	private Class276 method5700(@OriginalArg(0) int arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(3) Class276 local3 = new Class276();
		local3.anInt7394 = arg4;
		local3.anInt7392 = arg0;
		local3.anObject35 = arg1;
		local3.anInt7391 = arg3;
		synchronized (this) {
			if (this.aClass276_1 == null) {
				this.aClass276_1 = this.aClass276_2 = local3;
			} else {
				this.aClass276_1.aClass276_3 = local3;
				this.aClass276_1 = local3;
			}
			this.notify();
		}
		if (arg2 != 99) {
			this.method5697(null, (byte) 58);
		}
		return local3;
	}

	@OriginalMember(owner = "loader!et", name = "e", descriptor = "(B)Z")
	private boolean method5701(@OriginalArg(0) byte arg0) {
		if (arg0 >= -85) {
			this.method5710(null, 14);
		}
		return this.aClass274_1 != null;
	}

	@OriginalMember(owner = "loader!et", name = "a", descriptor = "(ILjava/awt/Component;Z)Lloader!qt;")
	private Class276 method5702(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) boolean arg2) {
		return arg0 == -23993 ? this.method5700(15, arg1, (byte) 99, arg2 ? 1 : 0, 0) : (Class276) null;
	}

	@OriginalMember(owner = "loader!et", name = "a", descriptor = "(Ljava/lang/Class;I)V")
	private void method5703(@OriginalArg(0) Class arg0) throws Exception {
		@Pc(12) Class[] local12 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
		@Pc(22) Runtime local22 = Runtime.getRuntime();
		@Pc(33) Method local33 = Class.forName("java.lang.reflect.Method").getMethod("setAccessible", Boolean.TYPE);
		@Pc(43) Method local43;
		if (!aString77.startsWith("mac")) {
			local43 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", local12);
			local33.invoke(local43, Boolean.TRUE);
			local43.invoke(local22, arg0, "jawt");
			local33.invoke(local43, Boolean.FALSE);
		}
		local43 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local12);
		local33.invoke(local43, Boolean.TRUE);
		if (!aString77.startsWith("win")) {
			throw new Exception();
		}
		local43.invoke(local22, arg0, this.method5699("sw3d.dll").toString());
		local33.invoke(local43, Boolean.FALSE);
	}

	@OriginalMember(owner = "loader!et", name = "b", descriptor = "(B)V")
	private void method5704(@OriginalArg(0) byte arg0) {
		synchronized (this) {
			this.aBoolean694 = true;
			this.notifyAll();
		}
		try {
			this.aThread4.join();
			if (arg0 >= -51) {
				this.method5706(null, false);
			}
		} catch (@Pc(30) InterruptedException local30) {
		}
		if (this.aClass277_3 != null) {
			try {
				this.aClass277_3.method5747();
			} catch (@Pc(40) IOException local40) {
			}
		}
		if (this.aClass277_2 != null) {
			try {
				this.aClass277_2.method5747();
			} catch (@Pc(49) IOException local49) {
			}
		}
		if (this.aClass277Array1 != null) {
			for (@Pc(56) int local56 = 0; local56 < this.aClass277Array1.length; local56++) {
				if (this.aClass277Array1[local56] != null) {
					try {
						this.aClass277Array1[local56].method5747();
					} catch (@Pc(78) IOException local78) {
					}
				}
			}
		}
		if (this.aClass277_1 != null) {
			try {
				this.aClass277_1.method5747();
			} catch (@Pc(90) IOException local90) {
			}
		}
	}

	@OriginalMember(owner = "loader!et", name = "b", descriptor = "(Ljava/lang/String;I)Lloader!qt;")
	private Class276 method5705(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 14) {
			this.aClass277_3 = null;
		}
		return this.method5700(16, arg0, (byte) 99, 0, 0);
	}

	@OriginalMember(owner = "loader!et", name = "a", descriptor = "(Ljava/lang/Class;Z)Lloader!qt;")
	private Class276 method5706(@OriginalArg(0) Class arg0, @OriginalArg(1) boolean arg1) {
		return arg1 ? (Class276) null : this.method5700(11, arg0, (byte) 99, 0, 0);
	}

	@OriginalMember(owner = "loader!et", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(16) Class276 local16;
			synchronized (this) {
				while (true) {
					if (this.aBoolean694) {
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
				@Pc(45) int local45 = local16.anInt7392;
				if (local45 == 1) {
					if (aLong225 > Class275.method5739(-51)) {
						throw new IOException();
					}
					local16.anObject34 = new Socket(InetAddress.getByName((String) local16.anObject35), local16.anInt7391);
				} else if (local45 == 2) {
					@Pc(648) Thread local648 = new Thread((Runnable) local16.anObject35);
					local648.setDaemon(true);
					local648.start();
					local648.setPriority(local16.anInt7391);
					local16.anObject34 = local648;
				} else if (local45 == 4) {
					if (Class275.method5739(-55) < aLong225) {
						throw new IOException();
					}
					local16.anObject34 = new DataInputStream(((URL) local16.anObject35).openStream());
				} else {
					@Pc(62) Object[] local62;
					if (local45 == 8) {
						local62 = (Object[]) local16.anObject35;
						if (((Class) local62[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local16.anObject34 = ((Class) local62[0]).getDeclaredMethod((String) local62[1], (Class[]) local62[2]);
					} else if (local45 == 9) {
						local62 = (Object[]) local16.anObject35;
						if (((Class) local62[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local16.anObject34 = ((Class) local62[0]).getDeclaredField((String) local62[1]);
					} else if (local45 == 18) {
						@Pc(588) Clipboard local588 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local16.anObject34 = local588.getContents(null);
					} else if (local45 == 19) {
						@Pc(105) Transferable local105 = (Transferable) local16.anObject35;
						@Pc(108) Clipboard local108 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local108.setContents(local105, null);
					} else {
						@Pc(348) String local348;
						if (local45 == 3) {
							if (Class275.method5739(-48) < aLong225) {
								throw new IOException();
							}
							local348 = (local16.anInt7391 >> 24 & 0xFF) + "." + (local16.anInt7391 >> 16 & 0xFF) + "." + (local16.anInt7391 >> 8 & 0xFF) + "." + (local16.anInt7391 & 0xFF);
							local16.anObject34 = InetAddress.getByName(local348).getHostName();
						} else if (local45 == 21) {
							if (Class275.method5739(-84) < aLong225) {
								throw new IOException();
							}
							local16.anObject34 = InetAddress.getByName((String) local16.anObject35).getAddress();
						} else if (local45 == 5) {
							local16.anObject34 = this.aClass274_1.method5729();
						} else if (local45 == 6) {
							@Pc(136) Frame local136 = new Frame("Jagex Full Screen");
							local16.anObject34 = local136;
							local136.setResizable(false);
							this.aClass274_1.method5731(local16.anInt7391 >>> 16, local136, local16.anInt7394 >> 16, local16.anInt7394 & 0xFFFF, local16.anInt7391 & 0xFFFF);
						} else if (local45 == 7) {
							this.aClass274_1.method5728();
						} else {
							@Pc(190) int local190;
							if (local45 == 11) {
								@Pc(177) Field local177 = Class.forName("java.lang.ClassLoader").getDeclaredField("nativeLibraries");
								local177.setAccessible(true);
								@Pc(188) Vector local188 = (Vector) local177.get(((Class) local16.anObject35).getClassLoader());
								for (local190 = 0; local188.size() > local190; local190++) {
									@Pc(202) Object local202 = local188.elementAt(local190);
									@Pc(209) Method local209 = local202.getClass().getDeclaredMethod("finalize");
									local209.setAccessible(true);
									local209.invoke(local202);
									local209.setAccessible(false);
									@Pc(226) Field local226 = local202.getClass().getDeclaredField("handle");
									local226.setAccessible(true);
									local226.set(local202, Integer.valueOf(0));
									local226.setAccessible(false);
								}
								local177.setAccessible(false);
							} else if (local45 == 12) {
								@Pc(260) Class277 local260 = method5708((String) local16.anObject35, this.aString81, this.anInt7386);
								local16.anObject34 = local260;
							} else if (local45 == 14) {
								@Pc(270) int local270 = local16.anInt7391;
								@Pc(273) int local273 = local16.anInt7394;
								this.aClass273_1.method5725(local270, local273);
							} else if (local45 == 15) {
								@Pc(292) boolean local292 = local16.anInt7391 != 0;
								@Pc(296) Component local296 = (Component) local16.anObject35;
								this.aClass273_1.method5726(local292, local296);
							} else if (local45 == 17) {
								local62 = (Object[]) local16.anObject35;
								this.aClass273_1.method5727((int[]) local62[1], local16.anInt7391, (Component) local62[0], local16.anInt7394, (Point) local62[2]);
							} else if (local45 == 16) {
								try {
									if (!aString77.startsWith("win")) {
										throw new Exception();
									}
									local348 = (String) local16.anObject35;
									if (!local348.startsWith("http://") && !local348.startsWith("https://")) {
										throw new Exception();
									}
									@Pc(362) String local362 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
									for (local190 = 0; local348.length() > local190; local190++) {
										if (local362.indexOf(local348.charAt(local190)) == -1) {
											throw new Exception();
										}
									}
									Runtime.getRuntime().exec("cmd /c start \"j\" \"" + local348 + "\"");
									local16.anObject34 = null;
								} catch (@Pc(401) Exception local401) {
									local16.anObject34 = local401;
									throw local401;
								}
							} else if (local45 == 20) {
								try {
									@Pc(422) Class[] local422 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
									@Pc(424) Runtime local424 = Runtime.getRuntime();
									@Pc(430) Method local430 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local422);
									local430.setAccessible(true);
									if (aString77.startsWith("win")) {
										if (aString80.startsWith("amd64") || aString80.startsWith("x86_64")) {
											local430.invoke(local424, local16.anObject35, this.method5699("jagmisc64.dll").toString());
										} else {
											local430.invoke(local424, local16.anObject35, this.method5699("jagmisc.dll").toString());
										}
									}
									local430.setAccessible(false);
								} catch (@Pc(490) Throwable local490) {
									local16.anObject34 = local490;
								}
							} else {
								throw new Exception("");
							}
						}
					}
				}
				local16.anInt7393 = 1;
			} catch (@Pc(686) ThreadDeath local686) {
				throw local686;
			} catch (@Pc(689) Throwable local689) {
				local16.anInt7393 = 2;
			}
			synchronized (local16) {
				local16.notify();
			}
		}
	}

	@OriginalMember(owner = "loader!et", name = "a", descriptor = "(ILjava/lang/Class;Ljava/lang/String;)Lloader!qt;")
	private Class276 method5707(@OriginalArg(0) int arg0, @OriginalArg(1) Class arg1, @OriginalArg(2) String arg2) {
		return arg0 >= -77 ? (Class276) null : this.method5700(9, new Object[] { arg1, arg2 }, (byte) 99, 0, 0);
	}

	@OriginalMember(owner = "loader!et", name = "a", descriptor = "(Ljava/awt/Point;Ljava/awt/Component;I[III)Lloader!qt;")
	private Class276 method5709(@OriginalArg(0) Point arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg5 != -23853) {
			this.aClass276_2 = null;
		}
		return this.method5700(17, new Object[] { arg1, arg3, arg0 }, (byte) 99, arg2, arg4);
	}

	@OriginalMember(owner = "loader!et", name = "a", descriptor = "(Ljava/net/URL;I)Lloader!qt;")
	private Class276 method5710(@OriginalArg(0) URL arg0, @OriginalArg(1) int arg1) {
		if (arg1 > -97) {
			this.aClass273_1 = null;
		}
		return this.method5700(4, arg0, (byte) 99, 0, 0);
	}

	@OriginalMember(owner = "loader!et", name = "a", descriptor = "(IILjava/lang/Runnable;)Lloader!qt;")
	private Class276 method5711(@OriginalArg(1) int arg0, @OriginalArg(2) Runnable arg1) {
		return this.method5700(2, arg1, (byte) 99, arg0, 0);
	}

	@OriginalMember(owner = "loader!et", name = "c", descriptor = "(Ljava/lang/String;I)Lloader!qt;")
	private Class276 method5712(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (arg1 <= 71) {
			this.aClass273_1 = null;
		}
		return this.method5700(21, arg0, (byte) 99, 0, 0);
	}

	@OriginalMember(owner = "loader!et", name = "a", descriptor = "(BI)Lloader!qt;")
	private Class276 method5713(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		if (arg0 != 122) {
			this.aBoolean694 = true;
		}
		return this.method5700(3, null, (byte) 99, arg1, 0);
	}

	@OriginalMember(owner = "loader!et", name = "a", descriptor = "(BLjava/lang/Class;)Lloader!qt;")
	private Class276 method5714(@OriginalArg(1) Class arg0) {
		return this.method5700(20, arg0, (byte) 99, 0, 0);
	}

	@OriginalMember(owner = "loader!et", name = "a", descriptor = "(BLjava/awt/Frame;)Lloader!qt;")
	private Class276 method5715(@OriginalArg(0) byte arg0, @OriginalArg(1) Frame arg1) {
		return arg0 == -64 ? this.method5700(7, arg1, (byte) 99, 0, 0) : (Class276) null;
	}

	@OriginalMember(owner = "loader!et", name = "c", descriptor = "(B)Lloader!qt;")
	private Class276 method5717(@OriginalArg(0) byte arg0) {
		if (arg0 != -80) {
			this.aClass277_1 = null;
		}
		return this.method5700(5, null, (byte) 99, 0, 0);
	}

	@OriginalMember(owner = "loader!et", name = "a", descriptor = "([Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;I)Lloader!qt;")
	private Class276 method5718(@OriginalArg(0) Class[] arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Class arg2, @OriginalArg(3) int arg3) {
		if (arg3 != 2) {
			method5708(null, null, 62);
		}
		return this.method5700(8, new Object[] { arg2, arg1, arg0 }, (byte) 99, 0, 0);
	}

	@OriginalMember(owner = "loader!et", name = "a", descriptor = "(Ljava/awt/Component;ZII)Lloader!qt;")
	private Class276 method5719(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) Point local2 = arg0.getLocationOnScreen();
		if (arg1) {
			this.method5706(null, false);
		}
		return this.method5700(14, null, (byte) 99, arg2 + local2.x, local2.y + arg3);
	}

	@OriginalMember(owner = "loader!et", name = "d", descriptor = "(B)V")
	private void method5720(@OriginalArg(0) byte arg0) {
		aLong225 = Class275.method5739(arg0 - 133) + 5000L;
		if (arg0 != 62) {
			aMethod4 = null;
		}
	}

	@OriginalMember(owner = "loader!et", name = "a", descriptor = "(Ljava/lang/String;I)[B")
	private byte[] method5721(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 14) {
			this.anInt7386 = 80;
		}
		@Pc(13) Class276 local13 = this.method5695(0, (byte) 117, arg0, 21, 0);
		return (byte[]) local13.anObject34;
	}

	@OriginalMember(owner = "loader!et", name = "a", descriptor = "(I)Lloader!qn;")
	private Interface14 method5722(@OriginalArg(0) int arg0) {
		if (arg0 != 18) {
			method5708(null, null, -105);
		}
		return this.anInterface14_1;
	}

	@OriginalMember(owner = "loader!et", name = "a", descriptor = "(ILjava/lang/String;I)Lloader!qt;")
	private Class276 method5723(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		return arg0 == 0 ? this.method5700(1, arg1, (byte) 99, arg2, 0) : (Class276) null;
	}

	@OriginalMember(owner = "loader!et", name = "a", descriptor = "(BLjava/lang/String;)Lloader!qt;")
	private Class276 method5724(@OriginalArg(0) byte arg0, @OriginalArg(1) String arg1) {
		return arg0 > -43 ? (Class276) null : this.method5700(12, arg1, (byte) 99, 0, 0);
	}
}
