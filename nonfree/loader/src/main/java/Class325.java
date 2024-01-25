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

@OriginalClass("loader!gaa")
public final class Class325 implements Runnable {

	@OriginalMember(owner = "loader!gaa", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString83;

	@OriginalMember(owner = "loader!gaa", name = "i", descriptor = "Ljava/lang/String;")
	private static String aString84;

	@OriginalMember(owner = "loader!gaa", name = "u", descriptor = "Ljava/lang/String;")
	private static String aString85;

	@OriginalMember(owner = "loader!gaa", name = "q", descriptor = "Ljava/lang/String;")
	public static String aString87;

	@OriginalMember(owner = "loader!gaa", name = "l", descriptor = "Ljava/lang/String;")
	private static String aString88;

	@OriginalMember(owner = "loader!gaa", name = "o", descriptor = "Ljava/lang/String;")
	private static String aString89;

	@OriginalMember(owner = "loader!gaa", name = "e", descriptor = "Ljava/lang/String;")
	private static String aString90;

	@OriginalMember(owner = "loader!gaa", name = "w", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod3;

	@OriginalMember(owner = "loader!gaa", name = "x", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod4;

	@OriginalMember(owner = "loader!gaa", name = "k", descriptor = "I")
	private static final int anInt9173 = 1;

	@OriginalMember(owner = "loader!gaa", name = "a", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable9 = new Hashtable(16);

	@OriginalMember(owner = "loader!gaa", name = "v", descriptor = "J")
	private static volatile long aLong397 = 0L;

	@OriginalMember(owner = "loader!gaa", name = "c", descriptor = "Lloader!kaa;")
	private Interface22 anInterface22_1;

	@OriginalMember(owner = "loader!gaa", name = "z", descriptor = "Z")
	private boolean aBoolean643 = false;

	@OriginalMember(owner = "loader!gaa", name = "p", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2 = null;

	@OriginalMember(owner = "loader!gaa", name = "n", descriptor = "Lloader!jr;")
	private Class326 aClass326_1 = null;

	@OriginalMember(owner = "loader!gaa", name = "g", descriptor = "Lloader!laa;")
	private Class327 aClass327_2 = null;

	@OriginalMember(owner = "loader!gaa", name = "h", descriptor = "Lloader!laa;")
	private Class327 aClass327_3 = null;

	@OriginalMember(owner = "loader!gaa", name = "r", descriptor = "Lloader!laa;")
	private Class327 aClass327_1 = null;

	@OriginalMember(owner = "loader!gaa", name = "j", descriptor = "Lloader!jr;")
	private Class326 aClass326_2 = null;

	@OriginalMember(owner = "loader!gaa", name = "s", descriptor = "Ljava/lang/String;")
	private final String aString86;

	@OriginalMember(owner = "loader!gaa", name = "f", descriptor = "I")
	private final int anInt9172;

	@OriginalMember(owner = "loader!gaa", name = "d", descriptor = "Ljava/awt/EventQueue;")
	private EventQueue anEventQueue2;

	@OriginalMember(owner = "loader!gaa", name = "y", descriptor = "[Lloader!laa;")
	private final Class327[] aClass327Array1;

	@OriginalMember(owner = "loader!gaa", name = "m", descriptor = "Lloader!c;")
	private Class322 aClass322_1;

	@OriginalMember(owner = "loader!gaa", name = "A", descriptor = "Lloader!a;")
	private Class320 aClass320_1;

	@OriginalMember(owner = "loader!gaa", name = "t", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread6;

	@OriginalMember(owner = "loader!gaa", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;)Ljava/io/File;")
	private static File method7569(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		@Pc(4) File local4 = (File) aHashtable9.get(arg1);
		if (local4 != null) {
			return local4;
		}
		@Pc(45) String[] local45 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString84, "/tmp/", "" };
		@Pc(70) String[] local70 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
		for (@Pc(78) int local78 = 0; local78 < 2; local78++) {
			for (@Pc(83) int local83 = 0; local83 < local70.length; local83++) {
				for (@Pc(93) int local93 = 0; local93 < local45.length; local93++) {
					@Pc(132) String local132 = local45[local93] + local70[local83] + "/" + (arg2 == null ? "" : arg2 + "/") + arg1;
					@Pc(134) RandomAccessFile local134 = null;
					try {
						@Pc(139) File local139 = new File(local132);
						if (local78 != 0 || local139.exists()) {
							@Pc(150) String local150 = local45[local93];
							if (local78 != 1 || local150.length() <= 0 || (new File(local150)).exists()) {
								(new File(local45[local93] + local70[local83])).mkdir();
								if (arg2 != null) {
									(new File(local45[local93] + local70[local83] + "/" + arg2)).mkdir();
								}
								local134 = new RandomAccessFile(local139, "rw");
								@Pc(218) int local218 = local134.read();
								local134.seek(0L);
								local134.write(local218);
								local134.seek(0L);
								local134.close();
								aHashtable9.put(arg1, local139);
								return local139;
							}
						}
					} catch (@Pc(237) Exception local237) {
						try {
							if (local134 != null) {
								local134.close();
							}
						} catch (@Pc(245) Exception local245) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "loader!gaa", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;)Lloader!laa;")
	private static Class327 method7580(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		@Pc(19) String local19;
		if (arg1 == 33) {
			local19 = "jagex_" + arg2 + "_preferences" + arg0 + "_rc.dat";
		} else if (arg1 == 34) {
			local19 = "jagex_" + arg2 + "_preferences" + arg0 + "_wip.dat";
		} else {
			local19 = "jagex_" + arg2 + "_preferences" + arg0 + ".dat";
		}
		@Pc(89) String[] local89 = new String[] { "c:/rscache/", "/rscache/", aString84, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(97) int local97 = 0; local97 < local89.length; local97++) {
			@Pc(109) String local109 = local89[local97];
			if (local109.length() <= 0 || (new File(local109)).exists()) {
				try {
					return new Class327(new File(local109, local19), "rw", 10000L);
				} catch (@Pc(135) Exception local135) {
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "loader!gaa", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class325(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		this.aString86 = arg2;
		aString87 = "Unknown";
		this.anApplet2 = arg0;
		aString83 = "1.1";
		this.anInt9172 = arg1;
		try {
			aString87 = System.getProperty("java.vendor");
			aString83 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			aString88 = System.getProperty("os.name");
		} catch (@Pc(48) Exception local48) {
			aString88 = "Unknown";
		}
		aString85 = aString88.toLowerCase();
		try {
			aString89 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(59) Exception local59) {
			aString89 = "";
		}
		try {
			aString90 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(67) Exception local67) {
			aString90 = "";
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
		this.aClass327_1 = new Class327(method7569(this.anInt9172, "random.dat", null), "rw", 25L);
		this.aClass327_2 = new Class327(this.method7562("main_file_cache.dat2"), "rw", 209715200L);
		this.aClass327_3 = new Class327(this.method7562("main_file_cache.idx255"), "rw", 1048576L);
		this.aClass327Array1 = new Class327[arg3];
		for (@Pc(192) int local192 = 0; local192 < arg3; local192++) {
			this.aClass327Array1[local192] = new Class327(this.method7562("main_file_cache.idx" + local192), "rw", 1048576L);
		}
		try {
			this.aClass322_1 = new Class322();
		} catch (@Pc(224) Throwable local224) {
		}
		try {
			this.aClass320_1 = new Class320();
		} catch (@Pc(231) Throwable local231) {
		}
		this.aBoolean643 = false;
		this.aThread6 = new Thread(this);
		this.aThread6.setPriority(10);
		this.aThread6.setDaemon(true);
		this.aThread6.start();
	}

	@OriginalMember(owner = "loader!gaa", name = "a", descriptor = "(Ljava/io/File;[BB)Z")
	private boolean method7559(@OriginalArg(0) File arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) byte arg2) {
		try {
			if (arg2 > -50) {
				this.method7560(null, -24);
			}
			@Pc(13) FileOutputStream local13 = new FileOutputStream(arg0);
			local13.write(arg1, 0, arg1.length);
			local13.close();
			return true;
		} catch (@Pc(24) IOException local24) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "loader!gaa", name = "a", descriptor = "(Ljava/awt/Frame;I)Lloader!jr;")
	private Class326 method7560(@OriginalArg(0) Frame arg0, @OriginalArg(1) int arg1) {
		if (arg1 > -66) {
			aString87 = null;
		}
		return this.method7571(0, 7, arg0, 0);
	}

	@OriginalMember(owner = "loader!gaa", name = "b", descriptor = "(B)V")
	private void method7561(@OriginalArg(0) byte arg0) {
		synchronized (this) {
			this.aBoolean643 = true;
			this.notifyAll();
		}
		try {
			this.aThread6.join();
		} catch (@Pc(21) InterruptedException local21) {
		}
		if (this.aClass327_2 != null) {
			try {
				this.aClass327_2.method7602();
			} catch (@Pc(31) IOException local31) {
			}
		}
		if (this.aClass327_3 != null) {
			try {
				this.aClass327_3.method7602();
			} catch (@Pc(41) IOException local41) {
			}
		}
		if (this.aClass327Array1 != null) {
			for (@Pc(47) int local47 = 0; local47 < this.aClass327Array1.length; local47++) {
				if (this.aClass327Array1[local47] != null) {
					try {
						this.aClass327Array1[local47].method7602();
					} catch (@Pc(69) IOException local69) {
					}
				}
			}
		}
		if (this.aClass327_1 != null) {
			try {
				this.aClass327_1.method7602();
			} catch (@Pc(82) IOException local82) {
			}
		}
		if (arg0 >= -28) {
			this.method7587((byte) -76, 111, 62, -41, 111);
		}
	}

	@OriginalMember(owner = "loader!gaa", name = "b", descriptor = "(Ljava/lang/String;I)Ljava/io/File;")
	public File method7562(@OriginalArg(0) String arg0) {
		return method7569(this.anInt9172, arg0, this.aString86);
	}

	@OriginalMember(owner = "loader!gaa", name = "a", descriptor = "(Ljava/lang/String;II)Lloader!jr;")
	private Class326 method7563(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return arg2 == -31887 ? this.method7571(0, 1, arg0, arg1) : (Class326) null;
	}

	@OriginalMember(owner = "loader!gaa", name = "a", descriptor = "(Ljava/lang/String;I)[B")
	private byte[] method7564(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class326 local7 = this.method7573(0, arg0, 0, 209715200, 21);
		if (arg1 != -5856) {
			this.method7563(null, 112, -33);
		}
		return (byte[]) local7.anObject20;
	}

	@OriginalMember(owner = "loader!gaa", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/Class;[Ljava/lang/Class;)Lloader!jr;")
	private Class326 method7565(@OriginalArg(0) byte arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Class arg2, @OriginalArg(3) Class[] arg3) {
		if (arg0 != 10) {
			this.method7559(null, null, (byte) -122);
		}
		return this.method7571(0, 8, new Object[] { arg2, arg1, arg3 }, 0);
	}

	@OriginalMember(owner = "loader!gaa", name = "a", descriptor = "(Ljava/net/URL;I)Lloader!jr;")
	private Class326 method7566(@OriginalArg(0) URL arg0, @OriginalArg(1) int arg1) {
		if (arg1 != -10950) {
			aString84 = null;
		}
		return this.method7571(0, 4, arg0, 0);
	}

	@OriginalMember(owner = "loader!gaa", name = "a", descriptor = "(ILjava/awt/Component;II)Lloader!jr;")
	private Class326 method7567(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg3 < 104) {
			return (Class326) null;
		} else {
			@Pc(8) Point local8 = arg1.getLocationOnScreen();
			return this.method7571(local8.y + arg2, 14, null, local8.x + arg0);
		}
	}

	@OriginalMember(owner = "loader!gaa", name = "a", descriptor = "(BLjava/awt/datatransfer/Transferable;)Lloader!jr;")
	private Class326 method7568(@OriginalArg(0) byte arg0, @OriginalArg(1) Transferable arg1) {
		if (arg0 <= 93) {
			this.aBoolean643 = true;
		}
		return this.method7571(0, 19, arg1, 0);
	}

	@OriginalMember(owner = "loader!gaa", name = "a", descriptor = "(ZBLjava/lang/String;)Lloader!jr;")
	private Class326 method7570(@OriginalArg(0) boolean arg0, @OriginalArg(2) String arg1) {
		return arg0 ? this.method7571(0, 12, arg1, 0) : this.method7571(0, 13, arg1, 0);
	}

	@OriginalMember(owner = "loader!gaa", name = "a", descriptor = "(IIILjava/lang/Object;I)Lloader!jr;")
	private Class326 method7571(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Object arg2, @OriginalArg(4) int arg3) {
		@Pc(3) Class326 local3 = new Class326();
		local3.anInt9179 = arg3;
		local3.anInt9178 = arg0;
		local3.anObject19 = arg2;
		local3.anInt9176 = arg1;
		synchronized (this) {
			if (this.aClass326_1 == null) {
				this.aClass326_1 = this.aClass326_2 = local3;
			} else {
				this.aClass326_1.aClass326_3 = local3;
				this.aClass326_1 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "loader!gaa", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/Class;)Lloader!jr;")
	private Class326 method7572(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class arg2) {
		return arg1 == 9 ? this.method7571(0, 9, new Object[] { arg2, arg0 }, 0) : (Class326) null;
	}

	@OriginalMember(owner = "loader!gaa", name = "a", descriptor = "(ILjava/lang/Object;III)Lloader!jr;")
	private Class326 method7573(@OriginalArg(0) int arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(3) Class326 local3 = new Class326();
		synchronized (local3) {
			local3.anObject19 = arg1;
			local3.anInt9178 = arg0;
			local3.anInt9176 = arg4;
			local3.anInt9179 = arg2;
			synchronized (this) {
				if (this.aClass326_1 == null) {
					this.aClass326_1 = this.aClass326_2 = local3;
				} else {
					this.aClass326_1.aClass326_3 = local3;
					this.aClass326_1 = local3;
				}
				if (arg3 != 209715200) {
					this.method7566(null, 98);
				}
				this.notify();
			}
			try {
				local3.wait();
			} catch (@Pc(64) InterruptedException local64) {
			}
			return local3;
		}
	}

	@OriginalMember(owner = "loader!gaa", name = "a", descriptor = "(ZLjava/lang/Class;)V")
	private void method7574(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class arg1) throws Exception {
		@Pc(12) Class[] local12 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
		@Pc(14) Runtime local14 = Runtime.getRuntime();
		@Pc(25) Method local25 = Class.forName("java.lang.reflect.Method").getMethod("setAccessible", Boolean.TYPE);
		@Pc(35) Method local35;
		if (!aString85.startsWith("mac")) {
			local35 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", local12);
			local25.invoke(local35, Boolean.TRUE);
			local35.invoke(local14, arg1, "jawt");
			local25.invoke(local35, Boolean.FALSE);
		}
		if (!arg0) {
			return;
		}
		local35 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local12);
		local25.invoke(local35, Boolean.TRUE);
		if (!aString85.startsWith("win")) {
			throw new Exception();
		}
		local35.invoke(local14, arg1, this.method7562("sw3d.dll").toString());
		local25.invoke(local35, Boolean.FALSE);
	}

	@OriginalMember(owner = "loader!gaa", name = "a", descriptor = "(IILjava/lang/Runnable;)Lloader!jr;")
	private Class326 method7575(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Runnable arg2) {
		if (arg1 != 2) {
			this.method7578(null, -114, 84, null, null, -43);
		}
		return this.method7571(0, 2, arg2, arg0);
	}

	@OriginalMember(owner = "loader!gaa", name = "a", descriptor = "(ZLjava/lang/String;)Lloader!jr;")
	private Class326 method7576(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1) {
		return arg0 ? (Class326) null : this.method7571(0, 16, arg1, 0);
	}

	@OriginalMember(owner = "loader!gaa", name = "d", descriptor = "(B)Lloader!kaa;")
	private Interface22 method7577(@OriginalArg(0) byte arg0) {
		if (arg0 != 51) {
			this.method7578(null, -117, -102, null, null, 15);
		}
		return this.anInterface22_1;
	}

	@OriginalMember(owner = "loader!gaa", name = "a", descriptor = "([IIILjava/awt/Component;Ljava/awt/Point;I)Lloader!jr;")
	private Class326 method7578(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Component arg3, @OriginalArg(4) Point arg4, @OriginalArg(5) int arg5) {
		if (arg5 <= 2) {
			this.method7568((byte) 26, null);
		}
		return this.method7571(arg2, 17, new Object[] { arg3, arg0, arg4 }, arg1);
	}

	@OriginalMember(owner = "loader!gaa", name = "a", descriptor = "(Z)Z")
	private boolean method7579(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.anInterface22_1 = null;
		}
		return this.aClass322_1 != null;
	}

	@OriginalMember(owner = "loader!gaa", name = "a", descriptor = "(B)V")
	private void method7581(@OriginalArg(0) byte arg0) {
		aLong397 = Class323.method7553() + 5000L;
		if (arg0 <= 69) {
			this.method7562(null);
		}
	}

	@OriginalMember(owner = "loader!gaa", name = "a", descriptor = "(ZZLjava/awt/Component;)Lloader!jr;")
	private Class326 method7582(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Component arg2) {
		if (arg1) {
			this.method7561((byte) -85);
		}
		return this.method7571(0, 15, arg2, arg0 ? 1 : 0);
	}

	@OriginalMember(owner = "loader!gaa", name = "a", descriptor = "(II)Lloader!jr;")
	private Class326 method7583(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 == 3 ? this.method7571(0, 3, null, arg0) : (Class326) null;
	}

	@OriginalMember(owner = "loader!gaa", name = "a", descriptor = "(BLjava/lang/String;)Lloader!jr;")
	private Class326 method7584(@OriginalArg(1) String arg0) {
		return this.method7571(0, 21, arg0, 0);
	}

	@OriginalMember(owner = "loader!gaa", name = "c", descriptor = "(B)Lloader!jr;")
	private Class326 method7585(@OriginalArg(0) byte arg0) {
		if (arg0 >= -88) {
			this.method7560(null, -122);
		}
		return this.method7571(0, 18, null, 0);
	}

	@OriginalMember(owner = "loader!gaa", name = "a", descriptor = "(I)Lloader!jr;")
	private Class326 method7586(@OriginalArg(0) int arg0) {
		return arg0 == 21690 ? this.method7571(0, 5, null, 0) : (Class326) null;
	}

	@OriginalMember(owner = "loader!gaa", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(16) Class326 local16;
			synchronized (this) {
				while (true) {
					if (this.aBoolean643) {
						return;
					}
					if (this.aClass326_2 != null) {
						local16 = this.aClass326_2;
						this.aClass326_2 = this.aClass326_2.aClass326_3;
						if (this.aClass326_2 == null) {
							this.aClass326_1 = null;
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
				@Pc(45) int local45 = local16.anInt9176;
				if (local45 == 1) {
					if (aLong397 > Class323.method7553()) {
						throw new IOException();
					}
					local16.anObject20 = new Socket(InetAddress.getByName((String) local16.anObject19), local16.anInt9179);
				} else if (local45 == 2) {
					@Pc(62) Thread local62 = new Thread((Runnable) local16.anObject19);
					local62.setDaemon(true);
					local62.start();
					local62.setPriority(local16.anInt9179);
					local16.anObject20 = local62;
				} else if (local45 == 4) {
					if (Class323.method7553() < aLong397) {
						throw new IOException();
					}
					local16.anObject20 = new DataInputStream(((URL) local16.anObject19).openStream());
				} else {
					@Pc(113) Object[] local113;
					if (local45 == 8) {
						local113 = (Object[]) local16.anObject19;
						if (((Class) local113[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local16.anObject20 = ((Class) local113[0]).getDeclaredMethod((String) local113[1], (Class[]) local113[2]);
					} else if (local45 == 9) {
						local113 = (Object[]) local16.anObject19;
						if (((Class) local113[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local16.anObject20 = ((Class) local113[0]).getDeclaredField((String) local113[1]);
					} else if (local45 == 18) {
						@Pc(490) Clipboard local490 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local16.anObject20 = local490.getContents(null);
					} else if (local45 == 19) {
						@Pc(148) Transferable local148 = (Transferable) local16.anObject19;
						@Pc(151) Clipboard local151 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local151.setContents(local148, null);
					} else {
						@Pc(297) String local297;
						if (local45 == 3) {
							if (Class323.method7553() < aLong397) {
								throw new IOException();
							}
							local297 = (local16.anInt9179 >> 24 & 0xFF) + "." + (local16.anInt9179 >> 16 & 0xFF) + "." + (local16.anInt9179 >> 8 & 0xFF) + "." + (local16.anInt9179 & 0xFF);
							local16.anObject20 = InetAddress.getByName(local297).getHostName();
						} else if (local45 == 21) {
							if (aLong397 > Class323.method7553()) {
								throw new IOException();
							}
							local16.anObject20 = InetAddress.getByName((String) local16.anObject19).getAddress();
						} else if (local45 == 5) {
							local16.anObject20 = this.aClass322_1.method7549();
						} else if (local45 == 6) {
							@Pc(186) Frame local186 = new Frame("Jagex Full Screen");
							local16.anObject20 = local186;
							local186.setResizable(false);
							this.aClass322_1.method7551(local16.anInt9178 >> 16, local186, local16.anInt9178 & 0xFFFF, local16.anInt9179 & 0xFFFF, local16.anInt9179 >>> 16);
						} else if (local45 == 7) {
							this.aClass322_1.method7550();
						} else {
							@Pc(232) Class327 local232;
							if (local45 == 12) {
								local232 = method7580((String) local16.anObject19, this.anInt9172, this.aString86);
								local16.anObject20 = local232;
							} else if (local45 == 13) {
								local232 = method7580((String) local16.anObject19, this.anInt9172, "");
								local16.anObject20 = local232;
							} else if (local45 == 14) {
								@Pc(385) int local385 = local16.anInt9179;
								@Pc(388) int local388 = local16.anInt9178;
								this.aClass320_1.method7547(local388, local385);
							} else if (local45 == 15) {
								@Pc(259) boolean local259 = local16.anInt9179 != 0;
								@Pc(263) Component local263 = (Component) local16.anObject19;
								this.aClass320_1.method7548(local263, local259);
							} else if (local45 == 17) {
								local113 = (Object[]) local16.anObject19;
								this.aClass320_1.method7546((Component) local113[0], (Point) local113[2], local16.anInt9179, local16.anInt9178, (int[]) local113[1]);
							} else if (local45 == 16) {
								try {
									if (!aString85.startsWith("win")) {
										throw new Exception();
									}
									local297 = (String) local16.anObject19;
									if (!local297.startsWith("http://") && !local297.startsWith("https://")) {
										throw new Exception();
									}
									@Pc(312) String local312 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
									@Pc(314) int local314 = 0;
									while (true) {
										if (local297.length() <= local314) {
											Runtime.getRuntime().exec("cmd /c start \"j\" \"" + local297 + "\"");
											local16.anObject20 = null;
											break;
										}
										if (local312.indexOf(local297.charAt(local314)) == -1) {
											throw new Exception();
										}
										local314++;
									}
								} catch (@Pc(350) Exception local350) {
									local16.anObject20 = local350;
									throw local350;
								}
							} else {
								throw new Exception("");
							}
						}
					}
				}
				local16.anInt9177 = 1;
			} catch (@Pc(559) ThreadDeath local559) {
				throw local559;
			} catch (@Pc(562) Throwable local562) {
				local16.anInt9177 = 2;
			}
			synchronized (local16) {
				local16.notify();
			}
		}
	}

	@OriginalMember(owner = "loader!gaa", name = "a", descriptor = "(BIIII)Lloader!jr;")
	private Class326 method7587(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return arg0 <= 44 ? (Class326) null : this.method7571((arg1 << 16) + arg3, 6, null, arg2 + (arg4 << 16));
	}
}
