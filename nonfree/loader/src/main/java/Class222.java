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

@OriginalClass("loader!bd")
public final class Class222 implements Runnable {

	@OriginalMember(owner = "loader!bd", name = "l", descriptor = "Ljava/lang/String;")
	private static String aString439;

	@OriginalMember(owner = "loader!bd", name = "e", descriptor = "Ljava/lang/String;")
	private static String aString440;

	@OriginalMember(owner = "loader!bd", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString441;

	@OriginalMember(owner = "loader!bd", name = "p", descriptor = "Ljava/lang/String;")
	private static String aString442;

	@OriginalMember(owner = "loader!bd", name = "b", descriptor = "Ljava/lang/String;")
	private static String aString443;

	@OriginalMember(owner = "loader!bd", name = "x", descriptor = "Ljava/lang/String;")
	private static String aString444;

	@OriginalMember(owner = "loader!bd", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString445;

	@OriginalMember(owner = "loader!bd", name = "r", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod3;

	@OriginalMember(owner = "loader!bd", name = "t", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod4;

	@OriginalMember(owner = "loader!bd", name = "a", descriptor = "I")
	private static final int anInt6704 = 1;

	@OriginalMember(owner = "loader!bd", name = "c", descriptor = "Ljava/util/Hashtable;")
	private static Hashtable aHashtable1 = new Hashtable(16);

	@OriginalMember(owner = "loader!bd", name = "v", descriptor = "J")
	private static volatile long aLong233 = 0L;

	@OriginalMember(owner = "loader!bd", name = "s", descriptor = "Lloader!ro;")
	private Interface11 anInterface11_1;

	@OriginalMember(owner = "loader!bd", name = "u", descriptor = "Lloader!vk;")
	private Class228 aClass228_1 = null;

	@OriginalMember(owner = "loader!bd", name = "o", descriptor = "Lloader!vk;")
	private Class228 aClass228_2 = null;

	@OriginalMember(owner = "loader!bd", name = "n", descriptor = "Lloader!id;")
	private Class226 aClass226_1 = null;

	@OriginalMember(owner = "loader!bd", name = "f", descriptor = "Lloader!vk;")
	private Class228 aClass228_3 = null;

	@OriginalMember(owner = "loader!bd", name = "y", descriptor = "Z")
	private boolean aBoolean496 = false;

	@OriginalMember(owner = "loader!bd", name = "i", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2 = null;

	@OriginalMember(owner = "loader!bd", name = "A", descriptor = "Lloader!id;")
	private Class226 aClass226_2 = null;

	@OriginalMember(owner = "loader!bd", name = "q", descriptor = "I")
	private final int anInt6703;

	@OriginalMember(owner = "loader!bd", name = "z", descriptor = "Ljava/lang/String;")
	private String aString446;

	@OriginalMember(owner = "loader!bd", name = "g", descriptor = "Ljava/awt/EventQueue;")
	private EventQueue anEventQueue2;

	@OriginalMember(owner = "loader!bd", name = "k", descriptor = "[Lloader!vk;")
	private Class228[] aClass228Array1;

	@OriginalMember(owner = "loader!bd", name = "w", descriptor = "Lloader!d;")
	private Class224 aClass224_1;

	@OriginalMember(owner = "loader!bd", name = "d", descriptor = "Lloader!c;")
	private Class223 aClass223_1;

	@OriginalMember(owner = "loader!bd", name = "h", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread4;

	@OriginalMember(owner = "loader!bd", name = "a", descriptor = "(BILjava/lang/String;)Lloader!vk;")
	private static Class228 method5724(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		@Pc(15) String local15;
		if (arg0 == 33) {
			local15 = "jagex_" + arg1 + "_preferences_rc.dat";
		} else if (arg0 == 34) {
			local15 = "jagex_" + arg1 + "_preferences_wip.dat";
		} else {
			local15 = "jagex_" + arg1 + "_preferences.dat";
		}
		@Pc(79) String[] local79 = new String[] { "c:/rscache/", "/rscache/", aString444, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(81) int local81 = 0; local81 < local79.length; local81++) {
			@Pc(89) String local89 = local79[local81];
			if (local89.length() <= 0 || (new File(local89)).exists()) {
				try {
					return new Class228(new File(local89, local15), "rw", 10000L);
				} catch (@Pc(115) Exception local115) {
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "loader!bd", name = "a", descriptor = "(IILjava/lang/String;)Lloader!vk;")
	private static Class228 method5731(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		@Pc(13) String local13;
		if (arg0 == 33) {
			local13 = "jagex_" + arg1 + "_preferences2_rc.dat";
		} else if (arg0 == 34) {
			local13 = "jagex_" + arg1 + "_preferences2_wip.dat";
		} else {
			local13 = "jagex_" + arg1 + "_preferences2.dat";
		}
		@Pc(75) String[] local75 = new String[] { "c:/rscache/", "/rscache/", aString444, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(83) int local83 = 0; local83 < local75.length; local83++) {
			@Pc(91) String local91 = local75[local83];
			if (local91.length() <= 0 || (new File(local91)).exists()) {
				try {
					return new Class228(new File(local91, local13), "rw", 10000L);
				} catch (@Pc(116) Exception local116) {
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "loader!bd", name = "a", descriptor = "(Ljava/lang/String;BILjava/lang/String;)Ljava/io/File;")
	private static File method5748(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		@Pc(4) File local4 = (File) aHashtable1.get(arg0);
		if (local4 != null) {
			return local4;
		}
		@Pc(44) String[] local44 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString444, "/tmp/", "" };
		@Pc(75) String[] local75 = new String[] { ".jagex_cache_" + arg1, ".file_store_" + arg1 };
		for (@Pc(77) int local77 = 0; local77 < 2; local77++) {
			for (@Pc(84) int local84 = 0; local84 < local75.length; local84++) {
				for (@Pc(94) int local94 = 0; local94 < local44.length; local94++) {
					@Pc(129) String local129 = local44[local94] + local75[local84] + "/" + (arg2 == null ? "" : arg2 + "/") + arg0;
					@Pc(131) RandomAccessFile local131 = null;
					try {
						@Pc(136) File local136 = new File(local129);
						if (local77 != 0 || local136.exists()) {
							@Pc(146) String local146 = local44[local94];
							if (local77 != 1 || local146.length() <= 0 || (new File(local146)).exists()) {
								(new File(local44[local94] + local75[local84])).mkdir();
								if (arg2 != null) {
									(new File(local44[local94] + local75[local84] + "/" + arg2)).mkdir();
								}
								local131 = new RandomAccessFile(local136, "rw");
								@Pc(215) int local215 = local131.read();
								local131.seek(0L);
								local131.write(local215);
								local131.seek(0L);
								local131.close();
								aHashtable1.put(arg0, local136);
								return local136;
							}
						}
					} catch (@Pc(234) Exception local234) {
						try {
							if (local131 != null) {
								local131.close();
							}
						} catch (@Pc(244) Exception local244) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "loader!bd", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class222(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		aString445 = "1.1";
		this.anInt6703 = arg1;
		aString441 = "Unknown";
		this.anApplet2 = arg0;
		this.aString446 = arg2;
		try {
			aString441 = System.getProperty("java.vendor");
			aString445 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			aString443 = System.getProperty("os.name");
		} catch (@Pc(48) Exception local48) {
			aString443 = "Unknown";
		}
		aString440 = aString443.toLowerCase();
		try {
			aString439 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(59) Exception local59) {
			aString439 = "";
		}
		try {
			aString442 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(67) Exception local67) {
			aString442 = "";
		}
		try {
			aString444 = System.getProperty("user.home");
			if (aString444 != null) {
				aString444 = aString444 + "/";
			}
		} catch (@Pc(86) Exception local86) {
		}
		if (aString444 == null) {
			aString444 = "~/";
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
		} catch (@Pc(152) Exception local152) {
		}
		this.aClass228_1 = new Class228(method5748("random.dat", this.anInt6703, null), "rw", 25L);
		this.aClass228_2 = new Class228(this.method5726("main_file_cache.dat2"), "rw", 209715200L);
		this.aClass228_3 = new Class228(this.method5726("main_file_cache.idx255"), "rw", 1048576L);
		this.aClass228Array1 = new Class228[arg3];
		for (@Pc(193) int local193 = 0; local193 < arg3; local193++) {
			this.aClass228Array1[local193] = new Class228(this.method5726("main_file_cache.idx" + local193), "rw", 1048576L);
		}
		try {
			this.aClass224_1 = new Class224();
		} catch (@Pc(225) Throwable local225) {
		}
		try {
			this.aClass223_1 = new Class223();
		} catch (@Pc(232) Throwable local232) {
		}
		@Pc(235) ThreadGroup local235 = Thread.currentThread().getThreadGroup();
		for (@Pc(238) ThreadGroup local238 = local235.getParent(); local238 != null; local238 = local238.getParent()) {
			local235 = local238;
		}
		@Pc(250) Thread[] local250 = new Thread[1000];
		local235.enumerate(local250);
		for (@Pc(256) int local256 = 0; local256 < local250.length; local256++) {
			if (local250[local256] != null && local250[local256].getName().startsWith("AWT")) {
				local250[local256].setPriority(1);
			}
		}
		this.aBoolean496 = false;
		this.aThread4 = new Thread(this);
		this.aThread4.setPriority(10);
		this.aThread4.setDaemon(true);
		this.aThread4.start();
	}

	@OriginalMember(owner = "loader!bd", name = "a", descriptor = "(IILjava/lang/Runnable;)Lloader!id;")
	private Class226 method5720(@OriginalArg(1) int arg0, @OriginalArg(2) Runnable arg1) {
		return this.method5739(arg0, 2, arg1, 0, (byte) 49);
	}

	@OriginalMember(owner = "loader!bd", name = "a", descriptor = "(Ljava/lang/Object;IIII)Lloader!id;")
	private Class226 method5721(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(3) Class226 local3 = new Class226();
		synchronized (local3) {
			local3.anObject9 = arg0;
			local3.anInt6709 = arg1;
			local3.anInt6711 = arg3;
			local3.anInt6712 = arg4;
			synchronized (this) {
				if (this.aClass226_1 == null) {
					this.aClass226_1 = this.aClass226_2 = local3;
				} else {
					this.aClass226_1.aClass226_3 = local3;
					this.aClass226_1 = local3;
				}
				this.notify();
			}
			if (arg2 <= 37) {
				this.anEventQueue2 = null;
			}
			try {
				local3.wait();
			} catch (@Pc(61) InterruptedException local61) {
			}
			return local3;
		}
	}

	@OriginalMember(owner = "loader!bd", name = "a", descriptor = "(Ljava/lang/Class;I)Lloader!id;")
	private Class226 method5722(@OriginalArg(0) Class arg0, @OriginalArg(1) int arg1) {
		return arg1 > -4 ? (Class226) null : this.method5739(0, 11, arg0, 0, (byte) 44);
	}

	@OriginalMember(owner = "loader!bd", name = "b", descriptor = "(I)Lloader!id;")
	private Class226 method5723(@OriginalArg(0) int arg0) {
		if (arg0 != -8476) {
			this.aClass223_1 = null;
		}
		return this.method5739(0, 18, null, 0, (byte) 23);
	}

	@OriginalMember(owner = "loader!bd", name = "a", descriptor = "(IILjava/awt/Point;I[ILjava/awt/Component;)Lloader!id;")
	private Class226 method5725(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Point arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) Component arg5) {
		return arg3 == 0 ? this.method5739(arg1, 17, new Object[] { arg5, arg4, arg2 }, arg0, (byte) 18) : (Class226) null;
	}

	@OriginalMember(owner = "loader!bd", name = "b", descriptor = "(ILjava/lang/String;)Ljava/io/File;")
	public File method5726(@OriginalArg(1) String arg0) {
		return method5748(arg0, this.anInt6703, this.aString446);
	}

	@OriginalMember(owner = "loader!bd", name = "b", descriptor = "(Z)V")
	private void method5727(@OriginalArg(0) boolean arg0) {
		synchronized (this) {
			this.aBoolean496 = arg0;
			this.notifyAll();
		}
		try {
			this.aThread4.join();
		} catch (@Pc(21) InterruptedException local21) {
		}
		if (this.aClass228_2 != null) {
			try {
				this.aClass228_2.method5784();
			} catch (@Pc(31) IOException local31) {
			}
		}
		if (this.aClass228_3 != null) {
			try {
				this.aClass228_3.method5784();
			} catch (@Pc(40) IOException local40) {
			}
		}
		if (this.aClass228Array1 != null) {
			for (@Pc(46) int local46 = 0; local46 < this.aClass228Array1.length; local46++) {
				if (this.aClass228Array1[local46] != null) {
					try {
						this.aClass228Array1[local46].method5784();
					} catch (@Pc(68) IOException local68) {
					}
				}
			}
		}
		if (this.aClass228_1 != null) {
			try {
				this.aClass228_1.method5784();
			} catch (@Pc(81) IOException local81) {
			}
		}
	}

	@OriginalMember(owner = "loader!bd", name = "a", descriptor = "(ILjava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;)Lloader!id;")
	private Class226 method5728(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Class[] arg2, @OriginalArg(3) Class arg3) {
		return arg0 == 8156 ? this.method5739(0, 8, new Object[] { arg3, arg1, arg2 }, 0, (byte) 124) : (Class226) null;
	}

	@OriginalMember(owner = "loader!bd", name = "a", descriptor = "(BZLjava/awt/Component;)Lloader!id;")
	private Class226 method5729(@OriginalArg(0) byte arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Component arg2) {
		if (arg0 > -18) {
			this.aClass228_1 = null;
		}
		return this.method5739(arg1 ? 1 : 0, 15, arg2, 0, (byte) 69);
	}

	@OriginalMember(owner = "loader!bd", name = "a", descriptor = "(Z)Lloader!ro;")
	private Interface11 method5730(@OriginalArg(0) boolean arg0) {
		if (!arg0) {
			this.method5738((byte) -18);
		}
		return this.anInterface11_1;
	}

	@OriginalMember(owner = "loader!bd", name = "a", descriptor = "(ILjava/lang/String;)Lloader!id;")
	private Class226 method5732(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (arg0 != 21) {
			method5724(-30, null);
		}
		return this.method5739(0, 21, arg1, 0, (byte) 44);
	}

	@OriginalMember(owner = "loader!bd", name = "a", descriptor = "(BLjava/lang/Class;)Lloader!id;")
	private Class226 method5733(@OriginalArg(0) byte arg0, @OriginalArg(1) Class arg1) {
		if (arg0 >= -70) {
			aLong233 = 97L;
		}
		return this.method5739(0, 20, arg1, 0, (byte) 27);
	}

	@OriginalMember(owner = "loader!bd", name = "a", descriptor = "(II)Lloader!id;")
	private Class226 method5734(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 == 28006 ? this.method5739(arg1, 3, null, 0, (byte) 12) : (Class226) null;
	}

	@OriginalMember(owner = "loader!bd", name = "a", descriptor = "(ILjava/lang/Class;)Lloader!id;")
	private Class226 method5735(@OriginalArg(0) int arg0, @OriginalArg(1) Class arg1) {
		if (arg0 != 0) {
			this.aClass226_1 = null;
		}
		return this.method5739(0, 10, arg1, 0, (byte) 106);
	}

	@OriginalMember(owner = "loader!bd", name = "a", descriptor = "(BIIII)Lloader!id;")
	private Class226 method5736(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 < 108) {
			method5724(102, null);
		}
		return this.method5739(arg1 + (arg4 << 16), 6, null, (arg3 << 16) + arg2, (byte) 16);
	}

	@OriginalMember(owner = "loader!bd", name = "b", descriptor = "(B)Z")
	private boolean method5737(@OriginalArg(0) byte arg0) {
		if (arg0 == -53) {
			return this.aClass224_1 != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "loader!bd", name = "c", descriptor = "(B)V")
	private void method5738(@OriginalArg(0) byte arg0) {
		if (arg0 >= 78) {
			aLong233 = Class227.method5780() + 5000L;
		}
	}

	@OriginalMember(owner = "loader!bd", name = "a", descriptor = "(IILjava/lang/Object;IB)Lloader!id;")
	private Class226 method5739(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Object arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		@Pc(3) Class226 local3 = new Class226();
		local3.anInt6712 = arg1;
		if (arg4 <= 0) {
			return (Class226) null;
		}
		local3.anInt6709 = arg3;
		local3.anObject9 = arg2;
		local3.anInt6711 = arg0;
		synchronized (this) {
			if (this.aClass226_1 == null) {
				this.aClass226_1 = this.aClass226_2 = local3;
			} else {
				this.aClass226_1.aClass226_3 = local3;
				this.aClass226_1 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "loader!bd", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(17) Class226 local17;
			synchronized (this) {
				while (true) {
					if (this.aBoolean496) {
						return;
					}
					if (this.aClass226_2 != null) {
						local17 = this.aClass226_2;
						this.aClass226_2 = this.aClass226_2.aClass226_3;
						if (this.aClass226_2 == null) {
							this.aClass226_1 = null;
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
				@Pc(45) int local45 = local17.anInt6712;
				if (local45 == 1) {
					if (Class227.method5780() < aLong233) {
						throw new IOException();
					}
					local17.anObject10 = new Socket(InetAddress.getByName((String) local17.anObject9), local17.anInt6711);
				} else if (local45 == 2) {
					@Pc(852) Thread local852 = new Thread((Runnable) local17.anObject9);
					local852.setDaemon(true);
					local852.start();
					local852.setPriority(local17.anInt6711);
					local17.anObject10 = local852;
				} else if (local45 == 4) {
					if (Class227.method5780() < aLong233) {
						throw new IOException();
					}
					local17.anObject10 = new DataInputStream(((URL) local17.anObject9).openStream());
				} else {
					@Pc(64) Object[] local64;
					if (local45 == 8) {
						local64 = (Object[]) local17.anObject9;
						if (((Class) local64[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local17.anObject10 = ((Class) local64[0]).getDeclaredMethod((String) local64[1], (Class[]) local64[2]);
					} else if (local45 == 9) {
						local64 = (Object[]) local17.anObject9;
						if (((Class) local64[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local17.anObject10 = ((Class) local64[0]).getDeclaredField((String) local64[1]);
					} else if (local45 == 18) {
						@Pc(129) Clipboard local129 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local17.anObject10 = local129.getContents(null);
					} else if (local45 == 19) {
						@Pc(142) Transferable local142 = (Transferable) local17.anObject9;
						@Pc(145) Clipboard local145 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local145.setContents(local142, null);
					} else {
						@Pc(203) String local203;
						if (local45 == 3) {
							if (Class227.method5780() < aLong233) {
								throw new IOException();
							}
							local203 = (local17.anInt6711 >> 24 & 0xFF) + "." + (local17.anInt6711 >> 16 & 0xFF) + "." + (local17.anInt6711 >> 8 & 0xFF) + "." + (local17.anInt6711 & 0xFF);
							local17.anObject10 = InetAddress.getByName(local203).getHostName();
						} else if (local45 == 21) {
							if (Class227.method5780() < aLong233) {
								throw new IOException();
							}
							local17.anObject10 = InetAddress.getByName((String) local17.anObject9).getAddress();
						} else if (local45 == 5) {
							local17.anObject10 = this.aClass224_1.method5757();
						} else if (local45 == 6) {
							@Pc(776) Frame local776 = new Frame("Jagex Full Screen");
							local17.anObject10 = local776;
							local776.setResizable(false);
							this.aClass224_1.method5756(local17.anInt6709 >> 16, local776, local17.anInt6711 & 0xFFFF, local17.anInt6711 >>> 16, local17.anInt6709 & 0xFFFF);
						} else if (local45 == 7) {
							this.aClass224_1.method5758();
						} else {
							@Pc(483) Runtime local483;
							@Pc(489) Method local489;
							@Pc(481) Class[] local481;
							if (local45 == 10) {
								local481 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
								local483 = Runtime.getRuntime();
								if (!aString440.startsWith("mac")) {
									local489 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", local481);
									local489.setAccessible(true);
									local489.invoke(local483, local17.anObject9, "jawt");
									local489.setAccessible(false);
								}
								local489 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local481);
								local489.setAccessible(true);
								if (aString440.startsWith("linux") || aString440.startsWith("sunos")) {
									local489.invoke(local483, local17.anObject9, this.method5726("libjaggl_dri.so").toString());
									@Pc(723) Class local723 = ((Class) local17.anObject9).getClassLoader().loadClass("jaggl.X11.dri");
									local723.getMethod("bind").invoke(null);
									local489.invoke(local483, local17.anObject9, this.method5726("libjaggl.so").toString());
									local723.getMethod("close").invoke(null);
								} else if (aString440.startsWith("mac")) {
									local489.invoke(local483, local17.anObject9, this.method5726("libjaggl.jnilib").toString());
								} else if (aString440.startsWith("win")) {
									local489.invoke(local483, local17.anObject9, this.method5726("jaggl.dll").toString());
								} else {
									throw new Exception();
								}
								local489.setAccessible(false);
							} else {
								@Pc(260) int local260;
								if (local45 == 11) {
									@Pc(247) Field local247 = Class.forName("java.lang.ClassLoader").getDeclaredField("nativeLibraries");
									local247.setAccessible(true);
									@Pc(258) Vector local258 = (Vector) local247.get(((Class) local17.anObject9).getClassLoader());
									for (local260 = 0; local260 < local258.size(); local260++) {
										@Pc(268) Object local268 = local258.elementAt(local260);
										@Pc(275) Method local275 = local268.getClass().getDeclaredMethod("finalize");
										local275.setAccessible(true);
										local275.invoke(local268);
										local275.setAccessible(false);
										@Pc(292) Field local292 = local268.getClass().getDeclaredField("handle");
										local292.setAccessible(true);
										local292.set(local268, Integer.valueOf(0));
										local292.setAccessible(false);
									}
									local247.setAccessible(false);
								} else {
									@Pc(326) Class228 local326;
									if (local45 == 12) {
										local326 = method5724(this.anInt6703, this.aString446);
										local17.anObject10 = local326;
									} else if (local45 == 13) {
										local326 = method5731(this.anInt6703, this.aString446);
										local17.anObject10 = local326;
									} else if (local45 == 14) {
										@Pc(560) int local560 = local17.anInt6711;
										@Pc(563) int local563 = local17.anInt6709;
										this.aClass223_1.method5752(local560, local563);
									} else if (local45 == 15) {
										@Pc(343) boolean local343 = local17.anInt6711 != 0;
										@Pc(347) Component local347 = (Component) local17.anObject9;
										this.aClass223_1.method5754(local347, local343);
									} else if (local45 == 17) {
										local64 = (Object[]) local17.anObject9;
										this.aClass223_1.method5753((Point) local64[2], local17.anInt6709, (int[]) local64[1], (Component) local64[0], local17.anInt6711);
									} else if (local45 == 16) {
										try {
											if (!aString440.startsWith("win")) {
												throw new Exception();
											}
											local203 = (String) local17.anObject9;
											if (!local203.startsWith("http://") && !local203.startsWith("https://")) {
												throw new Exception();
											}
											@Pc(418) String local418 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
											for (local260 = 0; local260 < local203.length(); local260++) {
												if (local418.indexOf(local203.charAt(local260)) == -1) {
													throw new Exception();
												}
											}
											Runtime.getRuntime().exec("cmd /c start \"j\" \"" + local203 + "\"");
											local17.anObject10 = null;
										} catch (@Pc(461) Exception local461) {
											local17.anObject10 = local461;
										}
									} else if (local45 == 20) {
										try {
											local481 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
											local483 = Runtime.getRuntime();
											local489 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local481);
											local489.setAccessible(true);
											if (aString440.startsWith("win")) {
												if (aString439.startsWith("amd64") || aString439.startsWith("x86_64")) {
													local489.invoke(local483, local17.anObject9, this.method5726("jagmisc64.dll").toString());
												} else {
													local489.invoke(local483, local17.anObject9, this.method5726("jagmisc.dll").toString());
												}
											}
											local489.setAccessible(false);
										} catch (@Pc(548) Throwable local548) {
											local17.anObject10 = local548;
										}
									} else {
										throw new Exception("");
									}
								}
							}
						}
					}
				}
				local17.anInt6710 = 1;
			} catch (@Pc(895) ThreadDeath local895) {
				throw local895;
			} catch (@Pc(898) Throwable local898) {
				local17.anInt6710 = 2;
			}
			synchronized (local17) {
				local17.notify();
			}
		}
	}

	@OriginalMember(owner = "loader!bd", name = "a", descriptor = "(Ljava/lang/String;Z)[B")
	private byte[] method5740(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) {
		if (arg1) {
			@Pc(13) Class226 local13 = this.method5721(arg0, 0, 112, 0, 21);
			return (byte[]) local13.anObject10;
		} else {
			return (byte[]) null;
		}
	}

	@OriginalMember(owner = "loader!bd", name = "a", descriptor = "(I)Lloader!id;")
	private Class226 method5741(@OriginalArg(0) int arg0) {
		if (arg0 >= -103) {
			this.aClass228_1 = null;
		}
		return this.method5739(0, 5, null, 0, (byte) 34);
	}

	@OriginalMember(owner = "loader!bd", name = "a", descriptor = "(Ljava/awt/Component;BII)Lloader!id;")
	private Class226 method5742(@OriginalArg(0) Component arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1 != -44) {
			this.method5729((byte) -106, false, null);
		}
		@Pc(12) Point local12 = arg0.getLocationOnScreen();
		return this.method5739(arg2 + local12.x, 14, null, arg3 + local12.y, (byte) 63);
	}

	@OriginalMember(owner = "loader!bd", name = "a", descriptor = "(Ljava/net/URL;I)Lloader!id;")
	private Class226 method5743(@OriginalArg(0) URL arg0, @OriginalArg(1) int arg1) {
		return arg1 == 4 ? this.method5739(0, 4, arg0, 0, (byte) 96) : (Class226) null;
	}

	@OriginalMember(owner = "loader!bd", name = "a", descriptor = "(Ljava/lang/String;B)Lloader!id;")
	private Class226 method5744(@OriginalArg(0) String arg0, @OriginalArg(1) byte arg1) {
		return arg1 == 23 ? this.method5739(0, 16, arg0, 0, (byte) 41) : (Class226) null;
	}

	@OriginalMember(owner = "loader!bd", name = "a", descriptor = "(Ljava/awt/Frame;I)Lloader!id;")
	private Class226 method5745(@OriginalArg(0) Frame arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 0) {
			aHashtable1 = null;
		}
		return this.method5739(0, 7, arg0, 0, (byte) 69);
	}

	@OriginalMember(owner = "loader!bd", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;I)Lloader!id;")
	private Class226 method5746(@OriginalArg(0) Class arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		if (arg2 != 0) {
			this.aString446 = null;
		}
		return this.method5739(0, 9, new Object[] { arg0, arg1 }, 0, (byte) 105);
	}

	@OriginalMember(owner = "loader!bd", name = "a", descriptor = "(B)Lloader!id;")
	private Class226 method5747(@OriginalArg(0) byte arg0) {
		if (arg0 != -41) {
			this.aClass226_1 = null;
		}
		return this.method5739(0, 13, null, 0, (byte) 114);
	}

	@OriginalMember(owner = "loader!bd", name = "c", descriptor = "(I)Lloader!id;")
	private Class226 method5749(@OriginalArg(0) int arg0) {
		if (arg0 != 12) {
			this.aClass228Array1 = null;
		}
		return this.method5739(0, 12, null, 0, (byte) 65);
	}

	@OriginalMember(owner = "loader!bd", name = "a", descriptor = "(ILjava/lang/String;I)Lloader!id;")
	private Class226 method5750(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		if (arg2 > -16) {
			this.method5732(-16, null);
		}
		return this.method5739(arg0, 1, arg1, 0, (byte) 32);
	}

	@OriginalMember(owner = "loader!bd", name = "a", descriptor = "(Ljava/awt/datatransfer/Transferable;B)Lloader!id;")
	private Class226 method5751(@OriginalArg(0) Transferable arg0, @OriginalArg(1) byte arg1) {
		return arg1 == -80 ? this.method5739(0, 19, arg0, 0, (byte) 59) : (Class226) null;
	}
}
