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

@OriginalClass("loader!lp")
public final class Class327 implements Runnable {

	@OriginalMember(owner = "loader!lp", name = "v", descriptor = "Ljava/lang/String;")
	private static String aString91;

	@OriginalMember(owner = "loader!lp", name = "k", descriptor = "Ljava/lang/String;")
	private static String aString92;

	@OriginalMember(owner = "loader!lp", name = "c", descriptor = "Ljava/lang/String;")
	private static String aString93;

	@OriginalMember(owner = "loader!lp", name = "i", descriptor = "Ljava/lang/String;")
	private static String aString94;

	@OriginalMember(owner = "loader!lp", name = "d", descriptor = "Ljava/lang/String;")
	private static String aString95;

	@OriginalMember(owner = "loader!lp", name = "q", descriptor = "Ljava/lang/String;")
	public static String aString97;

	@OriginalMember(owner = "loader!lp", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString98;

	@OriginalMember(owner = "loader!lp", name = "x", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod3;

	@OriginalMember(owner = "loader!lp", name = "y", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod4;

	@OriginalMember(owner = "loader!lp", name = "u", descriptor = "I")
	private static final int anInt9492 = 1;

	@OriginalMember(owner = "loader!lp", name = "b", descriptor = "Ljava/util/Hashtable;")
	private static Hashtable aHashtable12 = new Hashtable(16);

	@OriginalMember(owner = "loader!lp", name = "w", descriptor = "J")
	private static volatile long aLong249 = 0L;

	@OriginalMember(owner = "loader!lp", name = "A", descriptor = "Lloader!hba;")
	private Interface22 anInterface22_1;

	@OriginalMember(owner = "loader!lp", name = "m", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3 = null;

	@OriginalMember(owner = "loader!lp", name = "j", descriptor = "Lloader!hd;")
	private Class326 aClass326_3 = null;

	@OriginalMember(owner = "loader!lp", name = "p", descriptor = "Lloader!qo;")
	private Class328 aClass328_1 = null;

	@OriginalMember(owner = "loader!lp", name = "r", descriptor = "Z")
	private boolean aBoolean661 = false;

	@OriginalMember(owner = "loader!lp", name = "s", descriptor = "Lloader!hd;")
	private Class326 aClass326_1 = null;

	@OriginalMember(owner = "loader!lp", name = "h", descriptor = "Lloader!qo;")
	private Class328 aClass328_2 = null;

	@OriginalMember(owner = "loader!lp", name = "l", descriptor = "Lloader!hd;")
	private Class326 aClass326_2 = null;

	@OriginalMember(owner = "loader!lp", name = "t", descriptor = "I")
	private final int anInt9493;

	@OriginalMember(owner = "loader!lp", name = "z", descriptor = "Ljava/lang/String;")
	private final String aString96;

	@OriginalMember(owner = "loader!lp", name = "e", descriptor = "Ljava/awt/EventQueue;")
	private EventQueue anEventQueue2;

	@OriginalMember(owner = "loader!lp", name = "n", descriptor = "[Lloader!hd;")
	private final Class326[] aClass326Array1;

	@OriginalMember(owner = "loader!lp", name = "f", descriptor = "Lloader!a;")
	private Class321 aClass321_1;

	@OriginalMember(owner = "loader!lp", name = "a", descriptor = "Lloader!c;")
	private Class322 aClass322_1;

	@OriginalMember(owner = "loader!lp", name = "o", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread6;

	@OriginalMember(owner = "loader!lp", name = "a", descriptor = "(Ljava/lang/String;ZLjava/lang/String;I)Ljava/io/File;")
	private static File method8027(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		@Pc(4) File local4 = (File) aHashtable12.get(arg1);
		if (local4 != null) {
			return local4;
		}
		@Pc(48) String[] local48 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString93, "/tmp/", "" };
		@Pc(73) String[] local73 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
		for (@Pc(75) int local75 = 0; local75 < 2; local75++) {
			for (@Pc(80) int local80 = 0; local80 < local73.length; local80++) {
				for (@Pc(90) int local90 = 0; local90 < local48.length; local90++) {
					@Pc(125) String local125 = local48[local90] + local73[local80] + "/" + (arg0 == null ? "" : arg0 + "/") + arg1;
					@Pc(127) RandomAccessFile local127 = null;
					try {
						@Pc(132) File local132 = new File(local125);
						if (local75 != 0 || local132.exists()) {
							@Pc(143) String local143 = local48[local90];
							if (local75 != 1 || local143.length() <= 0 || (new File(local143)).exists()) {
								(new File(local48[local90] + local73[local80])).mkdir();
								if (arg0 != null) {
									(new File(local48[local90] + local73[local80] + "/" + arg0)).mkdir();
								}
								local127 = new RandomAccessFile(local132, "rw");
								@Pc(211) int local211 = local127.read();
								local127.seek(0L);
								local127.write(local211);
								local127.seek(0L);
								local127.close();
								aHashtable12.put(arg1, local132);
								return local132;
							}
						}
					} catch (@Pc(230) Exception local230) {
						try {
							if (local127 != null) {
								local127.close();
							}
						} catch (@Pc(239) Exception local239) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "loader!lp", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;I)Lloader!hd;")
	private static Class326 method8046(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		@Pc(19) String local19;
		if (arg2 == 33) {
			local19 = "jagex_" + arg0 + "_preferences" + arg1 + "_rc.dat";
		} else if (arg2 == 34) {
			local19 = "jagex_" + arg0 + "_preferences" + arg1 + "_wip.dat";
		} else {
			local19 = "jagex_" + arg0 + "_preferences" + arg1 + ".dat";
		}
		@Pc(89) String[] local89 = new String[] { "c:/rscache/", "/rscache/", aString93, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(91) int local91 = 0; local91 < local89.length; local91++) {
			@Pc(103) String local103 = local89[local91];
			if (local103.length() <= 0 || (new File(local103)).exists()) {
				try {
					return new Class326(new File(local103, local19), "rw", 10000L);
				} catch (@Pc(130) Exception local130) {
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "loader!lp", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class327(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		aString98 = "1.1";
		this.anInt9493 = arg1;
		this.aString96 = arg2;
		aString97 = "Unknown";
		this.anApplet3 = arg0;
		try {
			aString97 = System.getProperty("java.vendor");
			aString98 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			aString95 = System.getProperty("os.name");
		} catch (@Pc(48) Exception local48) {
			aString95 = "Unknown";
		}
		aString91 = aString95.toLowerCase();
		try {
			aString92 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(59) Exception local59) {
			aString92 = "";
		}
		try {
			aString94 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(67) Exception local67) {
			aString94 = "";
		}
		try {
			aString93 = System.getProperty("user.home");
			if (aString93 != null) {
				aString93 = aString93 + "/";
			}
		} catch (@Pc(85) Exception local85) {
		}
		if (aString93 == null) {
			aString93 = "~/";
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
		} catch (@Pc(123) Exception local123) {
		}
		try {
			if (arg0 == null) {
				aMethod3 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				aMethod3 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(151) Exception local151) {
		}
		this.aClass326_2 = new Class326(method8027(null, "random.dat", this.anInt9493), "rw", 25L);
		this.aClass326_1 = new Class326(this.method8055("main_file_cache.dat2", 0), "rw", 209715200L);
		this.aClass326_3 = new Class326(this.method8055("main_file_cache.idx255", 0), "rw", 1048576L);
		this.aClass326Array1 = new Class326[arg3];
		for (@Pc(192) int local192 = 0; local192 < arg3; local192++) {
			this.aClass326Array1[local192] = new Class326(this.method8055("main_file_cache.idx" + local192, 0), "rw", 1048576L);
		}
		try {
			this.aClass321_1 = new Class321();
		} catch (@Pc(224) Throwable local224) {
		}
		try {
			this.aClass322_1 = new Class322();
		} catch (@Pc(231) Throwable local231) {
		}
		this.aBoolean661 = false;
		this.aThread6 = new Thread(this);
		this.aThread6.setPriority(10);
		this.aThread6.setDaemon(true);
		this.aThread6.start();
	}

	@OriginalMember(owner = "loader!lp", name = "c", descriptor = "(I)Lloader!qo;")
	private Class328 method8028(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			this.method8052(-10, null, -124, -123);
		}
		return this.method8052(0, null, 0, 18);
	}

	@OriginalMember(owner = "loader!lp", name = "a", descriptor = "(Ljava/awt/Component;Ljava/awt/Point;I[III)Lloader!qo;")
	private Class328 method8029(@OriginalArg(0) Component arg0, @OriginalArg(1) Point arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg2 >= -75) {
			this.method8038(null, null, null);
		}
		return this.method8052(arg5, new Object[] { arg0, arg3, arg1 }, arg4, 17);
	}

	@OriginalMember(owner = "loader!lp", name = "a", descriptor = "(IILjava/awt/Component;I)Lloader!qo;")
	private Class328 method8030(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Component arg2, @OriginalArg(3) int arg3) {
		if (arg1 != 10) {
			aString91 = null;
		}
		@Pc(8) Point local8 = arg2.getLocationOnScreen();
		return this.method8052(local8.y + arg0, null, local8.x + arg3, 14);
	}

	@OriginalMember(owner = "loader!lp", name = "b", descriptor = "(B)Lloader!hba;")
	private Interface22 method8031() {
		return this.anInterface22_1;
	}

	@OriginalMember(owner = "loader!lp", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(17) Class328 local17;
			synchronized (this) {
				while (true) {
					if (this.aBoolean661) {
						return;
					}
					if (this.aClass328_1 != null) {
						local17 = this.aClass328_1;
						this.aClass328_1 = this.aClass328_1.aClass328_3;
						if (this.aClass328_1 == null) {
							this.aClass328_2 = null;
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
				@Pc(46) int local46 = local17.anInt9494;
				if (local46 == 1) {
					if (Class323.method8000() < aLong249) {
						throw new IOException();
					}
					local17.anObject19 = new Socket(InetAddress.getByName((String) local17.anObject20), local17.anInt9497);
				} else if (local46 == 2) {
					@Pc(536) Thread local536 = new Thread((Runnable) local17.anObject20);
					local536.setDaemon(true);
					local536.start();
					local536.setPriority(local17.anInt9497);
					local17.anObject19 = local536;
				} else if (local46 == 4) {
					if (Class323.method8000() < aLong249) {
						throw new IOException();
					}
					local17.anObject19 = new DataInputStream(((URL) local17.anObject20).openStream());
				} else {
					@Pc(95) Object[] local95;
					if (local46 == 8) {
						local95 = (Object[]) local17.anObject20;
						if (((Class) local95[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local17.anObject19 = ((Class) local95[0]).getDeclaredMethod((String) local95[1], (Class[]) local95[2]);
					} else if (local46 == 9) {
						local95 = (Object[]) local17.anObject20;
						if (((Class) local95[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local17.anObject19 = ((Class) local95[0]).getDeclaredField((String) local95[1]);
					} else if (local46 == 18) {
						@Pc(125) Clipboard local125 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local17.anObject19 = local125.getContents(null);
					} else if (local46 == 19) {
						@Pc(469) Transferable local469 = (Transferable) local17.anObject20;
						@Pc(472) Clipboard local472 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local472.setContents(local469, null);
					} else {
						@Pc(187) String local187;
						if (local46 == 3) {
							if (Class323.method8000() < aLong249) {
								throw new IOException();
							}
							local187 = (local17.anInt9497 >> 24 & 0xFF) + "." + (local17.anInt9497 >> 16 & 0xFF) + "." + (local17.anInt9497 >> 8 & 0xFF) + "." + (local17.anInt9497 & 0xFF);
							local17.anObject19 = InetAddress.getByName(local187).getHostName();
						} else if (local46 == 21) {
							if (Class323.method8000() < aLong249) {
								throw new IOException();
							}
							local17.anObject19 = InetAddress.getByName((String) local17.anObject20).getAddress();
						} else if (local46 == 5) {
							local17.anObject19 = this.aClass321_1.method7994();
						} else if (local46 == 6) {
							@Pc(430) Frame local430 = new Frame("Jagex Full Screen");
							local17.anObject19 = local430;
							local430.setResizable(false);
							this.aClass321_1.method7991(local17.anInt9495 >> 16, local17.anInt9495 & 0xFFFF, local17.anInt9497 & 0xFFFF, local17.anInt9497 >>> 16, local430);
						} else if (local46 == 7) {
							this.aClass321_1.method7993();
						} else {
							@Pc(247) Class326 local247;
							if (local46 == 12) {
								local247 = method8046(this.aString96, (String) local17.anObject20, this.anInt9493);
								local17.anObject19 = local247;
							} else if (local46 == 13) {
								local247 = method8046("", (String) local17.anObject20, this.anInt9493);
								local17.anObject19 = local247;
							} else if (local46 == 14) {
								@Pc(275) int local275 = local17.anInt9497;
								@Pc(278) int local278 = local17.anInt9495;
								this.aClass322_1.method7997(local278, local275);
							} else if (local46 == 15) {
								@Pc(300) boolean local300 = local17.anInt9497 != 0;
								@Pc(304) Component local304 = (Component) local17.anObject20;
								this.aClass322_1.method7998(local300, local304);
							} else if (local46 == 17) {
								local95 = (Object[]) local17.anObject20;
								this.aClass322_1.method7999(local17.anInt9495, (Component) local95[0], local17.anInt9497, (int[]) local95[1], (Point) local95[2]);
							} else if (local46 == 16) {
								try {
									if (!aString91.startsWith("win")) {
										throw new Exception();
									}
									local187 = (String) local17.anObject20;
									if (!local187.startsWith("http://") && !local187.startsWith("https://")) {
										throw new Exception();
									}
									@Pc(346) String local346 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
									for (@Pc(348) int local348 = 0; local348 < local187.length(); local348++) {
										if (local346.indexOf(local187.charAt(local348)) == -1) {
											throw new Exception();
										}
									}
									Runtime.getRuntime().exec("cmd /c start \"j\" \"" + local187 + "\"");
									local17.anObject19 = null;
								} catch (@Pc(388) Exception local388) {
									local17.anObject19 = local388;
									throw local388;
								}
							} else {
								throw new Exception("");
							}
						}
					}
				}
				local17.anInt9496 = 1;
			} catch (@Pc(553) ThreadDeath local553) {
				throw local553;
			} catch (@Pc(556) Throwable local556) {
				local17.anInt9496 = 2;
			}
			synchronized (local17) {
				local17.notify();
			}
		}
	}

	@OriginalMember(owner = "loader!lp", name = "b", descriptor = "(I)Lloader!qo;")
	private Class328 method8032() {
		return this.method8052(0, null, 0, 5);
	}

	@OriginalMember(owner = "loader!lp", name = "a", descriptor = "(BLjava/lang/String;)Lloader!qo;")
	private Class328 method8033(@OriginalArg(1) String arg0) {
		return this.method8052(0, arg0, 0, 21);
	}

	@OriginalMember(owner = "loader!lp", name = "c", descriptor = "(Ljava/lang/String;I)Lloader!qo;")
	private Class328 method8034(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		return arg1 <= 52 ? (Class328) null : this.method8052(0, arg0, 0, 16);
	}

	@OriginalMember(owner = "loader!lp", name = "a", descriptor = "(ILjava/awt/datatransfer/Transferable;)Lloader!qo;")
	private Class328 method8035(@OriginalArg(0) int arg0, @OriginalArg(1) Transferable arg1) {
		if (arg0 != 0) {
			this.method8041(null, -83, null);
		}
		return this.method8052(0, arg1, 0, 19);
	}

	@OriginalMember(owner = "loader!lp", name = "a", descriptor = "(BLjava/net/URL;)Lloader!qo;")
	private Class328 method8036(@OriginalArg(0) byte arg0, @OriginalArg(1) URL arg1) {
		return arg0 <= 107 ? (Class328) null : this.method8052(0, arg1, 0, 4);
	}

	@OriginalMember(owner = "loader!lp", name = "a", descriptor = "(II)Lloader!qo;")
	private Class328 method8037(@OriginalArg(1) int arg0) {
		return this.method8052(0, null, arg0, 3);
	}

	@OriginalMember(owner = "loader!lp", name = "a", descriptor = "(BLjava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;)Lloader!qo;")
	private Class328 method8038(@OriginalArg(1) String arg0, @OriginalArg(2) Class[] arg1, @OriginalArg(3) Class arg2) {
		return this.method8052(0, new Object[] { arg2, arg0, arg1 }, 0, 8);
	}

	@OriginalMember(owner = "loader!lp", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/Class;)Lloader!qo;")
	private Class328 method8039(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class arg2) {
		if (arg1 != 0) {
			this.method8036((byte) 67, null);
		}
		return this.method8052(0, new Object[] { arg2, arg0 }, 0, 9);
	}

	@OriginalMember(owner = "loader!lp", name = "d", descriptor = "(I)V")
	private void method8040(@OriginalArg(0) int arg0) {
		aLong249 = Class323.method8000() + 5000L;
		if (arg0 != 5000) {
			this.aClass328_2 = null;
		}
	}

	@OriginalMember(owner = "loader!lp", name = "a", descriptor = "(Ljava/io/File;I[B)Z")
	private boolean method8041(@OriginalArg(0) File arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg0);
			local4.write(arg2, arg1, arg2.length);
			local4.close();
			return true;
		} catch (@Pc(15) IOException local15) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "loader!lp", name = "a", descriptor = "(ILjava/awt/Frame;)Lloader!qo;")
	private Class328 method8042(@OriginalArg(0) int arg0, @OriginalArg(1) Frame arg1) {
		if (arg0 != 0) {
			this.method8043(null, 119, -119, 14);
		}
		return this.method8052(0, arg1, 0, 7);
	}

	@OriginalMember(owner = "loader!lp", name = "a", descriptor = "(Ljava/lang/Object;IIII)Lloader!qo;")
	private Class328 method8043(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(3) Class328 local3 = new Class328();
		synchronized (local3) {
			local3.anObject20 = arg0;
			local3.anInt9495 = arg1;
			local3.anInt9494 = arg2;
			local3.anInt9497 = arg3;
			synchronized (this) {
				if (this.aClass328_2 == null) {
					this.aClass328_2 = this.aClass328_1 = local3;
				} else {
					this.aClass328_2.aClass328_3 = local3;
					this.aClass328_2 = local3;
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

	@OriginalMember(owner = "loader!lp", name = "a", descriptor = "(I)V")
	private void method8044(@OriginalArg(0) int arg0) {
		synchronized (this) {
			this.aBoolean661 = true;
			this.notifyAll();
			if (arg0 >= -64) {
				this.method8028(-43);
			}
		}
		try {
			this.aThread6.join();
		} catch (@Pc(28) InterruptedException local28) {
		}
		if (this.aClass326_1 != null) {
			try {
				this.aClass326_1.method8019();
			} catch (@Pc(38) IOException local38) {
			}
		}
		if (this.aClass326_3 != null) {
			try {
				this.aClass326_3.method8019();
			} catch (@Pc(47) IOException local47) {
			}
		}
		if (this.aClass326Array1 != null) {
			for (@Pc(52) int local52 = 0; local52 < this.aClass326Array1.length; local52++) {
				if (this.aClass326Array1[local52] != null) {
					try {
						this.aClass326Array1[local52].method8019();
					} catch (@Pc(71) IOException local71) {
					}
				}
			}
		}
		if (this.aClass326_2 != null) {
			try {
				this.aClass326_2.method8019();
			} catch (@Pc(82) IOException local82) {
			}
		}
	}

	@OriginalMember(owner = "loader!lp", name = "a", descriptor = "(Ljava/lang/String;ZZ)Lloader!qo;")
	private Class328 method8045(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		if (arg1) {
			return arg2 ? this.method8052(0, arg0, 0, 12) : this.method8052(0, arg0, 0, 13);
		} else {
			return (Class328) null;
		}
	}

	@OriginalMember(owner = "loader!lp", name = "a", descriptor = "(IIIII)Lloader!qo;")
	private Class328 method8047(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return arg1 < 29 ? (Class328) null : this.method8052((arg3 << 16) + arg4, null, (arg0 << 16) + arg2, 6);
	}

	@OriginalMember(owner = "loader!lp", name = "a", descriptor = "(IZLjava/awt/Component;)Lloader!qo;")
	private Class328 method8048(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Component arg2) {
		if (arg0 < 83) {
			this.method8033(null);
		}
		return this.method8052(0, arg2, arg1 ? 1 : 0, 15);
	}

	@OriginalMember(owner = "loader!lp", name = "a", descriptor = "(ILjava/lang/Class;)V")
	private void method8049(@OriginalArg(0) int arg0, @OriginalArg(1) Class arg1) throws Exception {
		@Pc(12) Class[] local12 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
		@Pc(14) Runtime local14 = Runtime.getRuntime();
		@Pc(25) Method local25 = Class.forName("java.lang.reflect.Method").getMethod("setAccessible", Boolean.TYPE);
		if (arg0 != 13558) {
			this.run();
		}
		@Pc(40) Method local40;
		if (!aString91.startsWith("mac")) {
			local40 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", local12);
			local25.invoke(local40, Boolean.TRUE);
			local40.invoke(local14, arg1, "jawt");
			local25.invoke(local40, Boolean.FALSE);
		}
		local40 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local12);
		local25.invoke(local40, Boolean.TRUE);
		if (!aString91.startsWith("win")) {
			throw new Exception();
		}
		local40.invoke(local14, arg1, this.method8055("sw3d.dll", arg0 ^ 0x34F6).toString());
		local25.invoke(local40, Boolean.FALSE);
	}

	@OriginalMember(owner = "loader!lp", name = "a", descriptor = "(Ljava/lang/String;II)Lloader!qo;")
	private Class328 method8050(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 != 0) {
			this.run();
		}
		return this.method8052(0, arg0, arg1, 1);
	}

	@OriginalMember(owner = "loader!lp", name = "b", descriptor = "(Ljava/lang/String;I)[B")
	private byte[] method8051(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (arg1 > -46) {
			this.method8038(null, null, null);
		}
		@Pc(20) Class328 local20 = this.method8043(arg0, 0, 21, 0);
		return (byte[]) local20.anObject19;
	}

	@OriginalMember(owner = "loader!lp", name = "a", descriptor = "(ILjava/lang/Object;IIB)Lloader!qo;")
	private Class328 method8052(@OriginalArg(0) int arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) Class328 local3 = new Class328();
		local3.anObject20 = arg1;
		local3.anInt9495 = arg0;
		local3.anInt9494 = arg3;
		local3.anInt9497 = arg2;
		synchronized (this) {
			if (this.aClass328_2 == null) {
				this.aClass328_2 = this.aClass328_1 = local3;
			} else {
				this.aClass328_2.aClass328_3 = local3;
				this.aClass328_2 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "loader!lp", name = "a", descriptor = "(B)Z")
	private boolean method8053(@OriginalArg(0) byte arg0) {
		if (arg0 == -100) {
			return this.aClass321_1 != null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "loader!lp", name = "a", descriptor = "(IILjava/lang/Runnable;)Lloader!qo;")
	private Class328 method8054(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Runnable arg2) {
		if (arg0 != 1406) {
			aHashtable12 = null;
		}
		return this.method8052(0, arg2, arg1, 2);
	}

	@OriginalMember(owner = "loader!lp", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/io/File;")
	public File method8055(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		return method8027(this.aString96, arg0, this.anInt9493);
	}
}
