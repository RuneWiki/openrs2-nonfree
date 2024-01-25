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
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!dj")
public final class Class325 implements Runnable {

	@OriginalMember(owner = "loader!dj", name = "o", descriptor = "Ljava/lang/String;")
	private static String aString110;

	@OriginalMember(owner = "loader!dj", name = "p", descriptor = "Ljava/lang/String;")
	private static String aString111;

	@OriginalMember(owner = "loader!dj", name = "n", descriptor = "Ljava/lang/String;")
	private static String aString112;

	@OriginalMember(owner = "loader!dj", name = "r", descriptor = "Ljava/lang/String;")
	public static String aString113;

	@OriginalMember(owner = "loader!dj", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString114;

	@OriginalMember(owner = "loader!dj", name = "i", descriptor = "Ljava/lang/String;")
	private static String aString115;

	@OriginalMember(owner = "loader!dj", name = "b", descriptor = "Ljava/lang/String;")
	private static String aString116;

	@OriginalMember(owner = "loader!dj", name = "v", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod3;

	@OriginalMember(owner = "loader!dj", name = "x", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod4;

	@OriginalMember(owner = "loader!dj", name = "g", descriptor = "I")
	private static final int anInt9730 = 1;

	@OriginalMember(owner = "loader!dj", name = "f", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable15 = new Hashtable(16);

	@OriginalMember(owner = "loader!dj", name = "y", descriptor = "J")
	private static volatile long aLong251 = 0L;

	@OriginalMember(owner = "loader!dj", name = "c", descriptor = "Lloader!pn;")
	private Interface22 anInterface22_1;

	@OriginalMember(owner = "loader!dj", name = "j", descriptor = "Z")
	private boolean aBoolean688 = false;

	@OriginalMember(owner = "loader!dj", name = "l", descriptor = "Lloader!vr;")
	private Class328 aClass328_2 = null;

	@OriginalMember(owner = "loader!dj", name = "s", descriptor = "Lloader!ci;")
	private Class323 aClass323_2 = null;

	@OriginalMember(owner = "loader!dj", name = "q", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2 = null;

	@OriginalMember(owner = "loader!dj", name = "m", descriptor = "Lloader!vr;")
	private Class328 aClass328_1 = null;

	@OriginalMember(owner = "loader!dj", name = "w", descriptor = "Lloader!ci;")
	private Class323 aClass323_3 = null;

	@OriginalMember(owner = "loader!dj", name = "d", descriptor = "Lloader!vr;")
	private Class328 aClass328_3 = null;

	@OriginalMember(owner = "loader!dj", name = "z", descriptor = "I")
	private final int anInt9731;

	@OriginalMember(owner = "loader!dj", name = "a", descriptor = "Ljava/lang/String;")
	private String aString109;

	@OriginalMember(owner = "loader!dj", name = "k", descriptor = "Ljava/awt/EventQueue;")
	private EventQueue anEventQueue2;

	@OriginalMember(owner = "loader!dj", name = "h", descriptor = "[Lloader!vr;")
	private Class328[] aClass328Array1;

	@OriginalMember(owner = "loader!dj", name = "t", descriptor = "Lloader!g;")
	private Class326 aClass326_1;

	@OriginalMember(owner = "loader!dj", name = "u", descriptor = "Lloader!b;")
	private Class322 aClass322_1;

	@OriginalMember(owner = "loader!dj", name = "A", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread6;

	@OriginalMember(owner = "loader!dj", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;)Ljava/io/File;")
	private static File method8048(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		@Pc(4) File local4 = (File) aHashtable15.get(arg0);
		if (local4 != null) {
			return local4;
		}
		@Pc(44) String[] local44 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString111, "/tmp/", "" };
		@Pc(69) String[] local69 = new String[] { ".jagex_cache_" + arg1, ".file_store_" + arg1 };
		for (@Pc(71) int local71 = 0; local71 < 2; local71++) {
			for (@Pc(78) int local78 = 0; local78 < local69.length; local78++) {
				for (@Pc(84) int local84 = 0; local84 < local44.length; local84++) {
					@Pc(119) String local119 = local44[local84] + local69[local78] + "/" + (arg2 == null ? "" : arg2 + "/") + arg0;
					@Pc(121) RandomAccessFile local121 = null;
					try {
						@Pc(126) File local126 = new File(local119);
						if (local71 != 0 || local126.exists()) {
							@Pc(140) String local140 = local44[local84];
							if (local71 != 1 || local140.length() <= 0 || (new File(local140)).exists()) {
								(new File(local44[local84] + local69[local78])).mkdir();
								if (arg2 != null) {
									(new File(local44[local84] + local69[local78] + "/" + arg2)).mkdir();
								}
								local121 = new RandomAccessFile(local126, "rw");
								@Pc(206) int local206 = local121.read();
								local121.seek(0L);
								local121.write(local206);
								local121.seek(0L);
								local121.close();
								aHashtable15.put(arg0, local126);
								return local126;
							}
						}
					} catch (@Pc(225) Exception local225) {
						try {
							if (local121 != null) {
								local121.close();
							}
						} catch (@Pc(234) Exception local234) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "loader!dj", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;)Lloader!vr;")
	private static Class328 method8064(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		@Pc(17) String local17;
		if (arg0 == 33) {
			local17 = "jagex_" + arg1 + "_preferences" + arg2 + "_rc.dat";
		} else if (arg0 == 34) {
			local17 = "jagex_" + arg1 + "_preferences" + arg2 + "_wip.dat";
		} else {
			local17 = "jagex_" + arg1 + "_preferences" + arg2 + ".dat";
		}
		@Pc(89) String[] local89 = new String[] { "c:/rscache/", "/rscache/", aString111, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(97) int local97 = 0; local97 < local89.length; local97++) {
			@Pc(109) String local109 = local89[local97];
			if (local109.length() <= 0 || (new File(local109)).exists()) {
				try {
					return new Class328(new File(local109, local17), "rw", 10000L);
				} catch (@Pc(134) Exception local134) {
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "loader!dj", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class325(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		this.anInt9731 = arg1;
		aString114 = "Unknown";
		aString113 = "1.1";
		this.anApplet2 = arg0;
		this.aString109 = arg2;
		try {
			aString114 = System.getProperty("java.vendor");
			aString113 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			aString116 = System.getProperty("os.name");
		} catch (@Pc(48) Exception local48) {
			aString116 = "Unknown";
		}
		aString115 = aString116.toLowerCase();
		try {
			aString112 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(59) Exception local59) {
			aString112 = "";
		}
		try {
			aString110 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(67) Exception local67) {
			aString110 = "";
		}
		try {
			aString111 = System.getProperty("user.home");
			if (aString111 != null) {
				aString111 = aString111 + "/";
			}
		} catch (@Pc(85) Exception local85) {
		}
		if (aString111 == null) {
			aString111 = "~/";
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
		} catch (@Pc(123) Exception local123) {
		}
		try {
			if (arg0 == null) {
				aMethod4 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				aMethod4 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(151) Exception local151) {
		}
		this.aClass328_1 = new Class328(method8048("random.dat", this.anInt9731, null), "rw", 25L);
		this.aClass328_2 = new Class328(this.method8037("main_file_cache.dat2", -8300), "rw", 209715200L);
		this.aClass328_3 = new Class328(this.method8037("main_file_cache.idx255", -8300), "rw", 1048576L);
		this.aClass328Array1 = new Class328[arg3];
		for (@Pc(192) int local192 = 0; local192 < arg3; local192++) {
			this.aClass328Array1[local192] = new Class328(this.method8037("main_file_cache.idx" + local192, -8300), "rw", 1048576L);
		}
		try {
			this.aClass326_1 = new Class326();
		} catch (@Pc(224) Throwable local224) {
		}
		try {
			this.aClass322_1 = new Class322();
		} catch (@Pc(231) Throwable local231) {
		}
		this.aBoolean688 = false;
		this.aThread6 = new Thread(this);
		this.aThread6.setPriority(10);
		this.aThread6.setDaemon(true);
		this.aThread6.start();
	}

	@OriginalMember(owner = "loader!dj", name = "b", descriptor = "(B)V")
	private void method8036(@OriginalArg(0) byte arg0) {
		synchronized (this) {
			this.aBoolean688 = true;
			this.notifyAll();
		}
		try {
			this.aThread6.join();
		} catch (@Pc(21) InterruptedException local21) {
		}
		if (this.aClass328_2 != null) {
			try {
				this.aClass328_2.method8086(17981);
			} catch (@Pc(31) IOException local31) {
			}
		}
		if (this.aClass328_3 != null) {
			try {
				this.aClass328_3.method8086(arg0 + 17926);
			} catch (@Pc(43) IOException local43) {
			}
		}
		if (this.aClass328Array1 != null) {
			for (@Pc(48) int local48 = 0; local48 < this.aClass328Array1.length; local48++) {
				if (this.aClass328Array1[local48] != null) {
					try {
						this.aClass328Array1[local48].method8086(17981);
					} catch (@Pc(68) IOException local68) {
					}
				}
			}
		}
		if (arg0 != 55) {
			this.method8052(109, null);
		}
		if (this.aClass328_1 != null) {
			try {
				this.aClass328_1.method8086(arg0 ^ 0x460A);
			} catch (@Pc(91) IOException local91) {
			}
		}
	}

	@OriginalMember(owner = "loader!dj", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/io/File;")
	public File method8037(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		return method8048(arg0, this.anInt9731, this.aString109);
	}

	@OriginalMember(owner = "loader!dj", name = "a", descriptor = "(IIIII)Lloader!ci;")
	private Class323 method8038(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return arg2 > -105 ? (Class323) null : this.method8057(arg0 + (arg1 << 16), null, 6, arg4 + (arg3 << 16), 0);
	}

	@OriginalMember(owner = "loader!dj", name = "a", descriptor = "(ZLjava/lang/Object;III)Lloader!ci;")
	private Class323 method8039(@OriginalArg(0) boolean arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (!arg0) {
			this.method8052(-65, null);
		}
		@Pc(12) Class323 local12 = new Class323();
		synchronized (local12) {
			local12.anInt9724 = arg2;
			local12.anObject19 = arg1;
			local12.anInt9727 = arg3;
			local12.anInt9725 = arg4;
			synchronized (this) {
				if (this.aClass323_2 == null) {
					this.aClass323_2 = this.aClass323_3 = local12;
				} else {
					this.aClass323_2.aClass323_1 = local12;
					this.aClass323_2 = local12;
				}
				this.notify();
			}
			try {
				local12.wait();
			} catch (@Pc(64) InterruptedException local64) {
			}
			return local12;
		}
	}

	@OriginalMember(owner = "loader!dj", name = "a", descriptor = "(ILjava/awt/Component;Z)Lloader!ci;")
	private Class323 method8040(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) boolean arg2) {
		if (arg0 != 17038) {
			method8064(50, null, null);
		}
		return this.method8057(0, arg1, 15, arg2 ? 1 : 0, 0);
	}

	@OriginalMember(owner = "loader!dj", name = "a", descriptor = "([Ljava/lang/Class;Ljava/lang/String;ILjava/lang/Class;)Lloader!ci;")
	private Class323 method8041(@OriginalArg(0) Class[] arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		if (arg2 != -8390) {
			this.method8036((byte) -49);
		}
		return this.method8057(0, new Object[] { arg3, arg1, arg0 }, 8, 0, 0);
	}

	@OriginalMember(owner = "loader!dj", name = "a", descriptor = "(ZLjava/lang/String;Ljava/lang/Class;)Lloader!ci;")
	private Class323 method8042(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Class arg2) {
		return arg0 ? this.method8057(0, new Object[] { arg2, arg1 }, 9, 0, 0) : (Class323) null;
	}

	@OriginalMember(owner = "loader!dj", name = "a", descriptor = "(III[ILjava/awt/Point;Ljava/awt/Component;)Lloader!ci;")
	private Class323 method8043(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) Point arg4, @OriginalArg(5) Component arg5) {
		if (arg0 != 17) {
			this.method8042(true, null, null);
		}
		return this.method8057(arg1, new Object[] { arg5, arg3, arg4 }, 17, arg2, 0);
	}

	@OriginalMember(owner = "loader!dj", name = "a", descriptor = "(IILjava/awt/Component;I)Lloader!ci;")
	private Class323 method8044(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Component arg2, @OriginalArg(3) int arg3) {
		if (arg3 != 14) {
			aString111 = null;
		}
		@Pc(8) Point local8 = arg2.getLocationOnScreen();
		return this.method8057(local8.y + arg0, null, 14, arg1 + local8.x, 0);
	}

	@OriginalMember(owner = "loader!dj", name = "a", descriptor = "(Ljava/net/URL;I)Lloader!ci;")
	private Class323 method8045(@OriginalArg(0) URL arg0, @OriginalArg(1) int arg1) {
		return arg1 >= -40 ? (Class323) null : this.method8057(0, arg0, 4, 0, 0);
	}

	@OriginalMember(owner = "loader!dj", name = "c", descriptor = "(B)V")
	private void method8046(@OriginalArg(0) byte arg0) {
		aLong251 = Class324.method8030() + 5000L;
		if (arg0 != 65) {
			this.anInterface22_1 = null;
		}
	}

	@OriginalMember(owner = "loader!dj", name = "a", descriptor = "(I)Z")
	private boolean method8047(@OriginalArg(0) int arg0) {
		if (arg0 != 16) {
			this.method8046((byte) 68);
		}
		return this.aClass326_1 != null;
	}

	@OriginalMember(owner = "loader!dj", name = "a", descriptor = "([BLjava/io/File;B)Z")
	private boolean method8049(@OriginalArg(0) byte[] arg0, @OriginalArg(1) File arg1, @OriginalArg(2) byte arg2) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg1);
			if (arg2 == 86) {
				local4.write(arg0, 0, arg0.length);
				local4.close();
				return true;
			} else {
				return true;
			}
		} catch (@Pc(20) IOException local20) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "loader!dj", name = "a", descriptor = "(ILjava/lang/Runnable;I)Lloader!ci;")
	private Class323 method8050(@OriginalArg(0) int arg0, @OriginalArg(1) Runnable arg1, @OriginalArg(2) int arg2) {
		if (arg0 != -10) {
			this.aString109 = null;
		}
		return this.method8057(0, arg1, 2, arg2, 0);
	}

	@OriginalMember(owner = "loader!dj", name = "a", descriptor = "(ILjava/lang/Class;)V")
	private void method8051(@OriginalArg(0) int arg0, @OriginalArg(1) Class arg1) throws Exception {
		if (arg0 != -20260) {
			return;
		}
		@Pc(16) Class[] local16 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
		@Pc(18) Runtime local18 = Runtime.getRuntime();
		@Pc(29) Method local29 = Class.forName("java.lang.reflect.Method").getMethod("setAccessible", Boolean.TYPE);
		@Pc(39) Method local39;
		if (!aString115.startsWith("mac")) {
			local39 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", local16);
			local29.invoke(local39, Boolean.TRUE);
			local39.invoke(local18, arg1, "jawt");
			local29.invoke(local39, Boolean.FALSE);
		}
		local39 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local16);
		local29.invoke(local39, Boolean.TRUE);
		if (!aString115.startsWith("win")) {
			throw new Exception();
		}
		local39.invoke(local18, arg1, this.method8037("sw3d.dll", arg0 ^ 0x6F48).toString());
		local29.invoke(local39, Boolean.FALSE);
	}

	@OriginalMember(owner = "loader!dj", name = "a", descriptor = "(ILjava/awt/datatransfer/Transferable;)Lloader!ci;")
	private Class323 method8052(@OriginalArg(0) int arg0, @OriginalArg(1) Transferable arg1) {
		if (arg0 != 0) {
			aString115 = null;
		}
		return this.method8057(0, arg1, 19, 0, 0);
	}

	@OriginalMember(owner = "loader!dj", name = "a", descriptor = "(B)Lloader!pn;")
	private Interface22 method8053(@OriginalArg(0) byte arg0) {
		if (arg0 != -119) {
			this.aClass328Array1 = null;
		}
		return this.anInterface22_1;
	}

	@OriginalMember(owner = "loader!dj", name = "a", descriptor = "(Z)Lloader!ci;")
	private Class323 method8054(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			aString111 = null;
		}
		return this.method8057(0, null, 18, 0, 0);
	}

	@OriginalMember(owner = "loader!dj", name = "a", descriptor = "(ILjava/lang/String;)Lloader!ci;")
	private Class323 method8055(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		return arg0 == 11810 ? this.method8057(0, arg1, 21, 0, arg0 - 11810) : (Class323) null;
	}

	@OriginalMember(owner = "loader!dj", name = "a", descriptor = "(Ljava/lang/String;ZB)Lloader!ci;")
	private Class323 method8056(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) byte arg2) {
		if (arg2 == 102) {
			return arg1 ? this.method8057(0, arg0, 12, 0, 0) : this.method8057(0, arg0, 13, 0, 0);
		} else {
			return (Class323) null;
		}
	}

	@OriginalMember(owner = "loader!dj", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(18) Class323 local18;
			synchronized (this) {
				while (true) {
					if (this.aBoolean688) {
						return;
					}
					if (this.aClass323_3 != null) {
						local18 = this.aClass323_3;
						this.aClass323_3 = this.aClass323_3.aClass323_1;
						if (this.aClass323_3 == null) {
							this.aClass323_2 = null;
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
				@Pc(46) int local46 = local18.anInt9725;
				if (local46 == 1) {
					if (Class324.method8030() < aLong251) {
						throw new IOException();
					}
					local18.anObject20 = new Socket(InetAddress.getByName((String) local18.anObject19), local18.anInt9727);
				} else if (local46 == 2) {
					@Pc(61) Thread local61 = new Thread((Runnable) local18.anObject19);
					local61.setDaemon(true);
					local61.start();
					local61.setPriority(local18.anInt9727);
					local18.anObject20 = local61;
				} else if (local46 == 4) {
					if (aLong251 > Class324.method8030()) {
						throw new IOException();
					}
					local18.anObject20 = new DataInputStream(((URL) local18.anObject19).openStream());
				} else {
					@Pc(113) Object[] local113;
					if (local46 == 8) {
						local113 = (Object[]) local18.anObject19;
						if (((Class) local113[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local18.anObject20 = ((Class) local113[0]).getDeclaredMethod((String) local113[1], (Class[]) local113[2]);
					} else if (local46 == 9) {
						local113 = (Object[]) local18.anObject19;
						if (((Class) local113[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local18.anObject20 = ((Class) local113[0]).getDeclaredField((String) local113[1]);
					} else if (local46 == 18) {
						@Pc(495) Clipboard local495 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local18.anObject20 = local495.getContents(null);
					} else if (local46 == 19) {
						@Pc(484) Transferable local484 = (Transferable) local18.anObject19;
						@Pc(487) Clipboard local487 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local487.setContents(local484, null);
					} else {
						@Pc(206) String local206;
						if (local46 == 3) {
							if (Class324.method8030() < aLong251) {
								throw new IOException();
							}
							local206 = (local18.anInt9727 >> 24 & 0xFF) + "." + (local18.anInt9727 >> 16 & 0xFF) + "." + (local18.anInt9727 >> 8 & 0xFF) + "." + (local18.anInt9727 & 0xFF);
							local18.anObject20 = InetAddress.getByName(local206).getHostName();
						} else if (local46 == 21) {
							if (Class324.method8030() < aLong251) {
								throw new IOException();
							}
							local18.anObject20 = InetAddress.getByName((String) local18.anObject19).getAddress();
						} else if (local46 == 5) {
							local18.anObject20 = this.aClass326_1.method8067();
						} else if (local46 == 6) {
							@Pc(258) Frame local258 = new Frame("Jagex Full Screen");
							local18.anObject20 = local258;
							local258.setResizable(false);
							this.aClass326_1.method8069(local18.anInt9724 >> 16, local18.anInt9724 & 0xFFFF, local258, local18.anInt9727 >>> 16, local18.anInt9727 & 0xFFFF);
						} else if (local46 == 7) {
							this.aClass326_1.method8070();
						} else {
							@Pc(307) Class328 local307;
							if (local46 == 12) {
								local307 = method8064(this.anInt9731, this.aString109, (String) local18.anObject19);
								local18.anObject20 = local307;
							} else if (local46 == 13) {
								local307 = method8064(this.anInt9731, "", (String) local18.anObject19);
								local18.anObject20 = local307;
							} else if (local46 == 14) {
								@Pc(335) int local335 = local18.anInt9727;
								@Pc(338) int local338 = local18.anInt9724;
								this.aClass322_1.method8024(local338, local335);
							} else if (local46 == 15) {
								@Pc(356) boolean local356 = local18.anInt9727 != 0;
								@Pc(360) Component local360 = (Component) local18.anObject19;
								this.aClass322_1.method8026(local356, local360);
							} else if (local46 == 17) {
								local113 = (Object[]) local18.anObject19;
								this.aClass322_1.method8025(local18.anInt9724, (int[]) local113[1], (Component) local113[0], local18.anInt9727, (Point) local113[2]);
							} else if (local46 == 16) {
								try {
									if (!aString115.startsWith("win")) {
										throw new Exception();
									}
									local206 = (String) local18.anObject19;
									if (!local206.startsWith("http://") && !local206.startsWith("https://")) {
										throw new Exception();
									}
									@Pc(401) String local401 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
									for (@Pc(403) int local403 = 0; local403 < local206.length(); local403++) {
										if (local401.indexOf(local206.charAt(local403)) == -1) {
											throw new Exception();
										}
									}
									Runtime.getRuntime().exec("cmd /c start \"j\" \"" + local206 + "\"");
									local18.anObject20 = null;
								} catch (@Pc(443) Exception local443) {
									local18.anObject20 = local443;
									throw local443;
								}
							} else {
								throw new Exception("");
							}
						}
					}
				}
				local18.anInt9726 = 1;
			} catch (@Pc(554) ThreadDeath local554) {
				throw local554;
			} catch (@Pc(557) Throwable local557) {
				local18.anInt9726 = 2;
			}
			synchronized (local18) {
				local18.notify();
			}
		}
	}

	@OriginalMember(owner = "loader!dj", name = "a", descriptor = "(ILjava/lang/Object;III)Lloader!ci;")
	private Class323 method8057(@OriginalArg(0) int arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(3) Class323 local3 = new Class323();
		local3.anObject19 = arg1;
		local3.anInt9725 = arg2;
		local3.anInt9724 = arg0;
		local3.anInt9727 = arg3;
		synchronized (this) {
			if (this.aClass323_2 == null) {
				this.aClass323_2 = this.aClass323_3 = local3;
			} else {
				this.aClass323_2.aClass323_1 = local3;
				this.aClass323_2 = local3;
			}
			this.notify();
		}
		if (arg4 != 0) {
			this.aString109 = null;
		}
		return local3;
	}

	@OriginalMember(owner = "loader!dj", name = "b", descriptor = "(I)Lloader!ci;")
	private Class323 method8058(@OriginalArg(0) int arg0) {
		if (arg0 <= 116) {
			this.method8050(-55, null, -28);
		}
		return this.method8057(0, null, 5, 0, 0);
	}

	@OriginalMember(owner = "loader!dj", name = "b", descriptor = "(Ljava/lang/String;I)Lloader!ci;")
	private Class323 method8059(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 26573) {
			aString116 = null;
		}
		return this.method8057(0, arg0, 16, 0, 0);
	}

	@OriginalMember(owner = "loader!dj", name = "a", descriptor = "(ILjava/awt/Frame;)Lloader!ci;")
	private Class323 method8060(@OriginalArg(0) int arg0, @OriginalArg(1) Frame arg1) {
		return arg0 == 7 ? this.method8057(0, arg1, 7, 0, arg0 ^ 0x7) : (Class323) null;
	}

	@OriginalMember(owner = "loader!dj", name = "a", descriptor = "(IZ)Lloader!ci;")
	private Class323 method8061(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		return arg1 ? (Class323) null : this.method8057(0, null, 3, arg0, 0);
	}

	@OriginalMember(owner = "loader!dj", name = "a", descriptor = "(ILjava/lang/String;I)Lloader!ci;")
	private Class323 method8062(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		return arg2 == 3298 ? this.method8057(0, arg1, 1, arg0, arg2 - 3298) : (Class323) null;
	}

	@OriginalMember(owner = "loader!dj", name = "a", descriptor = "(Ljava/lang/String;B)[B")
	private byte[] method8063(@OriginalArg(0) String arg0) {
		@Pc(7) Class323 local7 = this.method8039(true, arg0, 0, 0, 21);
		return (byte[]) local7.anObject20;
	}
}
