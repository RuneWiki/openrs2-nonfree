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

@OriginalClass("loader!hs")
public final class Class275 implements Runnable {

	@OriginalMember(owner = "loader!hs", name = "k", descriptor = "Ljava/lang/String;")
	private static String aString70;

	@OriginalMember(owner = "loader!hs", name = "a", descriptor = "Ljava/lang/String;")
	private static String aString71;

	@OriginalMember(owner = "loader!hs", name = "m", descriptor = "Ljava/lang/String;")
	private static String aString72;

	@OriginalMember(owner = "loader!hs", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString73;

	@OriginalMember(owner = "loader!hs", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString74;

	@OriginalMember(owner = "loader!hs", name = "c", descriptor = "Ljava/lang/String;")
	private static String aString75;

	@OriginalMember(owner = "loader!hs", name = "d", descriptor = "Ljava/lang/String;")
	private static String aString76;

	@OriginalMember(owner = "loader!hs", name = "w", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod3;

	@OriginalMember(owner = "loader!hs", name = "y", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod4;

	@OriginalMember(owner = "loader!hs", name = "p", descriptor = "I")
	private static int anInt7697 = 1;

	@OriginalMember(owner = "loader!hs", name = "j", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable4 = new Hashtable(16);

	@OriginalMember(owner = "loader!hs", name = "x", descriptor = "J")
	private static volatile long aLong230 = 0L;

	@OriginalMember(owner = "loader!hs", name = "b", descriptor = "Lloader!gm;")
	private Interface14 anInterface14_1;

	@OriginalMember(owner = "loader!hs", name = "n", descriptor = "Lloader!rq;")
	private Class277 aClass277_1 = null;

	@OriginalMember(owner = "loader!hs", name = "t", descriptor = "Lloader!rq;")
	private Class277 aClass277_2 = null;

	@OriginalMember(owner = "loader!hs", name = "o", descriptor = "Lloader!qd;")
	private Class276 aClass276_1 = null;

	@OriginalMember(owner = "loader!hs", name = "e", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2 = null;

	@OriginalMember(owner = "loader!hs", name = "z", descriptor = "Lloader!qd;")
	private Class276 aClass276_2 = null;

	@OriginalMember(owner = "loader!hs", name = "i", descriptor = "Z")
	private boolean aBoolean529 = false;

	@OriginalMember(owner = "loader!hs", name = "f", descriptor = "Lloader!rq;")
	private Class277 aClass277_3 = null;

	@OriginalMember(owner = "loader!hs", name = "q", descriptor = "Ljava/lang/String;")
	private String aString77;

	@OriginalMember(owner = "loader!hs", name = "u", descriptor = "I")
	private final int anInt7698;

	@OriginalMember(owner = "loader!hs", name = "v", descriptor = "Ljava/awt/EventQueue;")
	private EventQueue anEventQueue2;

	@OriginalMember(owner = "loader!hs", name = "r", descriptor = "[Lloader!rq;")
	private final Class277[] aClass277Array1;

	@OriginalMember(owner = "loader!hs", name = "A", descriptor = "Lloader!d;")
	private Class271 aClass271_1;

	@OriginalMember(owner = "loader!hs", name = "g", descriptor = "Lloader!e;")
	private Class272 aClass272_1;

	@OriginalMember(owner = "loader!hs", name = "s", descriptor = "Ljava/lang/Thread;")
	private Thread aThread4;

	@OriginalMember(owner = "loader!hs", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;")
	private static File method6101(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2) {
		@Pc(4) File local4 = (File) aHashtable4.get(arg1);
		if (local4 != null) {
			return local4;
		}
		@Pc(43) String[] local43 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString71, "/tmp/", "" };
		@Pc(68) String[] local68 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
		for (@Pc(70) int local70 = 0; local70 < 2; local70++) {
			for (@Pc(75) int local75 = 0; local75 < local68.length; local75++) {
				for (@Pc(81) int local81 = 0; local81 < local43.length; local81++) {
					@Pc(116) String local116 = local43[local81] + local68[local75] + "/" + (arg0 == null ? "" : arg0 + "/") + arg1;
					@Pc(118) RandomAccessFile local118 = null;
					try {
						@Pc(123) File local123 = new File(local116);
						if (local70 != 0 || local123.exists()) {
							@Pc(134) String local134 = local43[local81];
							if (local70 != 1 || local134.length() <= 0 || (new File(local134)).exists()) {
								(new File(local43[local81] + local68[local75])).mkdir();
								if (arg0 != null) {
									(new File(local43[local81] + local68[local75] + "/" + arg0)).mkdir();
								}
								local118 = new RandomAccessFile(local123, "rw");
								@Pc(199) int local199 = local118.read();
								local118.seek(0L);
								local118.write(local199);
								local118.seek(0L);
								local118.close();
								aHashtable4.put(arg1, local123);
								return local123;
							}
						}
					} catch (@Pc(218) Exception local218) {
						try {
							if (local118 != null) {
								local118.close();
							}
						} catch (@Pc(228) Exception local228) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "loader!hs", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;Z)Lloader!rq;")
	private static Class277 method6119(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		@Pc(35) String local35;
		if (arg0 == 33) {
			local35 = "jagex_" + arg2 + "_preferences" + arg1 + "_rc.dat";
		} else if (arg0 == 34) {
			local35 = "jagex_" + arg2 + "_preferences" + arg1 + "_wip.dat";
		} else {
			local35 = "jagex_" + arg2 + "_preferences" + arg1 + ".dat";
		}
		@Pc(102) String[] local102 = new String[] { "c:/rscache/", "/rscache/", aString71, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(104) int local104 = 0; local104 < local102.length; local104++) {
			@Pc(116) String local116 = local102[local104];
			if (local116.length() <= 0 || (new File(local116)).exists()) {
				try {
					return new Class277(new File(local116, local35), "rw", 10000L);
				} catch (@Pc(141) Exception local141) {
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "loader!hs", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class275(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		this.aString77 = arg2;
		this.anInt7698 = arg1;
		this.anApplet2 = arg0;
		aString73 = "Unknown";
		aString74 = "1.1";
		try {
			aString73 = System.getProperty("java.vendor");
			aString74 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			aString72 = System.getProperty("os.name");
		} catch (@Pc(48) Exception local48) {
			aString72 = "Unknown";
		}
		aString70 = aString72.toLowerCase();
		try {
			aString75 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(59) Exception local59) {
			aString75 = "";
		}
		try {
			aString76 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(67) Exception local67) {
			aString76 = "";
		}
		try {
			aString71 = System.getProperty("user.home");
			if (aString71 != null) {
				aString71 = aString71 + "/";
			}
		} catch (@Pc(86) Exception local86) {
		}
		if (aString71 == null) {
			aString71 = "~/";
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
		} catch (@Pc(125) Exception local125) {
		}
		try {
			if (arg0 == null) {
				aMethod3 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				aMethod3 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(153) Exception local153) {
		}
		this.aClass277_3 = new Class277(method6101(null, "random.dat", this.anInt7698), "rw", 25L);
		this.aClass277_1 = new Class277(this.method6111("main_file_cache.dat2"), "rw", 209715200L);
		this.aClass277_2 = new Class277(this.method6111("main_file_cache.idx255"), "rw", 1048576L);
		this.aClass277Array1 = new Class277[arg3];
		for (@Pc(194) int local194 = 0; local194 < arg3; local194++) {
			this.aClass277Array1[local194] = new Class277(this.method6111("main_file_cache.idx" + local194), "rw", 1048576L);
		}
		try {
			this.aClass271_1 = new Class271();
		} catch (@Pc(226) Throwable local226) {
		}
		try {
			this.aClass272_1 = new Class272();
		} catch (@Pc(233) Throwable local233) {
		}
		@Pc(236) ThreadGroup local236 = Thread.currentThread().getThreadGroup();
		for (@Pc(239) ThreadGroup local239 = local236.getParent(); local239 != null; local239 = local239.getParent()) {
			local236 = local239;
		}
		@Pc(250) Thread[] local250 = new Thread[1000];
		local236.enumerate(local250);
		for (@Pc(256) int local256 = 0; local256 < local250.length; local256++) {
			if (local250[local256] != null && local250[local256].getName().startsWith("AWT")) {
				local250[local256].setPriority(1);
			}
		}
		this.aBoolean529 = false;
		this.aThread4 = new Thread(this);
		this.aThread4.setPriority(10);
		this.aThread4.setDaemon(true);
		this.aThread4.start();
	}

	@OriginalMember(owner = "loader!hs", name = "a", descriptor = "(IILjava/lang/Object;II)Lloader!qd;")
	private Class276 method6102(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Object arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(3) Class276 local3 = new Class276();
		synchronized (local3) {
			local3.anInt7706 = arg1;
			local3.anInt7704 = arg0;
			local3.anObject12 = arg2;
			local3.anInt7703 = arg3;
			synchronized (this) {
				if (this.aClass276_1 == null) {
					this.aClass276_1 = this.aClass276_2 = local3;
				} else {
					this.aClass276_1.aClass276_3 = local3;
					this.aClass276_1 = local3;
				}
				this.notify();
				if (arg4 != 0) {
					this.method6114(null, 104);
				}
			}
			try {
				local3.wait();
			} catch (@Pc(63) InterruptedException local63) {
			}
			return local3;
		}
	}

	@OriginalMember(owner = "loader!hs", name = "b", descriptor = "(B)Lloader!gm;")
	private Interface14 method6103(@OriginalArg(0) byte arg0) {
		if (arg0 != 38) {
			this.aThread4 = null;
		}
		return this.anInterface14_1;
	}

	@OriginalMember(owner = "loader!hs", name = "a", descriptor = "(Ljava/lang/String;[Ljava/lang/Class;BLjava/lang/Class;)Lloader!qd;")
	private Class276 method6104(@OriginalArg(0) String arg0, @OriginalArg(1) Class[] arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) Class arg3) {
		if (arg2 != -6) {
			this.aClass276_2 = null;
		}
		return this.method6122(new Object[] { arg3, arg0, arg1 }, 0, 0, 8, 0);
	}

	@OriginalMember(owner = "loader!hs", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;B)Lloader!qd;")
	private Class276 method6105(@OriginalArg(0) String arg0, @OriginalArg(1) Class arg1, @OriginalArg(2) byte arg2) {
		if (arg2 != 63) {
			this.method6113(null, true);
		}
		return this.method6122(new Object[] { arg1, arg0 }, 0, 0, 9, 0);
	}

	@OriginalMember(owner = "loader!hs", name = "a", descriptor = "(Ljava/lang/String;Z)[B")
	private byte[] method6106(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) {
		if (arg1) {
			this.anApplet2 = null;
		}
		@Pc(13) Class276 local13 = this.method6102(0, 21, arg0, 0, 0);
		return (byte[]) local13.anObject11;
	}

	@OriginalMember(owner = "loader!hs", name = "a", descriptor = "(Ljava/awt/Component;III)Lloader!qd;")
	private Class276 method6107(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1 != 31331) {
			this.method6118(78);
		}
		@Pc(8) Point local8 = arg0.getLocationOnScreen();
		return this.method6122(null, arg3 + local8.y, local8.x + arg2, 14, 0);
	}

	@OriginalMember(owner = "loader!hs", name = "a", descriptor = "(B)Lloader!qd;")
	private Class276 method6108(@OriginalArg(0) byte arg0) {
		if (arg0 != -65) {
			this.method6106(null, false);
		}
		return this.method6122(null, 0, 0, 18, 0);
	}

	@OriginalMember(owner = "loader!hs", name = "a", descriptor = "(IIIBI)Lloader!qd;")
	private Class276 method6109(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4) {
		if (arg3 >= -29) {
			aString74 = null;
		}
		return this.method6122(null, (arg0 << 16) + arg4, arg1 + (arg2 << 16), 6, 0);
	}

	@OriginalMember(owner = "loader!hs", name = "a", descriptor = "(Ljava/lang/Runnable;II)Lloader!qd;")
	private Class276 method6110(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 < 51) {
			anInt7697 = 74;
		}
		return this.method6122(arg0, 0, arg1, 2, 0);
	}

	@OriginalMember(owner = "loader!hs", name = "b", descriptor = "(Ljava/lang/String;I)Ljava/io/File;")
	public File method6111(@OriginalArg(0) String arg0) {
		return method6101(this.aString77, arg0, this.anInt7698);
	}

	@OriginalMember(owner = "loader!hs", name = "a", descriptor = "(ILjava/net/URL;)Lloader!qd;")
	private Class276 method6112(@OriginalArg(0) int arg0, @OriginalArg(1) URL arg1) {
		return arg0 <= 81 ? (Class276) null : this.method6122(arg1, 0, 0, 4, 0);
	}

	@OriginalMember(owner = "loader!hs", name = "b", descriptor = "(Ljava/lang/String;Z)Lloader!qd;")
	private Class276 method6113(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) {
		if (arg1) {
			this.aClass277_2 = null;
		}
		return this.method6122(arg0, 0, 0, 12, 0);
	}

	@OriginalMember(owner = "loader!hs", name = "a", descriptor = "(Ljava/awt/datatransfer/Transferable;I)Lloader!qd;")
	private Class276 method6114(@OriginalArg(0) Transferable arg0, @OriginalArg(1) int arg1) {
		if (arg1 != -26435) {
			this.method6118(-58);
		}
		return this.method6122(arg0, 0, 0, 19, 0);
	}

	@OriginalMember(owner = "loader!hs", name = "a", descriptor = "(ZLjava/lang/Class;)Lloader!qd;")
	private Class276 method6115(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class arg1) {
		return arg0 ? this.method6122(arg1, 0, 0, 20, 0) : (Class276) null;
	}

	@OriginalMember(owner = "loader!hs", name = "a", descriptor = "(Ljava/lang/String;I)Lloader!qd;")
	private Class276 method6116(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 0) {
			this.method6105(null, null, (byte) -101);
		}
		return this.method6122(arg0, 0, 0, 16, 0);
	}

	@OriginalMember(owner = "loader!hs", name = "a", descriptor = "(Ljava/lang/Class;I)V")
	private void method6117(@OriginalArg(0) Class arg0, @OriginalArg(1) int arg1) throws Exception {
		@Pc(12) Class[] local12 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
		@Pc(14) Runtime local14 = Runtime.getRuntime();
		if (arg1 != -13805) {
			return;
		}
		@Pc(29) Method local29 = Class.forName("java.lang.reflect.Method").getMethod("setAccessible", Boolean.TYPE);
		@Pc(39) Method local39;
		if (!aString70.startsWith("mac")) {
			local39 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", local12);
			local29.invoke(local39, Boolean.TRUE);
			local39.invoke(local14, arg0, "jawt");
			local29.invoke(local39, Boolean.FALSE);
		}
		local39 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local12);
		local29.invoke(local39, Boolean.TRUE);
		if (!aString70.startsWith("win")) {
			throw new Exception();
		}
		local39.invoke(local14, arg0, this.method6111("sw3d.dll").toString());
		local29.invoke(local39, Boolean.FALSE);
	}

	@OriginalMember(owner = "loader!hs", name = "c", descriptor = "(I)V")
	private void method6118(@OriginalArg(0) int arg0) {
		synchronized (this) {
			this.aBoolean529 = true;
			this.notifyAll();
		}
		if (arg0 != -14823) {
			return;
		}
		try {
			this.aThread4.join();
		} catch (@Pc(25) InterruptedException local25) {
		}
		if (this.aClass277_1 != null) {
			try {
				this.aClass277_1.method6139(arg0 + 14823);
			} catch (@Pc(37) IOException local37) {
			}
		}
		if (this.aClass277_2 != null) {
			try {
				this.aClass277_2.method6139(arg0 ^ 0xFFFFC619);
			} catch (@Pc(48) IOException local48) {
			}
		}
		if (this.aClass277Array1 != null) {
			for (@Pc(55) int local55 = 0; local55 < this.aClass277Array1.length; local55++) {
				if (this.aClass277Array1[local55] != null) {
					try {
						this.aClass277Array1[local55].method6139(0);
					} catch (@Pc(77) IOException local77) {
					}
				}
			}
		}
		if (this.aClass277_3 != null) {
			try {
				this.aClass277_3.method6139(0);
			} catch (@Pc(90) IOException local90) {
			}
		}
	}

	@OriginalMember(owner = "loader!hs", name = "a", descriptor = "(Ljava/awt/Component;Ljava/awt/Point;[IIII)Lloader!qd;")
	private Class276 method6120(@OriginalArg(0) Component arg0, @OriginalArg(1) Point arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		return this.method6122(new Object[] { arg0, arg2, arg1 }, arg4, arg3, 17, 0);
	}

	@OriginalMember(owner = "loader!hs", name = "a", descriptor = "(Ljava/lang/String;B)Lloader!qd;")
	private Class276 method6121(@OriginalArg(0) String arg0, @OriginalArg(1) byte arg1) {
		if (arg1 <= 113) {
			this.aClass272_1 = null;
		}
		return this.method6122(arg0, 0, 0, 21, 0);
	}

	@OriginalMember(owner = "loader!hs", name = "a", descriptor = "(Ljava/lang/Object;IIII)Lloader!qd;")
	private Class276 method6122(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg4 != 0) {
			aMethod4 = null;
		}
		@Pc(8) Class276 local8 = new Class276();
		local8.anObject12 = arg0;
		local8.anInt7704 = arg2;
		local8.anInt7703 = arg1;
		local8.anInt7706 = arg3;
		synchronized (this) {
			if (this.aClass276_1 == null) {
				this.aClass276_1 = this.aClass276_2 = local8;
			} else {
				this.aClass276_1.aClass276_3 = local8;
				this.aClass276_1 = local8;
			}
			this.notify();
			return local8;
		}
	}

	@OriginalMember(owner = "loader!hs", name = "a", descriptor = "(ILjava/awt/Frame;)Lloader!qd;")
	private Class276 method6123(@OriginalArg(0) int arg0, @OriginalArg(1) Frame arg1) {
		if (arg0 <= 37) {
			this.aClass271_1 = null;
		}
		return this.method6122(arg1, 0, 0, 7, 0);
	}

	@OriginalMember(owner = "loader!hs", name = "b", descriptor = "(I)V")
	private void method6124(@OriginalArg(0) int arg0) {
		if (arg0 != 0) {
			this.method6122(null, 29, -38, -16, 82);
		}
		aLong230 = Class274.method6100() + 5000L;
	}

	@OriginalMember(owner = "loader!hs", name = "a", descriptor = "(BLjava/lang/Class;)Lloader!qd;")
	private Class276 method6125(@OriginalArg(0) byte arg0, @OriginalArg(1) Class arg1) {
		if (arg0 > -60) {
			this.aString77 = null;
		}
		return this.method6122(arg1, 0, 0, 11, 0);
	}

	@OriginalMember(owner = "loader!hs", name = "a", descriptor = "(Ljava/lang/String;II)Lloader!qd;")
	private Class276 method6126(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 != -1727) {
			this.method6103((byte) 70);
		}
		return this.method6122(arg0, 0, arg1, 1, 0);
	}

	@OriginalMember(owner = "loader!hs", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(17) Class276 local17;
			synchronized (this) {
				while (true) {
					if (this.aBoolean529) {
						return;
					}
					if (this.aClass276_2 != null) {
						local17 = this.aClass276_2;
						this.aClass276_2 = this.aClass276_2.aClass276_3;
						if (this.aClass276_2 == null) {
							this.aClass276_1 = null;
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
				@Pc(46) int local46 = local17.anInt7706;
				if (local46 == 1) {
					if (Class274.method6100() < aLong230) {
						throw new IOException();
					}
					local17.anObject11 = new Socket(InetAddress.getByName((String) local17.anObject12), local17.anInt7704);
				} else if (local46 == 2) {
					@Pc(84) Thread local84 = new Thread((Runnable) local17.anObject12);
					local84.setDaemon(true);
					local84.start();
					local84.setPriority(local17.anInt7704);
					local17.anObject11 = local84;
				} else if (local46 == 4) {
					if (Class274.method6100() < aLong230) {
						throw new IOException();
					}
					local17.anObject11 = new DataInputStream(((URL) local17.anObject12).openStream());
				} else {
					@Pc(110) Object[] local110;
					if (local46 == 8) {
						local110 = (Object[]) local17.anObject12;
						if (((Class) local110[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local17.anObject11 = ((Class) local110[0]).getDeclaredMethod((String) local110[1], (Class[]) local110[2]);
					} else if (local46 == 9) {
						local110 = (Object[]) local17.anObject12;
						if (((Class) local110[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local17.anObject11 = ((Class) local110[0]).getDeclaredField((String) local110[1]);
					} else if (local46 == 18) {
						@Pc(640) Clipboard local640 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local17.anObject11 = local640.getContents(null);
					} else if (local46 == 19) {
						@Pc(629) Transferable local629 = (Transferable) local17.anObject12;
						@Pc(632) Clipboard local632 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local632.setContents(local629, null);
					} else {
						@Pc(199) String local199;
						if (local46 == 3) {
							if (Class274.method6100() < aLong230) {
								throw new IOException();
							}
							local199 = (local17.anInt7704 >> 24 & 0xFF) + "." + (local17.anInt7704 >> 16 & 0xFF) + "." + (local17.anInt7704 >> 8 & 0xFF) + "." + (local17.anInt7704 & 0xFF);
							local17.anObject11 = InetAddress.getByName(local199).getHostName();
						} else if (local46 == 21) {
							if (Class274.method6100() < aLong230) {
								throw new IOException();
							}
							local17.anObject11 = InetAddress.getByName((String) local17.anObject12).getAddress();
						} else if (local46 == 5) {
							local17.anObject11 = this.aClass271_1.method6081();
						} else if (local46 == 6) {
							@Pc(597) Frame local597 = new Frame("Jagex Full Screen");
							local17.anObject11 = local597;
							local597.setResizable(false);
							this.aClass271_1.method6084(local17.anInt7703 & 0xFFFF, local17.anInt7703 >> 16, local17.anInt7704 & 0xFFFF, local17.anInt7704 >>> 16, local597);
						} else if (local46 == 7) {
							this.aClass271_1.method6082();
						} else {
							@Pc(270) int local270;
							if (local46 == 11) {
								@Pc(257) Field local257 = Class.forName("java.lang.ClassLoader").getDeclaredField("nativeLibraries");
								local257.setAccessible(true);
								@Pc(268) Vector local268 = (Vector) local257.get(((Class) local17.anObject12).getClassLoader());
								for (local270 = 0; local268.size() > local270; local270++) {
									@Pc(282) Object local282 = local268.elementAt(local270);
									@Pc(289) Method local289 = local282.getClass().getDeclaredMethod("finalize");
									local289.setAccessible(true);
									local289.invoke(local282);
									local289.setAccessible(false);
									@Pc(306) Field local306 = local282.getClass().getDeclaredField("handle");
									local306.setAccessible(true);
									local306.set(local282, Integer.valueOf(0));
									local306.setAccessible(false);
								}
								local257.setAccessible(false);
							} else if (local46 == 12) {
								@Pc(583) Class277 local583 = method6119(this.anInt7698, (String) local17.anObject12, this.aString77);
								local17.anObject11 = local583;
							} else if (local46 == 14) {
								@Pc(336) int local336 = local17.anInt7704;
								@Pc(339) int local339 = local17.anInt7703;
								this.aClass272_1.method6086(local336, local339);
							} else if (local46 == 15) {
								@Pc(562) boolean local562 = local17.anInt7704 != 0;
								@Pc(566) Component local566 = (Component) local17.anObject12;
								this.aClass272_1.method6085(local562, local566);
							} else if (local46 == 17) {
								local110 = (Object[]) local17.anObject12;
								this.aClass272_1.method6087(local17.anInt7703, (Point) local110[2], local17.anInt7704, (Component) local110[0], (int[]) local110[1]);
							} else if (local46 == 16) {
								try {
									if (!aString70.startsWith("win")) {
										throw new Exception();
									}
									local199 = (String) local17.anObject12;
									if (!local199.startsWith("http://") && !local199.startsWith("https://")) {
										throw new Exception();
									}
									@Pc(505) String local505 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
									for (local270 = 0; local270 < local199.length(); local270++) {
										if (local505.indexOf(local199.charAt(local270)) == -1) {
											throw new Exception();
										}
									}
									Runtime.getRuntime().exec("cmd /c start \"j\" \"" + local199 + "\"");
									local17.anObject11 = null;
								} catch (@Pc(547) Exception local547) {
									local17.anObject11 = local547;
									throw local547;
								}
							} else if (local46 == 20) {
								try {
									@Pc(402) Class[] local402 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
									@Pc(404) Runtime local404 = Runtime.getRuntime();
									@Pc(410) Method local410 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local402);
									local410.setAccessible(true);
									if (aString70.startsWith("win")) {
										if (aString75.startsWith("amd64") || aString75.startsWith("x86_64")) {
											local410.invoke(local404, local17.anObject12, this.method6111("jagmisc64.dll").toString());
										} else {
											local410.invoke(local404, local17.anObject12, this.method6111("jagmisc.dll").toString());
										}
									}
									local410.setAccessible(false);
								} catch (@Pc(470) Throwable local470) {
									local17.anObject11 = local470;
								}
							} else {
								throw new Exception("");
							}
						}
					}
				}
				local17.anInt7705 = 1;
			} catch (@Pc(701) ThreadDeath local701) {
				throw local701;
			} catch (@Pc(704) Throwable local704) {
				local17.anInt7705 = 2;
			}
			synchronized (local17) {
				local17.notify();
			}
		}
	}

	@OriginalMember(owner = "loader!hs", name = "d", descriptor = "(I)Z")
	private boolean method6127(@OriginalArg(0) int arg0) {
		if (arg0 > -121) {
			this.method6120(null, null, null, -76, -2);
		}
		return this.aClass271_1 != null;
	}

	@OriginalMember(owner = "loader!hs", name = "a", descriptor = "(II)Lloader!qd;")
	private Class276 method6128(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 != 4479) {
			aString71 = null;
		}
		return this.method6122(null, 0, arg1, 3, arg0 - 4479);
	}

	@OriginalMember(owner = "loader!hs", name = "a", descriptor = "(BLjava/awt/Component;Z)Lloader!qd;")
	private Class276 method6129(@OriginalArg(0) byte arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) boolean arg2) {
		if (arg0 != -33) {
			this.method6122(null, 95, -4, 80, -79);
		}
		return this.method6122(arg1, 0, arg2 ? 1 : 0, 15, 0);
	}

	@OriginalMember(owner = "loader!hs", name = "a", descriptor = "(I)Lloader!qd;")
	private Class276 method6130(@OriginalArg(0) int arg0) {
		return arg0 == 0 ? this.method6122(null, 0, 0, 5, 0) : (Class276) null;
	}
}
