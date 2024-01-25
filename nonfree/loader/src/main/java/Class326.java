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

@OriginalClass("loader!pq")
public final class Class326 implements Runnable {

	@OriginalMember(owner = "loader!pq", name = "e", descriptor = "Ljava/lang/String;")
	private static String aString223;

	@OriginalMember(owner = "loader!pq", name = "d", descriptor = "Ljava/lang/String;")
	private static String aString224;

	@OriginalMember(owner = "loader!pq", name = "r", descriptor = "Ljava/lang/String;")
	private static String aString226;

	@OriginalMember(owner = "loader!pq", name = "c", descriptor = "Ljava/lang/String;")
	private static String aString227;

	@OriginalMember(owner = "loader!pq", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString228;

	@OriginalMember(owner = "loader!pq", name = "v", descriptor = "Ljava/lang/String;")
	public static String aString229;

	@OriginalMember(owner = "loader!pq", name = "b", descriptor = "Ljava/lang/String;")
	private static String aString230;

	@OriginalMember(owner = "loader!pq", name = "w", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod3;

	@OriginalMember(owner = "loader!pq", name = "x", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod4;

	@OriginalMember(owner = "loader!pq", name = "t", descriptor = "I")
	private static final int anInt9616 = 1;

	@OriginalMember(owner = "loader!pq", name = "j", descriptor = "Ljava/util/Hashtable;")
	private static Hashtable aHashtable9 = new Hashtable(16);

	@OriginalMember(owner = "loader!pq", name = "y", descriptor = "J")
	private static volatile long aLong256 = 0L;

	@OriginalMember(owner = "loader!pq", name = "n", descriptor = "Lloader!ch;")
	private Interface21 anInterface21_1;

	@OriginalMember(owner = "loader!pq", name = "f", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3 = null;

	@OriginalMember(owner = "loader!pq", name = "o", descriptor = "Z")
	private boolean aBoolean715 = false;

	@OriginalMember(owner = "loader!pq", name = "g", descriptor = "Lloader!vs;")
	private Class327 aClass327_1 = null;

	@OriginalMember(owner = "loader!pq", name = "u", descriptor = "Lloader!ob;")
	private Class325 aClass325_1 = null;

	@OriginalMember(owner = "loader!pq", name = "m", descriptor = "Lloader!ob;")
	private Class325 aClass325_3 = null;

	@OriginalMember(owner = "loader!pq", name = "k", descriptor = "Lloader!ob;")
	private Class325 aClass325_2 = null;

	@OriginalMember(owner = "loader!pq", name = "z", descriptor = "Lloader!vs;")
	private Class327 aClass327_2 = null;

	@OriginalMember(owner = "loader!pq", name = "p", descriptor = "I")
	private final int anInt9617;

	@OriginalMember(owner = "loader!pq", name = "l", descriptor = "Ljava/lang/String;")
	private final String aString225;

	@OriginalMember(owner = "loader!pq", name = "a", descriptor = "Ljava/awt/EventQueue;")
	private EventQueue anEventQueue2;

	@OriginalMember(owner = "loader!pq", name = "q", descriptor = "[Lloader!ob;")
	private final Class325[] aClass325Array1;

	@OriginalMember(owner = "loader!pq", name = "s", descriptor = "Lloader!a;")
	private Class320 aClass320_1;

	@OriginalMember(owner = "loader!pq", name = "A", descriptor = "Lloader!b;")
	private Class321 aClass321_1;

	@OriginalMember(owner = "loader!pq", name = "i", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread6;

	@OriginalMember(owner = "loader!pq", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;I)Lloader!ob;")
	private static Class325 method8309(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		@Pc(25) String local25;
		if (arg1 == 33) {
			local25 = "jagex_" + arg2 + "_preferences" + arg0 + "_rc.dat";
		} else if (arg1 == 34) {
			local25 = "jagex_" + arg2 + "_preferences" + arg0 + "_wip.dat";
		} else {
			local25 = "jagex_" + arg2 + "_preferences" + arg0 + ".dat";
		}
		@Pc(95) String[] local95 = new String[] { "c:/rscache/", "/rscache/", aString223, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(97) int local97 = 0; local97 < local95.length; local97++) {
			@Pc(105) String local105 = local95[local97];
			if (local105.length() <= 0 || (new File(local105)).exists()) {
				try {
					return new Class325(new File(local105, local25), "rw", 10000L);
				} catch (@Pc(132) Exception local132) {
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "loader!pq", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IZ)Ljava/io/File;")
	private static File method8323(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(4) File local4 = (File) aHashtable9.get(arg0);
		if (local4 != null) {
			return local4;
		}
		@Pc(49) String[] local49 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString223, "/tmp/", "" };
		@Pc(74) String[] local74 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
		for (@Pc(76) int local76 = 0; local76 < 2; local76++) {
			for (@Pc(83) int local83 = 0; local83 < local74.length; local83++) {
				for (@Pc(93) int local93 = 0; local93 < local49.length; local93++) {
					@Pc(131) String local131 = local49[local93] + local74[local83] + "/" + (arg1 == null ? "" : arg1 + "/") + arg0;
					@Pc(133) RandomAccessFile local133 = null;
					try {
						@Pc(138) File local138 = new File(local131);
						if (local76 != 0 || local138.exists()) {
							@Pc(148) String local148 = local49[local93];
							if (local76 != 1 || local148.length() <= 0 || (new File(local148)).exists()) {
								(new File(local49[local93] + local74[local83])).mkdir();
								if (arg1 != null) {
									(new File(local49[local93] + local74[local83] + "/" + arg1)).mkdir();
								}
								local133 = new RandomAccessFile(local138, "rw");
								@Pc(215) int local215 = local133.read();
								local133.seek(0L);
								local133.write(local215);
								local133.seek(0L);
								local133.close();
								aHashtable9.put(arg0, local138);
								return local138;
							}
						}
					} catch (@Pc(234) Exception local234) {
						try {
							if (local133 != null) {
								local133.close();
							}
						} catch (@Pc(244) Exception local244) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "loader!pq", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class326(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		aString228 = "Unknown";
		aString229 = "1.1";
		this.anInt9617 = arg1;
		this.aString225 = arg2;
		this.anApplet3 = arg0;
		try {
			aString228 = System.getProperty("java.vendor");
			aString229 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			aString227 = System.getProperty("os.name");
		} catch (@Pc(48) Exception local48) {
			aString227 = "Unknown";
		}
		aString226 = aString227.toLowerCase();
		try {
			aString230 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(59) Exception local59) {
			aString230 = "";
		}
		try {
			aString224 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(67) Exception local67) {
			aString224 = "";
		}
		try {
			aString223 = System.getProperty("user.home");
			if (aString223 != null) {
				aString223 = aString223 + "/";
			}
		} catch (@Pc(87) Exception local87) {
		}
		if (aString223 == null) {
			aString223 = "~/";
		}
		try {
			this.anEventQueue2 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(98) Throwable local98) {
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
		this.aClass325_2 = new Class325(method8323("random.dat", null, this.anInt9617), "rw", 25L);
		this.aClass325_3 = new Class325(this.method8302("main_file_cache.dat2"), "rw", 209715200L);
		this.aClass325_1 = new Class325(this.method8302("main_file_cache.idx255"), "rw", 1048576L);
		this.aClass325Array1 = new Class325[arg3];
		for (@Pc(194) int local194 = 0; local194 < arg3; local194++) {
			this.aClass325Array1[local194] = new Class325(this.method8302("main_file_cache.idx" + local194), "rw", 1048576L);
		}
		try {
			this.aClass320_1 = new Class320();
		} catch (@Pc(226) Throwable local226) {
		}
		try {
			this.aClass321_1 = new Class321();
		} catch (@Pc(233) Throwable local233) {
		}
		this.aBoolean715 = false;
		this.aThread6 = new Thread(this);
		this.aThread6.setPriority(10);
		this.aThread6.setDaemon(true);
		this.aThread6.start();
	}

	@OriginalMember(owner = "loader!pq", name = "a", descriptor = "(ILjava/lang/String;)Ljava/io/File;")
	public File method8302(@OriginalArg(1) String arg0) {
		return method8323(arg0, this.aString225, this.anInt9617);
	}

	@OriginalMember(owner = "loader!pq", name = "a", descriptor = "(ILjava/net/URL;)Lloader!vs;")
	private Class327 method8303(@OriginalArg(0) int arg0, @OriginalArg(1) URL arg1) {
		return arg0 == 0 ? this.method8329(arg1, 0, 14, 0, 4) : (Class327) null;
	}

	@OriginalMember(owner = "loader!pq", name = "a", descriptor = "(Ljava/lang/String;B)Lloader!vs;")
	private Class327 method8304(@OriginalArg(0) String arg0, @OriginalArg(1) byte arg1) {
		if (arg1 != -44) {
			this.method8325(-11);
		}
		return this.method8329(arg0, 0, arg1 ^ 0xFFFFFFDA, 0, 21);
	}

	@OriginalMember(owner = "loader!pq", name = "a", descriptor = "(ILjava/io/File;[B)Z")
	private boolean method8305(@OriginalArg(0) int arg0, @OriginalArg(1) File arg1, @OriginalArg(2) byte[] arg2) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg1);
			if (arg0 <= 34) {
				this.method8313(false, null, -102);
			}
			local4.write(arg2, 0, arg2.length);
			local4.close();
			return true;
		} catch (@Pc(25) IOException local25) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "loader!pq", name = "a", descriptor = "(BIIII)Lloader!vs;")
	private Class327 method8306(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return arg0 == 73 ? this.method8329(null, arg1 + (arg4 << 16), 14, (arg2 << 16) + arg3, 6) : (Class327) null;
	}

	@OriginalMember(owner = "loader!pq", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;B)Lloader!vs;")
	private Class327 method8307(@OriginalArg(0) String arg0, @OriginalArg(1) Class arg1, @OriginalArg(2) byte arg2) {
		if (arg2 >= -50) {
			this.aClass321_1 = null;
		}
		return this.method8329(new Object[] { arg1, arg0 }, 0, 14, 0, 9);
	}

	@OriginalMember(owner = "loader!pq", name = "b", descriptor = "(ILjava/lang/String;)[B")
	private byte[] method8308(@OriginalArg(1) String arg0) {
		@Pc(15) Class327 local15 = this.method8324(0, 0, 22144, 21, arg0);
		return (byte[]) local15.anObject20;
	}

	@OriginalMember(owner = "loader!pq", name = "a", descriptor = "(B)Lloader!vs;")
	private Class327 method8310(@OriginalArg(0) byte arg0) {
		if (arg0 != -81) {
			this.method8328();
		}
		return this.method8329(null, 0, 14, 0, 5);
	}

	@OriginalMember(owner = "loader!pq", name = "a", descriptor = "(ILjava/awt/datatransfer/Transferable;)Lloader!vs;")
	private Class327 method8311(@OriginalArg(0) int arg0, @OriginalArg(1) Transferable arg1) {
		if (arg0 != 8) {
			aHashtable9 = null;
		}
		return this.method8329(arg1, 0, 14, 0, 19);
	}

	@OriginalMember(owner = "loader!pq", name = "a", descriptor = "(Ljava/lang/String;IZ)Lloader!vs;")
	private Class327 method8312(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (arg1 != -4588) {
			this.aClass325_2 = null;
		}
		return arg2 ? this.method8329(arg0, 0, 14, 0, 12) : this.method8329(arg0, 0, arg1 + 4602, 0, 13);
	}

	@OriginalMember(owner = "loader!pq", name = "a", descriptor = "(ZLjava/awt/Component;I)Lloader!vs;")
	private Class327 method8313(@OriginalArg(0) boolean arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) int arg2) {
		if (arg2 != 0) {
			this.aClass327_2 = null;
		}
		return this.method8329(arg1, arg0 ? 1 : 0, 14, 0, 15);
	}

	@OriginalMember(owner = "loader!pq", name = "a", descriptor = "(Z)V")
	private void method8314(@OriginalArg(0) boolean arg0) {
		synchronized (this) {
			this.aBoolean715 = true;
			this.notifyAll();
		}
		try {
			if (arg0) {
				return;
			}
			this.aThread6.join();
		} catch (@Pc(24) InterruptedException local24) {
		}
		if (this.aClass325_3 != null) {
			try {
				this.aClass325_3.method8300();
			} catch (@Pc(34) IOException local34) {
			}
		}
		if (this.aClass325_1 != null) {
			try {
				this.aClass325_1.method8300();
			} catch (@Pc(44) IOException local44) {
			}
		}
		if (this.aClass325Array1 != null) {
			for (@Pc(49) int local49 = 0; local49 < this.aClass325Array1.length; local49++) {
				if (this.aClass325Array1[local49] != null) {
					try {
						this.aClass325Array1[local49].method8300();
					} catch (@Pc(73) IOException local73) {
					}
				}
			}
		}
		if (this.aClass325_2 != null) {
			try {
				this.aClass325_2.method8300();
			} catch (@Pc(85) IOException local85) {
			}
		}
	}

	@OriginalMember(owner = "loader!pq", name = "a", descriptor = "(BILjava/lang/Runnable;)Lloader!vs;")
	private Class327 method8315(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Runnable arg2) {
		return arg0 >= -83 ? (Class327) null : this.method8329(arg2, arg1, 14, 0, 2);
	}

	@OriginalMember(owner = "loader!pq", name = "c", descriptor = "(I)V")
	private void method8316(@OriginalArg(0) int arg0) {
		if (arg0 < -79) {
			aLong256 = Class324.method8284() + 5000L;
		}
	}

	@OriginalMember(owner = "loader!pq", name = "b", descriptor = "(Ljava/lang/String;B)Lloader!vs;")
	private Class327 method8317(@OriginalArg(0) String arg0, @OriginalArg(1) byte arg1) {
		if (arg1 != 83) {
			this.aClass327_1 = null;
		}
		return this.method8329(arg0, 0, 14, 0, 16);
	}

	@OriginalMember(owner = "loader!pq", name = "a", descriptor = "(Ljava/awt/Frame;I)Lloader!vs;")
	private Class327 method8318(@OriginalArg(0) Frame arg0, @OriginalArg(1) int arg1) {
		if (arg1 > -19) {
			this.method8303(5, null);
		}
		return this.method8329(arg0, 0, 14, 0, 7);
	}

	@OriginalMember(owner = "loader!pq", name = "a", descriptor = "(ILjava/lang/Class;)V")
	private void method8319(@OriginalArg(1) Class arg0) throws Exception {
		@Pc(12) Class[] local12 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
		@Pc(14) Runtime local14 = Runtime.getRuntime();
		@Pc(25) Method local25 = Class.forName("java.lang.reflect.Method").getMethod("setAccessible", Boolean.TYPE);
		@Pc(43) Method local43;
		if (!aString226.startsWith("mac")) {
			local43 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", local12);
			local25.invoke(local43, Boolean.TRUE);
			local43.invoke(local14, arg0, "jawt");
			local25.invoke(local43, Boolean.FALSE);
		}
		local43 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local12);
		local25.invoke(local43, Boolean.TRUE);
		if (!aString226.startsWith("win")) {
			throw new Exception();
		}
		local43.invoke(local14, arg0, this.method8302("sw3d.dll").toString());
		local25.invoke(local43, Boolean.FALSE);
	}

	@OriginalMember(owner = "loader!pq", name = "a", descriptor = "(II)Lloader!vs;")
	private Class327 method8320(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 != 15135) {
			this.aClass325_3 = null;
		}
		return this.method8329(null, arg1, 14, 0, 3);
	}

	@OriginalMember(owner = "loader!pq", name = "b", descriptor = "(I)Lloader!vs;")
	private Class327 method8321(@OriginalArg(0) int arg0) {
		return arg0 > -34 ? (Class327) null : this.method8329(null, 0, 14, 0, 18);
	}

	@OriginalMember(owner = "loader!pq", name = "a", descriptor = "(IIILjava/awt/Component;)Lloader!vs;")
	private Class327 method8322(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Component arg3) {
		@Pc(2) Point local2 = arg3.getLocationOnScreen();
		if (arg2 != 7471) {
			this.aClass327_2 = null;
		}
		return this.method8329(null, arg1 + local2.x, 14, local2.y + arg0, 14);
	}

	@OriginalMember(owner = "loader!pq", name = "a", descriptor = "(IIIILjava/lang/Object;)Lloader!vs;")
	private Class327 method8324(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Object arg4) {
		@Pc(3) Class327 local3 = new Class327();
		synchronized (local3) {
			local3.anObject19 = arg4;
			local3.anInt9618 = arg1;
			local3.anInt9621 = arg3;
			if (arg2 != 22144) {
				return (Class327) null;
			}
			local3.anInt9620 = arg0;
			synchronized (this) {
				if (this.aClass327_2 == null) {
					this.aClass327_2 = this.aClass327_1 = local3;
				} else {
					this.aClass327_2.aClass327_3 = local3;
					this.aClass327_2 = local3;
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

	@OriginalMember(owner = "loader!pq", name = "a", descriptor = "(I)Z")
	private boolean method8325(@OriginalArg(0) int arg0) {
		if (arg0 == 683) {
			return this.aClass320_1 != null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "loader!pq", name = "a", descriptor = "([Ljava/lang/Class;BLjava/lang/String;Ljava/lang/Class;)Lloader!vs;")
	private Class327 method8326(@OriginalArg(0) Class[] arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) String arg2, @OriginalArg(3) Class arg3) {
		if (arg1 != -71) {
			this.method8329(null, -75, -53, -120, 120);
		}
		return this.method8329(new Object[] { arg3, arg2, arg0 }, 0, arg1 + 85, 0, 8);
	}

	@OriginalMember(owner = "loader!pq", name = "a", descriptor = "(ILjava/lang/String;I)Lloader!vs;")
	private Class327 method8327(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		return arg2 == 1 ? this.method8329(arg1, arg0, 14, 0, 1) : (Class327) null;
	}

	@OriginalMember(owner = "loader!pq", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(17) Class327 local17;
			synchronized (this) {
				while (true) {
					if (this.aBoolean715) {
						return;
					}
					if (this.aClass327_1 != null) {
						local17 = this.aClass327_1;
						this.aClass327_1 = this.aClass327_1.aClass327_3;
						if (this.aClass327_1 == null) {
							this.aClass327_2 = null;
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
				@Pc(47) int local47 = local17.anInt9621;
				if (local47 == 1) {
					if (aLong256 > Class324.method8284()) {
						throw new IOException();
					}
					local17.anObject20 = new Socket(InetAddress.getByName((String) local17.anObject19), local17.anInt9618);
				} else if (local47 == 2) {
					@Pc(535) Thread local535 = new Thread((Runnable) local17.anObject19);
					local535.setDaemon(true);
					local535.start();
					local535.setPriority(local17.anInt9618);
					local17.anObject20 = local535;
				} else if (local47 == 4) {
					if (aLong256 > Class324.method8284()) {
						throw new IOException();
					}
					local17.anObject20 = new DataInputStream(((URL) local17.anObject19).openStream());
				} else {
					@Pc(113) Object[] local113;
					if (local47 == 8) {
						local113 = (Object[]) local17.anObject19;
						if (((Class) local113[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local17.anObject20 = ((Class) local113[0]).getDeclaredMethod((String) local113[1], (Class[]) local113[2]);
					} else if (local47 == 9) {
						local113 = (Object[]) local17.anObject19;
						if (((Class) local113[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local17.anObject20 = ((Class) local113[0]).getDeclaredField((String) local113[1]);
					} else if (local47 == 18) {
						@Pc(151) Clipboard local151 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local17.anObject20 = local151.getContents(null);
					} else if (local47 == 19) {
						@Pc(493) Transferable local493 = (Transferable) local17.anObject19;
						@Pc(496) Clipboard local496 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local496.setContents(local493, null);
					} else {
						@Pc(214) String local214;
						if (local47 == 3) {
							if (Class324.method8284() < aLong256) {
								throw new IOException();
							}
							local214 = (local17.anInt9618 >> 24 & 0xFF) + "." + (local17.anInt9618 >> 16 & 0xFF) + "." + (local17.anInt9618 >> 8 & 0xFF) + "." + (local17.anInt9618 & 0xFF);
							local17.anObject20 = InetAddress.getByName(local214).getHostName();
						} else if (local47 == 21) {
							if (Class324.method8284() < aLong256) {
								throw new IOException();
							}
							local17.anObject20 = InetAddress.getByName((String) local17.anObject19).getAddress();
						} else if (local47 == 5) {
							local17.anObject20 = this.aClass320_1.method8269();
						} else if (local47 == 6) {
							@Pc(243) Frame local243 = new Frame("Jagex Full Screen");
							local17.anObject20 = local243;
							local243.setResizable(false);
							this.aClass320_1.method8267(local17.anInt9620 & 0xFFFF, local243, local17.anInt9620 >> 16, local17.anInt9618 >>> 16, local17.anInt9618 & 0xFFFF);
						} else if (local47 == 7) {
							this.aClass320_1.method8266();
						} else {
							@Pc(289) Class325 local289;
							if (local47 == 12) {
								local289 = method8309((String) local17.anObject19, this.anInt9617, this.aString225);
								local17.anObject20 = local289;
							} else if (local47 == 13) {
								local289 = method8309((String) local17.anObject19, this.anInt9617, "");
								local17.anObject20 = local289;
							} else if (local47 == 14) {
								@Pc(302) int local302 = local17.anInt9618;
								@Pc(305) int local305 = local17.anInt9620;
								this.aClass321_1.method8271(local302, local305);
							} else if (local47 == 15) {
								@Pc(324) boolean local324 = local17.anInt9618 != 0;
								@Pc(328) Component local328 = (Component) local17.anObject19;
								this.aClass321_1.method8272(local328, local324);
							} else if (local47 == 17) {
								local113 = (Object[]) local17.anObject19;
								this.aClass321_1.method8270(local17.anInt9620, local17.anInt9618, (Point) local113[2], (int[]) local113[1], (Component) local113[0]);
							} else if (local47 == 16) {
								try {
									if (!aString226.startsWith("win")) {
										throw new Exception();
									}
									local214 = (String) local17.anObject19;
									if (!local214.startsWith("http://") && !local214.startsWith("https://")) {
										throw new Exception();
									}
									@Pc(370) String local370 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
									for (@Pc(372) int local372 = 0; local372 < local214.length(); local372++) {
										if (local370.indexOf(local214.charAt(local372)) == -1) {
											throw new Exception();
										}
									}
									Runtime.getRuntime().exec("cmd /c start \"j\" \"" + local214 + "\"");
									local17.anObject20 = null;
								} catch (@Pc(413) Exception local413) {
									local17.anObject20 = local413;
									throw local413;
								}
							} else {
								throw new Exception("");
							}
						}
					}
				}
				local17.anInt9619 = 1;
			} catch (@Pc(552) ThreadDeath local552) {
				throw local552;
			} catch (@Pc(555) Throwable local555) {
				local17.anInt9619 = 2;
			}
			synchronized (local17) {
				local17.notify();
			}
		}
	}

	@OriginalMember(owner = "loader!pq", name = "d", descriptor = "(I)Lloader!ch;")
	private Interface21 method8328() {
		return this.anInterface21_1;
	}

	@OriginalMember(owner = "loader!pq", name = "a", descriptor = "(Ljava/lang/Object;IIII)Lloader!vs;")
	private Class327 method8329(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(3) Class327 local3 = new Class327();
		local3.anInt9621 = arg4;
		local3.anInt9618 = arg1;
		local3.anInt9620 = arg3;
		if (arg2 != 14) {
			aString229 = null;
		}
		local3.anObject19 = arg0;
		synchronized (this) {
			if (this.aClass327_2 == null) {
				this.aClass327_2 = this.aClass327_1 = local3;
			} else {
				this.aClass327_2.aClass327_3 = local3;
				this.aClass327_2 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "loader!pq", name = "a", descriptor = "(IILjava/awt/Component;Ljava/awt/Point;I[I)Lloader!vs;")
	private Class327 method8330(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Component arg2, @OriginalArg(3) Point arg3, @OriginalArg(5) int[] arg4) {
		return this.method8329(new Object[] { arg2, arg4, arg3 }, arg1, 14, arg0, 17);
	}
}
