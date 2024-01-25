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

@OriginalClass("loader!dr")
public final class Class272 implements Runnable {

	@OriginalMember(owner = "loader!dr", name = "f", descriptor = "Ljava/lang/String;")
	private static String aString69;

	@OriginalMember(owner = "loader!dr", name = "m", descriptor = "Ljava/lang/String;")
	private static String aString70;

	@OriginalMember(owner = "loader!dr", name = "b", descriptor = "Ljava/lang/String;")
	private static String aString71;

	@OriginalMember(owner = "loader!dr", name = "u", descriptor = "Ljava/lang/String;")
	public static String aString72;

	@OriginalMember(owner = "loader!dr", name = "e", descriptor = "Ljava/lang/String;")
	private static String aString73;

	@OriginalMember(owner = "loader!dr", name = "s", descriptor = "Ljava/lang/String;")
	public static String aString74;

	@OriginalMember(owner = "loader!dr", name = "o", descriptor = "Ljava/lang/String;")
	private static String aString75;

	@OriginalMember(owner = "loader!dr", name = "y", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod3;

	@OriginalMember(owner = "loader!dr", name = "w", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod4;

	@OriginalMember(owner = "loader!dr", name = "j", descriptor = "I")
	private static final int anInt7457 = 1;

	@OriginalMember(owner = "loader!dr", name = "h", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable3 = new Hashtable(16);

	@OriginalMember(owner = "loader!dr", name = "x", descriptor = "J")
	private static volatile long aLong230 = 0L;

	@OriginalMember(owner = "loader!dr", name = "A", descriptor = "Lloader!hp;")
	private Interface14 anInterface14_1;

	@OriginalMember(owner = "loader!dr", name = "r", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2 = null;

	@OriginalMember(owner = "loader!dr", name = "k", descriptor = "Lloader!jv;")
	private Class277 aClass277_1 = null;

	@OriginalMember(owner = "loader!dr", name = "p", descriptor = "Lloader!jv;")
	private Class277 aClass277_2 = null;

	@OriginalMember(owner = "loader!dr", name = "c", descriptor = "Lloader!gq;")
	private Class276 aClass276_3 = null;

	@OriginalMember(owner = "loader!dr", name = "i", descriptor = "Z")
	private boolean aBoolean490 = false;

	@OriginalMember(owner = "loader!dr", name = "n", descriptor = "Lloader!gq;")
	private Class276 aClass276_1 = null;

	@OriginalMember(owner = "loader!dr", name = "g", descriptor = "Lloader!gq;")
	private Class276 aClass276_2 = null;

	@OriginalMember(owner = "loader!dr", name = "a", descriptor = "Ljava/lang/String;")
	private String aString68;

	@OriginalMember(owner = "loader!dr", name = "d", descriptor = "I")
	private final int anInt7456;

	@OriginalMember(owner = "loader!dr", name = "l", descriptor = "Ljava/awt/EventQueue;")
	private EventQueue anEventQueue2;

	@OriginalMember(owner = "loader!dr", name = "v", descriptor = "[Lloader!gq;")
	private final Class276[] aClass276Array1;

	@OriginalMember(owner = "loader!dr", name = "q", descriptor = "Lloader!c;")
	private Class271 aClass271_1;

	@OriginalMember(owner = "loader!dr", name = "t", descriptor = "Lloader!f;")
	private Class274 aClass274_1;

	@OriginalMember(owner = "loader!dr", name = "z", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread4;

	@OriginalMember(owner = "loader!dr", name = "a", descriptor = "(BILjava/lang/String;Ljava/lang/String;)Ljava/io/File;")
	private static File method5885(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		@Pc(10) File local10 = (File) aHashtable3.get(arg1);
		if (local10 != null) {
			return local10;
		}
		@Pc(50) String[] local50 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString69, "/tmp/", "" };
		@Pc(75) String[] local75 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
		for (@Pc(77) int local77 = 0; local77 < 2; local77++) {
			for (@Pc(84) int local84 = 0; local84 < local75.length; local84++) {
				for (@Pc(90) int local90 = 0; local90 < local50.length; local90++) {
					@Pc(124) String local124 = local50[local90] + local75[local84] + "/" + (arg2 == null ? "" : arg2 + "/") + arg1;
					@Pc(126) RandomAccessFile local126 = null;
					try {
						@Pc(131) File local131 = new File(local124);
						if (local77 != 0 || local131.exists()) {
							@Pc(143) String local143 = local50[local90];
							if (local77 != 1 || local143.length() <= 0 || (new File(local143)).exists()) {
								(new File(local50[local90] + local75[local84])).mkdir();
								if (arg2 != null) {
									(new File(local50[local90] + local75[local84] + "/" + arg2)).mkdir();
								}
								local126 = new RandomAccessFile(local131, "rw");
								@Pc(208) int local208 = local126.read();
								local126.seek(0L);
								local126.write(local208);
								local126.seek(0L);
								local126.close();
								aHashtable3.put(arg1, local131);
								return local131;
							}
						}
					} catch (@Pc(227) Exception local227) {
						try {
							if (local126 != null) {
								local126.close();
							}
						} catch (@Pc(237) Exception local237) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "loader!dr", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;)Lloader!gq;")
	private static Class276 method5889(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2) {
		@Pc(17) String local17;
		if (arg1 == 33) {
			local17 = "jagex_" + arg0 + "_preferences" + arg2 + "_rc.dat";
		} else if (arg1 == 34) {
			local17 = "jagex_" + arg0 + "_preferences" + arg2 + "_wip.dat";
		} else {
			local17 = "jagex_" + arg0 + "_preferences" + arg2 + ".dat";
		}
		@Pc(87) String[] local87 = new String[] { "c:/rscache/", "/rscache/", aString69, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(95) int local95 = 0; local95 < local87.length; local95++) {
			@Pc(107) String local107 = local87[local95];
			if (local107.length() <= 0 || (new File(local107)).exists()) {
				try {
					return new Class276(new File(local107, local17), "rw", 10000L);
				} catch (@Pc(131) Exception local131) {
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "loader!dr", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class272(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		this.aString68 = arg2;
		aString74 = "Unknown";
		this.anApplet2 = arg0;
		aString72 = "1.1";
		this.anInt7456 = arg1;
		try {
			aString74 = System.getProperty("java.vendor");
			aString72 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			aString71 = System.getProperty("os.name");
		} catch (@Pc(48) Exception local48) {
			aString71 = "Unknown";
		}
		aString70 = aString71.toLowerCase();
		try {
			aString73 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(59) Exception local59) {
			aString73 = "";
		}
		try {
			aString75 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(67) Exception local67) {
			aString75 = "";
		}
		try {
			aString69 = System.getProperty("user.home");
			if (aString69 != null) {
				aString69 = aString69 + "/";
			}
		} catch (@Pc(86) Exception local86) {
		}
		if (aString69 == null) {
			aString69 = "~/";
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
		this.aClass276_1 = new Class276(method5885(this.anInt7456, "random.dat", null), "rw", 25L);
		this.aClass276_3 = new Class276(this.method5892("main_file_cache.dat2"), "rw", 209715200L);
		this.aClass276_2 = new Class276(this.method5892("main_file_cache.idx255"), "rw", 1048576L);
		this.aClass276Array1 = new Class276[arg3];
		for (@Pc(193) int local193 = 0; local193 < arg3; local193++) {
			this.aClass276Array1[local193] = new Class276(this.method5892("main_file_cache.idx" + local193), "rw", 1048576L);
		}
		try {
			this.aClass271_1 = new Class271();
		} catch (@Pc(225) Throwable local225) {
		}
		try {
			this.aClass274_1 = new Class274();
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
		this.aBoolean490 = false;
		this.aThread4 = new Thread(this);
		this.aThread4.setPriority(10);
		this.aThread4.setDaemon(true);
		this.aThread4.start();
	}

	@OriginalMember(owner = "loader!dr", name = "a", descriptor = "(BLjava/lang/Class;Ljava/lang/String;)Lloader!jv;")
	private Class277 method5883(@OriginalArg(0) byte arg0, @OriginalArg(1) Class arg1, @OriginalArg(2) String arg2) {
		return arg0 == -107 ? this.method5912(9, 0, arg0 + 123, new Object[] { arg1, arg2 }, 0) : (Class277) null;
	}

	@OriginalMember(owner = "loader!dr", name = "a", descriptor = "(Ljava/awt/Frame;I)Lloader!jv;")
	private Class277 method5884(@OriginalArg(0) Frame arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 28944) {
			this.aClass274_1 = null;
		}
		return this.method5912(7, 0, 16, arg0, 0);
	}

	@OriginalMember(owner = "loader!dr", name = "a", descriptor = "(ZLjava/awt/Component;I)Lloader!jv;")
	private Class277 method5886(@OriginalArg(0) boolean arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) int arg2) {
		if (arg2 != 0) {
			this.method5905(-118, null);
		}
		return this.method5912(15, arg0 ? 1 : 0, 16, arg1, 0);
	}

	@OriginalMember(owner = "loader!dr", name = "a", descriptor = "(ILjava/lang/Class;)Lloader!jv;")
	private Class277 method5887(@OriginalArg(0) int arg0, @OriginalArg(1) Class arg1) {
		if (arg0 != -6986) {
			this.aString68 = null;
		}
		return this.method5912(20, 0, arg0 ^ 0xFFFFE4A6, arg1, 0);
	}

	@OriginalMember(owner = "loader!dr", name = "a", descriptor = "([IILjava/awt/Point;BLjava/awt/Component;I)Lloader!jv;")
	private Class277 method5888(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Point arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) Component arg4, @OriginalArg(5) int arg5) {
		if (arg3 >= -18) {
			this.method5906();
		}
		return this.method5912(17, arg1, 16, new Object[] { arg4, arg0, arg2 }, arg5);
	}

	@OriginalMember(owner = "loader!dr", name = "a", descriptor = "(IIIII)Lloader!jv;")
	private Class277 method5890(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return arg1 <= 100 ? (Class277) null : this.method5912(6, (arg2 << 16) + arg0, 16, null, arg4 + (arg3 << 16));
	}

	@OriginalMember(owner = "loader!dr", name = "a", descriptor = "(Ljava/lang/String;B)Lloader!jv;")
	private Class277 method5891(@OriginalArg(0) String arg0) {
		return this.method5912(16, 0, 16, arg0, 0);
	}

	@OriginalMember(owner = "loader!dr", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/io/File;")
	public File method5892(@OriginalArg(0) String arg0) {
		return method5885(this.anInt7456, arg0, this.aString68);
	}

	@OriginalMember(owner = "loader!dr", name = "b", descriptor = "(ILjava/lang/String;)[B")
	private byte[] method5893(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (arg0 != -1) {
			this.method5898(null, 6, 33, 58);
		}
		@Pc(18) Class277 local18 = this.method5903(21, arg1, 0, 0, false);
		return (byte[]) local18.anObject11;
	}

	@OriginalMember(owner = "loader!dr", name = "a", descriptor = "(Ljava/awt/datatransfer/Transferable;B)Lloader!jv;")
	private Class277 method5894(@OriginalArg(0) Transferable arg0, @OriginalArg(1) byte arg1) {
		return arg1 < 108 ? (Class277) null : this.method5912(19, 0, 16, arg0, 0);
	}

	@OriginalMember(owner = "loader!dr", name = "b", descriptor = "(I)Z")
	private boolean method5895(@OriginalArg(0) int arg0) {
		if (arg0 != 25859) {
			this.run();
		}
		return this.aClass271_1 != null;
	}

	@OriginalMember(owner = "loader!dr", name = "a", descriptor = "(Ljava/lang/Runnable;II)Lloader!jv;")
	private Class277 method5896(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return arg2 == 0 ? this.method5912(2, arg1, arg2 + 16, arg0, 0) : (Class277) null;
	}

	@OriginalMember(owner = "loader!dr", name = "a", descriptor = "(B)V")
	private void method5897() {
		synchronized (this) {
			this.aBoolean490 = true;
			this.notifyAll();
		}
		try {
			this.aThread4.join();
		} catch (@Pc(21) InterruptedException local21) {
		}
		if (this.aClass276_3 != null) {
			try {
				this.aClass276_3.method5917();
			} catch (@Pc(30) IOException local30) {
			}
		}
		if (this.aClass276_2 != null) {
			try {
				this.aClass276_2.method5917();
			} catch (@Pc(40) IOException local40) {
			}
		}
		if (this.aClass276Array1 != null) {
			for (@Pc(54) int local54 = 0; local54 < this.aClass276Array1.length; local54++) {
				if (this.aClass276Array1[local54] != null) {
					try {
						this.aClass276Array1[local54].method5917();
					} catch (@Pc(73) IOException local73) {
					}
				}
			}
		}
		if (this.aClass276_1 != null) {
			try {
				this.aClass276_1.method5917();
			} catch (@Pc(85) IOException local85) {
			}
		}
	}

	@OriginalMember(owner = "loader!dr", name = "a", descriptor = "(Ljava/awt/Component;III)Lloader!jv;")
	private Class277 method5898(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) Point local2 = arg0.getLocationOnScreen();
		if (arg3 != 10000) {
			this.method5903(24, null, -53, -85, true);
		}
		return this.method5912(14, arg1 + local2.x, 16, null, arg2 + local2.y);
	}

	@OriginalMember(owner = "loader!dr", name = "a", descriptor = "(BI)Lloader!jv;")
	private Class277 method5899(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		if (arg0 != 28) {
			this.aClass277_1 = null;
		}
		return this.method5912(3, arg1, 16, null, 0);
	}

	@OriginalMember(owner = "loader!dr", name = "a", descriptor = "(Ljava/lang/Class;B)Lloader!jv;")
	private Class277 method5900(@OriginalArg(0) Class arg0) {
		return this.method5912(11, 0, 16, arg0, 0);
	}

	@OriginalMember(owner = "loader!dr", name = "a", descriptor = "(BLjava/lang/String;)Lloader!jv;")
	private Class277 method5901(@OriginalArg(0) byte arg0, @OriginalArg(1) String arg1) {
		return arg0 == 29 ? this.method5912(21, 0, 16, arg1, 0) : (Class277) null;
	}

	@OriginalMember(owner = "loader!dr", name = "d", descriptor = "(B)Lloader!hp;")
	private Interface14 method5902() {
		return this.anInterface14_1;
	}

	@OriginalMember(owner = "loader!dr", name = "a", descriptor = "(ILjava/lang/Object;IIZ)Lloader!jv;")
	private Class277 method5903(@OriginalArg(0) int arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(3) Class277 local3 = new Class277();
		synchronized (local3) {
			local3.anInt7463 = arg3;
			if (arg4) {
				aString70 = null;
			}
			local3.anObject12 = arg1;
			local3.anInt7462 = arg0;
			local3.anInt7461 = arg2;
			synchronized (this) {
				if (this.aClass277_1 == null) {
					this.aClass277_1 = this.aClass277_2 = local3;
				} else {
					this.aClass277_1.aClass277_3 = local3;
					this.aClass277_1 = local3;
				}
				this.notify();
			}
			try {
				local3.wait();
			} catch (@Pc(59) InterruptedException local59) {
			}
			return local3;
		}
	}

	@OriginalMember(owner = "loader!dr", name = "a", descriptor = "(IZLjava/lang/String;)Lloader!jv;")
	private Class277 method5904(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) String arg2) {
		if (arg1) {
			aMethod3 = null;
		}
		return this.method5912(1, arg0, 16, arg2, 0);
	}

	@OriginalMember(owner = "loader!dr", name = "a", descriptor = "(ILjava/lang/String;)Lloader!jv;")
	private Class277 method5905(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		return arg0 == -29744 ? this.method5912(12, 0, arg0 + 29760, arg1, 0) : (Class277) null;
	}

	@OriginalMember(owner = "loader!dr", name = "c", descriptor = "(B)Lloader!jv;")
	private Class277 method5906() {
		return this.method5912(18, 0, 16, null, 0);
	}

	@OriginalMember(owner = "loader!dr", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Class;[Ljava/lang/Class;)Lloader!jv;")
	private Class277 method5907(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Class arg2, @OriginalArg(3) Class[] arg3) {
		if (arg0 != 8) {
			this.method5908(20);
		}
		return this.method5912(8, 0, 16, new Object[] { arg2, arg1, arg3 }, 0);
	}

	@OriginalMember(owner = "loader!dr", name = "a", descriptor = "(I)Lloader!jv;")
	private Class277 method5908(@OriginalArg(0) int arg0) {
		return arg0 == 1 ? this.method5912(5, 0, arg0 ^ 0x11, null, 0) : (Class277) null;
	}

	@OriginalMember(owner = "loader!dr", name = "b", descriptor = "(B)V")
	private void method5909() {
		aLong230 = Class270.method5875() + 5000L;
	}

	@OriginalMember(owner = "loader!dr", name = "a", descriptor = "(Ljava/lang/Class;Z)V")
	private void method5910(@OriginalArg(0) Class arg0, @OriginalArg(1) boolean arg1) throws Exception {
		@Pc(12) Class[] local12 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
		@Pc(14) Runtime local14 = Runtime.getRuntime();
		@Pc(25) Method local25 = Class.forName("java.lang.reflect.Method").getMethod("setAccessible", Boolean.TYPE);
		if (arg1) {
			this.method5891(null);
		}
		@Pc(43) Method local43;
		if (!aString70.startsWith("mac")) {
			local43 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", local12);
			local25.invoke(local43, Boolean.TRUE);
			local43.invoke(local14, arg0, "jawt");
			local25.invoke(local43, Boolean.FALSE);
		}
		local43 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local12);
		local25.invoke(local43, Boolean.TRUE);
		if (!aString70.startsWith("win")) {
			throw new Exception();
		}
		local43.invoke(local14, arg0, this.method5892("sw3d.dll").toString());
		local25.invoke(local43, Boolean.FALSE);
	}

	@OriginalMember(owner = "loader!dr", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(16) Class277 local16;
			synchronized (this) {
				while (true) {
					if (this.aBoolean490) {
						return;
					}
					if (this.aClass277_2 != null) {
						local16 = this.aClass277_2;
						this.aClass277_2 = this.aClass277_2.aClass277_3;
						if (this.aClass277_2 == null) {
							this.aClass277_1 = null;
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
				@Pc(45) int local45 = local16.anInt7462;
				if (local45 == 1) {
					if (aLong230 > Class270.method5875()) {
						throw new IOException();
					}
					local16.anObject11 = new Socket(InetAddress.getByName((String) local16.anObject12), local16.anInt7463);
				} else if (local45 == 2) {
					@Pc(663) Thread local663 = new Thread((Runnable) local16.anObject12);
					local663.setDaemon(true);
					local663.start();
					local663.setPriority(local16.anInt7463);
					local16.anObject11 = local663;
				} else if (local45 == 4) {
					if (Class270.method5875() < aLong230) {
						throw new IOException();
					}
					local16.anObject11 = new DataInputStream(((URL) local16.anObject12).openStream());
				} else {
					@Pc(90) Object[] local90;
					if (local45 == 8) {
						local90 = (Object[]) local16.anObject12;
						if (((Class) local90[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local16.anObject11 = ((Class) local90[0]).getDeclaredMethod((String) local90[1], (Class[]) local90[2]);
					} else if (local45 == 9) {
						local90 = (Object[]) local16.anObject12;
						if (((Class) local90[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local16.anObject11 = ((Class) local90[0]).getDeclaredField((String) local90[1]);
					} else if (local45 == 18) {
						@Pc(603) Clipboard local603 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local16.anObject11 = local603.getContents(null);
					} else if (local45 == 19) {
						@Pc(592) Transferable local592 = (Transferable) local16.anObject12;
						@Pc(595) Clipboard local595 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local595.setContents(local592, null);
					} else {
						@Pc(177) String local177;
						if (local45 == 3) {
							if (aLong230 > Class270.method5875()) {
								throw new IOException();
							}
							local177 = (local16.anInt7463 >> 24 & 0xFF) + "." + (local16.anInt7463 >> 16 & 0xFF) + "." + (local16.anInt7463 >> 8 & 0xFF) + "." + (local16.anInt7463 & 0xFF);
							local16.anObject11 = InetAddress.getByName(local177).getHostName();
						} else if (local45 == 21) {
							if (Class270.method5875() < aLong230) {
								throw new IOException();
							}
							local16.anObject11 = InetAddress.getByName((String) local16.anObject12).getAddress();
						} else if (local45 == 5) {
							local16.anObject11 = this.aClass271_1.method5876();
						} else if (local45 == 6) {
							@Pc(553) Frame local553 = new Frame("Jagex Full Screen");
							local16.anObject11 = local553;
							local553.setResizable(false);
							this.aClass271_1.method5877(local16.anInt7461 & 0xFFFF, local553, local16.anInt7463 & 0xFFFF, local16.anInt7461 >> 16, local16.anInt7463 >>> 16);
						} else if (local45 == 7) {
							this.aClass271_1.method5879();
						} else {
							@Pc(237) int local237;
							if (local45 == 11) {
								@Pc(224) Field local224 = Class.forName("java.lang.ClassLoader").getDeclaredField("nativeLibraries");
								local224.setAccessible(true);
								@Pc(235) Vector local235 = (Vector) local224.get(((Class) local16.anObject12).getClassLoader());
								for (local237 = 0; local235.size() > local237; local237++) {
									@Pc(245) Object local245 = local235.elementAt(local237);
									@Pc(252) Method local252 = local245.getClass().getDeclaredMethod("finalize");
									local252.setAccessible(true);
									local252.invoke(local245);
									local252.setAccessible(false);
									@Pc(269) Field local269 = local245.getClass().getDeclaredField("handle");
									local269.setAccessible(true);
									local269.set(local245, Integer.valueOf(0));
									local269.setAccessible(false);
								}
								local224.setAccessible(false);
							} else if (local45 == 12) {
								@Pc(301) Class276 local301 = method5889(this.aString68, this.anInt7456, (String) local16.anObject12);
								local16.anObject11 = local301;
							} else if (local45 == 14) {
								@Pc(311) int local311 = local16.anInt7463;
								@Pc(314) int local314 = local16.anInt7461;
								this.aClass274_1.method5913(local311, local314);
							} else if (local45 == 15) {
								@Pc(334) boolean local334 = local16.anInt7463 != 0;
								@Pc(338) Component local338 = (Component) local16.anObject12;
								this.aClass274_1.method5914(local334, local338);
							} else if (local45 == 17) {
								local90 = (Object[]) local16.anObject12;
								this.aClass274_1.method5915((Component) local90[0], (Point) local90[2], local16.anInt7461, local16.anInt7463, (int[]) local90[1]);
							} else if (local45 == 16) {
								try {
									if (!aString70.startsWith("win")) {
										throw new Exception();
									}
									local177 = (String) local16.anObject12;
									if (!local177.startsWith("http://") && !local177.startsWith("https://")) {
										throw new Exception();
									}
									@Pc(406) String local406 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
									for (local237 = 0; local237 < local177.length(); local237++) {
										if (local406.indexOf(local177.charAt(local237)) == -1) {
											throw new Exception();
										}
									}
									Runtime.getRuntime().exec("cmd /c start \"j\" \"" + local177 + "\"");
									local16.anObject11 = null;
								} catch (@Pc(445) Exception local445) {
									local16.anObject11 = local445;
									throw local445;
								}
							} else if (local45 == 20) {
								try {
									@Pc(466) Class[] local466 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
									@Pc(468) Runtime local468 = Runtime.getRuntime();
									@Pc(474) Method local474 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local466);
									local474.setAccessible(true);
									if (aString70.startsWith("win")) {
										if (aString73.startsWith("amd64") || aString73.startsWith("x86_64")) {
											local474.invoke(local468, local16.anObject12, this.method5892("jagmisc64.dll").toString());
										} else {
											local474.invoke(local468, local16.anObject12, this.method5892("jagmisc.dll").toString());
										}
									}
									local474.setAccessible(false);
								} catch (@Pc(534) Throwable local534) {
									local16.anObject11 = local534;
								}
							} else {
								throw new Exception("");
							}
						}
					}
				}
				local16.anInt7460 = 1;
			} catch (@Pc(680) ThreadDeath local680) {
				throw local680;
			} catch (@Pc(683) Throwable local683) {
				local16.anInt7460 = 2;
			}
			synchronized (local16) {
				local16.notify();
			}
		}
	}

	@OriginalMember(owner = "loader!dr", name = "a", descriptor = "(BLjava/net/URL;)Lloader!jv;")
	private Class277 method5911(@OriginalArg(1) URL arg0) {
		return this.method5912(4, 0, 16, arg0, 0);
	}

	@OriginalMember(owner = "loader!dr", name = "a", descriptor = "(IIILjava/lang/Object;I)Lloader!jv;")
	private Class277 method5912(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Object arg3, @OriginalArg(4) int arg4) {
		if (arg2 != 16) {
			return (Class277) null;
		}
		@Pc(9) Class277 local9 = new Class277();
		local9.anInt7462 = arg0;
		local9.anInt7463 = arg1;
		local9.anObject12 = arg3;
		local9.anInt7461 = arg4;
		synchronized (this) {
			if (this.aClass277_1 == null) {
				this.aClass277_1 = this.aClass277_2 = local9;
			} else {
				this.aClass277_1.aClass277_3 = local9;
				this.aClass277_1 = local9;
			}
			this.notify();
			return local9;
		}
	}
}
