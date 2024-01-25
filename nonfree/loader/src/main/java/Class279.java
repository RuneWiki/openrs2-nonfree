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

@OriginalClass("loader!nt")
public final class Class279 implements Runnable {

	@OriginalMember(owner = "loader!nt", name = "k", descriptor = "Ljava/lang/String;")
	private static String aString76;

	@OriginalMember(owner = "loader!nt", name = "g", descriptor = "Ljava/lang/String;")
	private static String aString77;

	@OriginalMember(owner = "loader!nt", name = "e", descriptor = "Ljava/lang/String;")
	private static String aString78;

	@OriginalMember(owner = "loader!nt", name = "q", descriptor = "Ljava/lang/String;")
	public static String aString79;

	@OriginalMember(owner = "loader!nt", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString80;

	@OriginalMember(owner = "loader!nt", name = "t", descriptor = "Ljava/lang/String;")
	private static String aString81;

	@OriginalMember(owner = "loader!nt", name = "i", descriptor = "Ljava/lang/String;")
	private static String aString83;

	@OriginalMember(owner = "loader!nt", name = "x", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod3;

	@OriginalMember(owner = "loader!nt", name = "y", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod4;

	@OriginalMember(owner = "loader!nt", name = "h", descriptor = "I")
	private static final int anInt7451 = 1;

	@OriginalMember(owner = "loader!nt", name = "c", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable4 = new Hashtable(16);

	@OriginalMember(owner = "loader!nt", name = "w", descriptor = "J")
	private static volatile long aLong239 = 0L;

	@OriginalMember(owner = "loader!nt", name = "A", descriptor = "Lloader!mi;")
	private Interface15 anInterface15_1;

	@OriginalMember(owner = "loader!nt", name = "j", descriptor = "Lloader!um;")
	private Class281 aClass281_2 = null;

	@OriginalMember(owner = "loader!nt", name = "r", descriptor = "Lloader!st;")
	private Class280 aClass280_2 = null;

	@OriginalMember(owner = "loader!nt", name = "a", descriptor = "Lloader!st;")
	private Class280 aClass280_3 = null;

	@OriginalMember(owner = "loader!nt", name = "u", descriptor = "Z")
	private boolean aBoolean657 = false;

	@OriginalMember(owner = "loader!nt", name = "b", descriptor = "Lloader!um;")
	private Class281 aClass281_1 = null;

	@OriginalMember(owner = "loader!nt", name = "f", descriptor = "Lloader!st;")
	private Class280 aClass280_1 = null;

	@OriginalMember(owner = "loader!nt", name = "o", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3 = null;

	@OriginalMember(owner = "loader!nt", name = "z", descriptor = "Ljava/lang/String;")
	private String aString82;

	@OriginalMember(owner = "loader!nt", name = "m", descriptor = "I")
	private final int anInt7450;

	@OriginalMember(owner = "loader!nt", name = "d", descriptor = "Ljava/awt/EventQueue;")
	private EventQueue anEventQueue2;

	@OriginalMember(owner = "loader!nt", name = "s", descriptor = "[Lloader!st;")
	private final Class280[] aClass280Array1;

	@OriginalMember(owner = "loader!nt", name = "v", descriptor = "Lloader!c;")
	private Class275 aClass275_1;

	@OriginalMember(owner = "loader!nt", name = "l", descriptor = "Lloader!e;")
	private Class276 aClass276_1;

	@OriginalMember(owner = "loader!nt", name = "p", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread6;

	@OriginalMember(owner = "loader!nt", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IB)Ljava/io/File;")
	private static File method6049(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(4) File local4 = (File) aHashtable4.get(arg1);
		if (local4 != null) {
			return local4;
		}
		@Pc(43) String[] local43 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString76, "/tmp/", "" };
		@Pc(68) String[] local68 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
		for (@Pc(70) int local70 = 0; local70 < 2; local70++) {
			for (@Pc(77) int local77 = 0; local77 < local68.length; local77++) {
				for (@Pc(83) int local83 = 0; local83 < local43.length; local83++) {
					@Pc(117) String local117 = local43[local83] + local68[local77] + "/" + (arg0 == null ? "" : arg0 + "/") + arg1;
					@Pc(119) RandomAccessFile local119 = null;
					try {
						@Pc(124) File local124 = new File(local117);
						if (local70 != 0 || local124.exists()) {
							@Pc(138) String local138 = local43[local83];
							if (local70 != 1 || local138.length() <= 0 || (new File(local138)).exists()) {
								(new File(local43[local83] + local68[local77])).mkdir();
								if (arg0 != null) {
									(new File(local43[local83] + local68[local77] + "/" + arg0)).mkdir();
								}
								local119 = new RandomAccessFile(local124, "rw");
								@Pc(204) int local204 = local119.read();
								local119.seek(0L);
								local119.write(local204);
								local119.seek(0L);
								local119.close();
								aHashtable4.put(arg1, local124);
								return local124;
							}
						}
					} catch (@Pc(223) Exception local223) {
						try {
							if (local119 != null) {
								local119.close();
							}
						} catch (@Pc(232) Exception local232) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "loader!nt", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;II)Lloader!st;")
	private static Class280 method6057(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2) {
		@Pc(19) String local19;
		if (arg2 == 33) {
			local19 = "jagex_" + arg0 + "_preferences" + arg1 + "_rc.dat";
		} else if (arg2 == 34) {
			local19 = "jagex_" + arg0 + "_preferences" + arg1 + "_wip.dat";
		} else {
			local19 = "jagex_" + arg0 + "_preferences" + arg1 + ".dat";
		}
		@Pc(89) String[] local89 = new String[] { "c:/rscache/", "/rscache/", aString76, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(91) int local91 = 0; local91 < local89.length; local91++) {
			@Pc(103) String local103 = local89[local91];
			if (local103.length() <= 0 || (new File(local103)).exists()) {
				try {
					return new Class280(new File(local103, local19), "rw", 10000L);
				} catch (@Pc(127) Exception local127) {
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "loader!nt", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class279(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		this.aString82 = arg2;
		this.anApplet3 = arg0;
		aString80 = "1.1";
		this.anInt7450 = arg1;
		aString79 = "Unknown";
		try {
			aString79 = System.getProperty("java.vendor");
			aString80 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			aString77 = System.getProperty("os.name");
		} catch (@Pc(48) Exception local48) {
			aString77 = "Unknown";
		}
		aString83 = aString77.toLowerCase();
		try {
			aString81 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(59) Exception local59) {
			aString81 = "";
		}
		try {
			aString78 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(67) Exception local67) {
			aString78 = "";
		}
		try {
			aString76 = System.getProperty("user.home");
			if (aString76 != null) {
				aString76 = aString76 + "/";
			}
		} catch (@Pc(86) Exception local86) {
		}
		if (aString76 == null) {
			aString76 = "~/";
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
		} catch (@Pc(126) Exception local126) {
		}
		try {
			if (arg0 == null) {
				aMethod4 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				aMethod4 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(153) Exception local153) {
		}
		this.aClass280_1 = new Class280(method6049(null, "random.dat", this.anInt7450), "rw", 25L);
		this.aClass280_3 = new Class280(this.method6041("main_file_cache.dat2"), "rw", 209715200L);
		this.aClass280_2 = new Class280(this.method6041("main_file_cache.idx255"), "rw", 1048576L);
		this.aClass280Array1 = new Class280[arg3];
		for (@Pc(194) int local194 = 0; local194 < arg3; local194++) {
			this.aClass280Array1[local194] = new Class280(this.method6041("main_file_cache.idx" + local194), "rw", 1048576L);
		}
		try {
			this.aClass275_1 = new Class275();
		} catch (@Pc(230) Throwable local230) {
		}
		try {
			this.aClass276_1 = new Class276();
		} catch (@Pc(237) Throwable local237) {
		}
		@Pc(240) ThreadGroup local240 = Thread.currentThread().getThreadGroup();
		for (@Pc(243) ThreadGroup local243 = local240.getParent(); local243 != null; local243 = local243.getParent()) {
			local240 = local243;
		}
		@Pc(255) Thread[] local255 = new Thread[1000];
		local240.enumerate(local255);
		for (@Pc(261) int local261 = 0; local261 < local255.length; local261++) {
			if (local255[local261] != null && local255[local261].getName().startsWith("AWT")) {
				local255[local261].setPriority(1);
			}
		}
		this.aBoolean657 = false;
		this.aThread6 = new Thread(this);
		this.aThread6.setPriority(10);
		this.aThread6.setDaemon(true);
		this.aThread6.start();
	}

	@OriginalMember(owner = "loader!nt", name = "a", descriptor = "(IIIIB)Lloader!um;")
	private Class281 method6032(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		if (arg4 <= 48) {
			this.method6052(false, null);
		}
		return this.method6058((byte) 111, arg2 + (arg1 << 16), null, 6, arg0 + (arg3 << 16));
	}

	@OriginalMember(owner = "loader!nt", name = "a", descriptor = "(Ljava/lang/String;B)Lloader!um;")
	private Class281 method6033(@OriginalArg(0) String arg0, @OriginalArg(1) byte arg1) {
		return arg1 == 64 ? this.method6058((byte) 108, 0, arg0, 16, 0) : (Class281) null;
	}

	@OriginalMember(owner = "loader!nt", name = "a", descriptor = "(BLjava/awt/datatransfer/Transferable;)Lloader!um;")
	private Class281 method6034(@OriginalArg(1) Transferable arg0) {
		return this.method6058((byte) 19, 0, arg0, 19, 0);
	}

	@OriginalMember(owner = "loader!nt", name = "a", descriptor = "(ZLjava/lang/String;I)Lloader!um;")
	private Class281 method6035(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		if (arg2 != 0) {
			this.method6044((byte) -9);
		}
		return arg0 ? this.method6058((byte) 98, 0, arg1, 12, 0) : this.method6058((byte) 21, 0, arg1, 13, 0);
	}

	@OriginalMember(owner = "loader!nt", name = "a", descriptor = "(IIIILjava/lang/Object;)Lloader!um;")
	private Class281 method6036(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Object arg4) {
		@Pc(3) Class281 local3 = new Class281();
		synchronized (local3) {
			local3.anObject11 = arg4;
			local3.anInt7455 = arg2;
			local3.anInt7453 = arg1;
			local3.anInt7452 = arg3;
			synchronized (this) {
				if (this.aClass281_1 == null) {
					this.aClass281_1 = this.aClass281_2 = local3;
				} else {
					this.aClass281_1.aClass281_3 = local3;
					this.aClass281_1 = local3;
				}
				this.notify();
			}
			if (arg0 != 16929) {
				this.method6035(true, null, 13);
			}
			try {
				local3.wait();
			} catch (@Pc(64) InterruptedException local64) {
			}
			return local3;
		}
	}

	@OriginalMember(owner = "loader!nt", name = "a", descriptor = "(Z)Lloader!mi;")
	private Interface15 method6037(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.method6032(-128, 110, 102, 31, (byte) -53);
		}
		return this.anInterface15_1;
	}

	@OriginalMember(owner = "loader!nt", name = "a", descriptor = "(Ljava/lang/String;I)Lloader!um;")
	private Class281 method6038(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (arg1 < 93) {
			this.aClass281_2 = null;
		}
		return this.method6058((byte) 93, 0, arg0, 21, 0);
	}

	@OriginalMember(owner = "loader!nt", name = "a", descriptor = "(ZLjava/lang/String;)[B")
	private byte[] method6039(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1) {
		@Pc(7) Class281 local7 = this.method6036(16929, 0, 0, 21, arg1);
		if (!arg0) {
			this.method6034(null);
		}
		return (byte[]) local7.anObject12;
	}

	@OriginalMember(owner = "loader!nt", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/Class;)Lloader!um;")
	private Class281 method6040(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class arg2) {
		return arg1 == 19824 ? this.method6058((byte) 86, 0, new Object[] { arg2, arg0 }, 9, 0) : (Class281) null;
	}

	@OriginalMember(owner = "loader!nt", name = "b", descriptor = "(ZLjava/lang/String;)Ljava/io/File;")
	public File method6041(@OriginalArg(1) String arg0) {
		return method6049(this.aString82, arg0, this.anInt7450);
	}

	@OriginalMember(owner = "loader!nt", name = "a", descriptor = "(B)V")
	private void method6042(@OriginalArg(0) byte arg0) {
		synchronized (this) {
			this.aBoolean657 = true;
			this.notifyAll();
		}
		try {
			this.aThread6.join();
		} catch (@Pc(21) InterruptedException local21) {
		}
		if (this.aClass280_3 != null) {
			try {
				this.aClass280_3.method6062();
			} catch (@Pc(30) IOException local30) {
			}
		}
		if (this.aClass280_2 != null) {
			try {
				this.aClass280_2.method6062();
			} catch (@Pc(39) IOException local39) {
			}
		}
		if (this.aClass280Array1 != null) {
			for (@Pc(46) int local46 = 0; local46 < this.aClass280Array1.length; local46++) {
				if (this.aClass280Array1[local46] != null) {
					try {
						this.aClass280Array1[local46].method6062();
					} catch (@Pc(66) IOException local66) {
					}
				}
			}
		}
		if (arg0 != -94) {
			this.method6035(false, null, -126);
		}
		if (this.aClass280_1 != null) {
			try {
				this.aClass280_1.method6062();
			} catch (@Pc(87) IOException local87) {
			}
		}
	}

	@OriginalMember(owner = "loader!nt", name = "c", descriptor = "(B)Z")
	private boolean method6043(@OriginalArg(0) byte arg0) {
		if (arg0 >= -107) {
			this.aBoolean657 = false;
		}
		return this.aClass275_1 != null;
	}

	@OriginalMember(owner = "loader!nt", name = "d", descriptor = "(B)V")
	private void method6044(@OriginalArg(0) byte arg0) {
		aLong239 = Class278.method6019() + 5000L;
		if (arg0 < 79) {
			this.method6040(null, 108, null);
		}
	}

	@OriginalMember(owner = "loader!nt", name = "a", descriptor = "(Ljava/net/URL;I)Lloader!um;")
	private Class281 method6045(@OriginalArg(0) URL arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 0) {
			this.method6055((byte) -78);
		}
		return this.method6058((byte) 116, 0, arg0, 4, 0);
	}

	@OriginalMember(owner = "loader!nt", name = "a", descriptor = "([Ljava/lang/Class;Ljava/lang/Class;BLjava/lang/String;)Lloader!um;")
	private Class281 method6046(@OriginalArg(0) Class[] arg0, @OriginalArg(1) Class arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) String arg3) {
		if (arg2 != 59) {
			this.aClass281_1 = null;
		}
		return this.method6058((byte) 61, 0, new Object[] { arg1, arg3, arg0 }, 8, 0);
	}

	@OriginalMember(owner = "loader!nt", name = "a", descriptor = "(IILjava/lang/String;)Lloader!um;")
	private Class281 method6047(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		return arg0 == -26521 ? this.method6058((byte) 89, 0, arg2, 1, arg1) : (Class281) null;
	}

	@OriginalMember(owner = "loader!nt", name = "a", descriptor = "(IIILjava/awt/Component;)Lloader!um;")
	private Class281 method6048(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Component arg3) {
		@Pc(2) Point local2 = arg3.getLocationOnScreen();
		return arg2 == 14 ? this.method6058((byte) 16, arg1 + local2.y, null, 14, arg0 + local2.x) : (Class281) null;
	}

	@OriginalMember(owner = "loader!nt", name = "a", descriptor = "(II)Lloader!um;")
	private Class281 method6050(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 > -111) {
			aString76 = null;
		}
		return this.method6058((byte) 125, 0, null, 3, arg1);
	}

	@OriginalMember(owner = "loader!nt", name = "b", descriptor = "(ZLjava/lang/Class;)Lloader!um;")
	private Class281 method6051(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class arg1) {
		if (arg0) {
			this.method6039(true, null);
		}
		return this.method6058((byte) 8, 0, arg1, 11, 0);
	}

	@OriginalMember(owner = "loader!nt", name = "a", descriptor = "(ZLjava/lang/Class;)Lloader!um;")
	private Class281 method6052(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class arg1) {
		if (arg0) {
			this.anEventQueue2 = null;
		}
		return this.method6058((byte) 45, 0, arg1, 20, 0);
	}

	@OriginalMember(owner = "loader!nt", name = "a", descriptor = "(Ljava/awt/Component;ZI)Lloader!um;")
	private Class281 method6053(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		return this.method6058((byte) 52, 0, arg0, 15, arg1 ? 1 : 0);
	}

	@OriginalMember(owner = "loader!nt", name = "a", descriptor = "(IIILjava/awt/Point;Ljava/awt/Component;[I)Lloader!um;")
	private Class281 method6054(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Point arg3, @OriginalArg(4) Component arg4, @OriginalArg(5) int[] arg5) {
		if (arg0 != 19) {
			this.method6052(true, null);
		}
		return this.method6058((byte) 110, arg1, new Object[] { arg4, arg5, arg3 }, 17, arg2);
	}

	@OriginalMember(owner = "loader!nt", name = "b", descriptor = "(B)Lloader!um;")
	private Class281 method6055(@OriginalArg(0) byte arg0) {
		if (arg0 <= 69) {
			this.method6040(null, -13, null);
		}
		return this.method6058((byte) 41, 0, null, 18, 0);
	}

	@OriginalMember(owner = "loader!nt", name = "a", descriptor = "(I)Lloader!um;")
	private Class281 method6056(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			this.method6051(false, null);
		}
		return this.method6058((byte) 111, 0, null, 5, 0);
	}

	@OriginalMember(owner = "loader!nt", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(17) Class281 local17;
			synchronized (this) {
				while (true) {
					if (this.aBoolean657) {
						return;
					}
					if (this.aClass281_2 != null) {
						local17 = this.aClass281_2;
						this.aClass281_2 = this.aClass281_2.aClass281_3;
						if (this.aClass281_2 == null) {
							this.aClass281_1 = null;
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
				@Pc(47) int local47 = local17.anInt7452;
				if (local47 == 1) {
					if (aLong239 > Class278.method6019()) {
						throw new IOException();
					}
					local17.anObject12 = new Socket(InetAddress.getByName((String) local17.anObject11), local17.anInt7455);
				} else if (local47 == 2) {
					@Pc(81) Thread local81 = new Thread((Runnable) local17.anObject11);
					local81.setDaemon(true);
					local81.start();
					local81.setPriority(local17.anInt7455);
					local17.anObject12 = local81;
				} else if (local47 == 4) {
					if (aLong239 > Class278.method6019()) {
						throw new IOException();
					}
					local17.anObject12 = new DataInputStream(((URL) local17.anObject11).openStream());
				} else {
					@Pc(518) Object[] local518;
					if (local47 == 8) {
						local518 = (Object[]) local17.anObject11;
						if (((Class) local518[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local17.anObject12 = ((Class) local518[0]).getDeclaredMethod((String) local518[1], (Class[]) local518[2]);
					} else if (local47 == 9) {
						local518 = (Object[]) local17.anObject11;
						if (((Class) local518[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local17.anObject12 = ((Class) local518[0]).getDeclaredField((String) local518[1]);
					} else if (local47 == 18) {
						@Pc(638) Clipboard local638 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local17.anObject12 = local638.getContents(null);
					} else if (local47 == 19) {
						@Pc(139) Transferable local139 = (Transferable) local17.anObject11;
						@Pc(142) Clipboard local142 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local142.setContents(local139, null);
					} else {
						@Pc(359) String local359;
						if (local47 == 3) {
							if (aLong239 > Class278.method6019()) {
								throw new IOException();
							}
							local359 = (local17.anInt7455 >> 24 & 0xFF) + "." + (local17.anInt7455 >> 16 & 0xFF) + "." + (local17.anInt7455 >> 8 & 0xFF) + "." + (local17.anInt7455 & 0xFF);
							local17.anObject12 = InetAddress.getByName(local359).getHostName();
						} else if (local47 == 21) {
							if (aLong239 > Class278.method6019()) {
								throw new IOException();
							}
							local17.anObject12 = InetAddress.getByName((String) local17.anObject11).getAddress();
						} else if (local47 == 5) {
							local17.anObject12 = this.aClass275_1.method6004();
						} else if (local47 == 6) {
							@Pc(186) Frame local186 = new Frame("Jagex Full Screen");
							local17.anObject12 = local186;
							local186.setResizable(false);
							this.aClass275_1.method6005(local17.anInt7453 >> 16, local186, local17.anInt7455 & 0xFFFF, local17.anInt7455 >>> 16, local17.anInt7453 & 0xFFFF);
						} else if (local47 == 7) {
							this.aClass275_1.method6007();
						} else {
							@Pc(238) int local238;
							if (local47 == 11) {
								@Pc(225) Field local225 = Class.forName("java.lang.ClassLoader").getDeclaredField("nativeLibraries");
								local225.setAccessible(true);
								@Pc(236) Vector local236 = (Vector) local225.get(((Class) local17.anObject11).getClassLoader());
								for (local238 = 0; local238 < local236.size(); local238++) {
									@Pc(250) Object local250 = local236.elementAt(local238);
									@Pc(257) Method local257 = local250.getClass().getDeclaredMethod("finalize");
									local257.setAccessible(true);
									local257.invoke(local250);
									local257.setAccessible(false);
									@Pc(274) Field local274 = local250.getClass().getDeclaredField("handle");
									local274.setAccessible(true);
									local274.set(local250, Integer.valueOf(0));
									local274.setAccessible(false);
								}
								local225.setAccessible(false);
							} else {
								@Pc(306) Class280 local306;
								if (local47 == 12) {
									local306 = method6057(this.aString82, (String) local17.anObject11, this.anInt7450);
									local17.anObject12 = local306;
								} else if (local47 == 13) {
									local306 = method6057("", (String) local17.anObject11, this.anInt7450);
									local17.anObject12 = local306;
								} else if (local47 == 14) {
									@Pc(543) int local543 = local17.anInt7455;
									@Pc(546) int local546 = local17.anInt7453;
									this.aClass276_1.method6012(local543, local546);
								} else if (local47 == 15) {
									@Pc(329) boolean local329 = local17.anInt7455 != 0;
									@Pc(333) Component local333 = (Component) local17.anObject11;
									this.aClass276_1.method6011(local333, local329);
								} else if (local47 == 17) {
									local518 = (Object[]) local17.anObject11;
									this.aClass276_1.method6013((Component) local518[0], local17.anInt7455, (int[]) local518[1], (Point) local518[2], local17.anInt7453);
								} else if (local47 == 16) {
									try {
										if (!aString83.startsWith("win")) {
											throw new Exception();
										}
										local359 = (String) local17.anObject11;
										if (!local359.startsWith("http://") && !local359.startsWith("https://")) {
											throw new Exception();
										}
										@Pc(374) String local374 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
										for (local238 = 0; local359.length() > local238; local238++) {
											if (local374.indexOf(local359.charAt(local238)) == -1) {
												throw new Exception();
											}
										}
										Runtime.getRuntime().exec("cmd /c start \"j\" \"" + local359 + "\"");
										local17.anObject12 = null;
									} catch (@Pc(416) Exception local416) {
										local17.anObject12 = local416;
										throw local416;
									}
								} else if (local47 == 20) {
									try {
										@Pc(442) Class[] local442 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
										@Pc(444) Runtime local444 = Runtime.getRuntime();
										@Pc(450) Method local450 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local442);
										local450.setAccessible(true);
										if (aString83.startsWith("win")) {
											if (aString81.startsWith("amd64") || aString81.startsWith("x86_64")) {
												local450.invoke(local444, local17.anObject11, this.method6041("jagmisc64.dll").toString());
											} else {
												local450.invoke(local444, local17.anObject11, this.method6041("jagmisc.dll").toString());
											}
										}
										local450.setAccessible(false);
									} catch (@Pc(509) Throwable local509) {
										local17.anObject12 = local509;
									}
								} else {
									throw new Exception("");
								}
							}
						}
					}
				}
				local17.anInt7454 = 1;
			} catch (@Pc(710) ThreadDeath local710) {
				throw local710;
			} catch (@Pc(713) Throwable local713) {
				local17.anInt7454 = 2;
			}
			synchronized (local17) {
				local17.notify();
			}
		}
	}

	@OriginalMember(owner = "loader!nt", name = "a", descriptor = "(BILjava/lang/Object;II)Lloader!um;")
	private Class281 method6058(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Object arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 <= 7) {
			this.aString82 = null;
		}
		@Pc(10) Class281 local10 = new Class281();
		local10.anInt7453 = arg1;
		local10.anInt7455 = arg4;
		local10.anObject11 = arg2;
		local10.anInt7452 = arg3;
		synchronized (this) {
			if (this.aClass281_1 == null) {
				this.aClass281_1 = this.aClass281_2 = local10;
			} else {
				this.aClass281_1.aClass281_3 = local10;
				this.aClass281_1 = local10;
			}
			this.notify();
			return local10;
		}
	}

	@OriginalMember(owner = "loader!nt", name = "a", descriptor = "(Ljava/lang/Class;B)V")
	private void method6059(@OriginalArg(0) Class arg0, @OriginalArg(1) byte arg1) throws Exception {
		@Pc(12) Class[] local12 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
		@Pc(14) Runtime local14 = Runtime.getRuntime();
		@Pc(25) Method local25 = Class.forName("java.lang.reflect.Method").getMethod("setAccessible", Boolean.TYPE);
		@Pc(36) Method local36;
		if (!aString83.startsWith("mac")) {
			local36 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", local12);
			local25.invoke(local36, Boolean.TRUE);
			local36.invoke(local14, arg0, "jawt");
			local25.invoke(local36, Boolean.FALSE);
		}
		local36 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local12);
		local25.invoke(local36, Boolean.TRUE);
		if (!aString83.startsWith("win")) {
			throw new Exception();
		}
		local36.invoke(local14, arg0, this.method6041("sw3d.dll").toString());
		if (arg1 >= 60) {
			local25.invoke(local36, Boolean.FALSE);
		}
	}

	@OriginalMember(owner = "loader!nt", name = "a", descriptor = "(BLjava/awt/Frame;)Lloader!um;")
	private Class281 method6060(@OriginalArg(0) byte arg0, @OriginalArg(1) Frame arg1) {
		return arg0 < 53 ? (Class281) null : this.method6058((byte) 58, 0, arg1, 7, 0);
	}

	@OriginalMember(owner = "loader!nt", name = "a", descriptor = "(BLjava/lang/Runnable;I)Lloader!um;")
	private Class281 method6061(@OriginalArg(0) byte arg0, @OriginalArg(1) Runnable arg1, @OriginalArg(2) int arg2) {
		return arg0 < 64 ? (Class281) null : this.method6058((byte) 61, 0, arg1, 2, arg2);
	}
}
