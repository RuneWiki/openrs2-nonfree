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

@OriginalClass("loader!uf")
public final class Class328 implements Runnable {

	@OriginalMember(owner = "loader!uf", name = "h", descriptor = "Ljava/lang/String;")
	private static String aString221;

	@OriginalMember(owner = "loader!uf", name = "s", descriptor = "Ljava/lang/String;")
	private static String aString222;

	@OriginalMember(owner = "loader!uf", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString223;

	@OriginalMember(owner = "loader!uf", name = "a", descriptor = "Ljava/lang/String;")
	private static String aString224;

	@OriginalMember(owner = "loader!uf", name = "r", descriptor = "Ljava/lang/String;")
	private static String aString225;

	@OriginalMember(owner = "loader!uf", name = "d", descriptor = "Ljava/lang/String;")
	private static String aString226;

	@OriginalMember(owner = "loader!uf", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString228;

	@OriginalMember(owner = "loader!uf", name = "y", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod3;

	@OriginalMember(owner = "loader!uf", name = "w", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod4;

	@OriginalMember(owner = "loader!uf", name = "p", descriptor = "I")
	private static final int anInt9427 = 1;

	@OriginalMember(owner = "loader!uf", name = "q", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable9 = new Hashtable(16);

	@OriginalMember(owner = "loader!uf", name = "x", descriptor = "J")
	private static volatile long aLong249 = 0L;

	@OriginalMember(owner = "loader!uf", name = "j", descriptor = "Lloader!ap;")
	private Interface21 anInterface21_1;

	@OriginalMember(owner = "loader!uf", name = "f", descriptor = "Lloader!in;")
	private Class327 aClass327_1 = null;

	@OriginalMember(owner = "loader!uf", name = "l", descriptor = "Lloader!bca;")
	private Class321 aClass321_2 = null;

	@OriginalMember(owner = "loader!uf", name = "k", descriptor = "Lloader!in;")
	private Class327 aClass327_2 = null;

	@OriginalMember(owner = "loader!uf", name = "e", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3 = null;

	@OriginalMember(owner = "loader!uf", name = "o", descriptor = "Z")
	private boolean aBoolean685 = false;

	@OriginalMember(owner = "loader!uf", name = "v", descriptor = "Lloader!in;")
	private Class327 aClass327_3 = null;

	@OriginalMember(owner = "loader!uf", name = "z", descriptor = "Lloader!bca;")
	private Class321 aClass321_3 = null;

	@OriginalMember(owner = "loader!uf", name = "t", descriptor = "I")
	private int anInt9428;

	@OriginalMember(owner = "loader!uf", name = "u", descriptor = "Ljava/lang/String;")
	private String aString227;

	@OriginalMember(owner = "loader!uf", name = "m", descriptor = "Ljava/awt/EventQueue;")
	private EventQueue anEventQueue2;

	@OriginalMember(owner = "loader!uf", name = "g", descriptor = "[Lloader!in;")
	private final Class327[] aClass327Array1;

	@OriginalMember(owner = "loader!uf", name = "A", descriptor = "Lloader!c;")
	private Class322 aClass322_1;

	@OriginalMember(owner = "loader!uf", name = "i", descriptor = "Lloader!g;")
	private Class326 aClass326_1;

	@OriginalMember(owner = "loader!uf", name = "b", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread6;

	@OriginalMember(owner = "loader!uf", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;I)Ljava/io/File;")
	private static File method7860(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		@Pc(4) File local4 = (File) aHashtable9.get(arg0);
		if (local4 != null) {
			return local4;
		}
		@Pc(44) String[] local44 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString221, "/tmp/", "" };
		@Pc(77) String[] local77 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
		for (@Pc(79) int local79 = 0; local79 < 2; local79++) {
			for (@Pc(86) int local86 = 0; local86 < local77.length; local86++) {
				for (@Pc(96) int local96 = 0; local96 < local44.length; local96++) {
					@Pc(135) String local135 = local44[local96] + local77[local86] + "/" + (arg1 == null ? "" : arg1 + "/") + arg0;
					@Pc(137) RandomAccessFile local137 = null;
					try {
						@Pc(142) File local142 = new File(local135);
						if (local79 != 0 || local142.exists()) {
							@Pc(153) String local153 = local44[local96];
							if (local79 != 1 || local153.length() <= 0 || (new File(local153)).exists()) {
								(new File(local44[local96] + local77[local86])).mkdir();
								if (arg1 != null) {
									(new File(local44[local96] + local77[local86] + "/" + arg1)).mkdir();
								}
								local137 = new RandomAccessFile(local142, "rw");
								@Pc(222) int local222 = local137.read();
								local137.seek(0L);
								local137.write(local222);
								local137.seek(0L);
								local137.close();
								aHashtable9.put(arg0, local142);
								return local142;
							}
						}
					} catch (@Pc(241) Exception local241) {
						try {
							if (local137 != null) {
								local137.close();
							}
						} catch (@Pc(250) Exception local250) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "loader!uf", name = "a", descriptor = "(BILjava/lang/String;Ljava/lang/String;)Lloader!in;")
	private static Class327 method7867(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		@Pc(22) String local22;
		if (arg0 == 33) {
			local22 = "jagex_" + arg2 + "_preferences" + arg1 + "_rc.dat";
		} else if (arg0 == 34) {
			local22 = "jagex_" + arg2 + "_preferences" + arg1 + "_wip.dat";
		} else {
			local22 = "jagex_" + arg2 + "_preferences" + arg1 + ".dat";
		}
		@Pc(89) String[] local89 = new String[] { "c:/rscache/", "/rscache/", aString221, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(91) int local91 = 0; local91 < local89.length; local91++) {
			@Pc(103) String local103 = local89[local91];
			if (local103.length() <= 0 || (new File(local103)).exists()) {
				try {
					return new Class327(new File(local103, local22), "rw", 10000L);
				} catch (@Pc(127) Exception local127) {
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "loader!uf", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class328(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		this.anApplet3 = arg0;
		this.anInt9428 = arg1;
		this.aString227 = arg2;
		aString223 = "Unknown";
		aString228 = "1.1";
		try {
			aString223 = System.getProperty("java.vendor");
			aString228 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			aString226 = System.getProperty("os.name");
		} catch (@Pc(48) Exception local48) {
			aString226 = "Unknown";
		}
		aString225 = aString226.toLowerCase();
		try {
			aString224 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(59) Exception local59) {
			aString224 = "";
		}
		try {
			aString222 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(67) Exception local67) {
			aString222 = "";
		}
		try {
			aString221 = System.getProperty("user.home");
			if (aString221 != null) {
				aString221 = aString221 + "/";
			}
		} catch (@Pc(86) Exception local86) {
		}
		if (aString221 == null) {
			aString221 = "~/";
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
		} catch (@Pc(152) Exception local152) {
		}
		this.aClass327_2 = new Class327(method7860("random.dat", null, this.anInt9428), "rw", 25L);
		this.aClass327_1 = new Class327(this.method7880("main_file_cache.dat2"), "rw", 209715200L);
		this.aClass327_3 = new Class327(this.method7880("main_file_cache.idx255"), "rw", 1048576L);
		this.aClass327Array1 = new Class327[arg3];
		for (@Pc(193) int local193 = 0; local193 < arg3; local193++) {
			this.aClass327Array1[local193] = new Class327(this.method7880("main_file_cache.idx" + local193), "rw", 1048576L);
		}
		try {
			this.aClass322_1 = new Class322();
		} catch (@Pc(229) Throwable local229) {
		}
		try {
			this.aClass326_1 = new Class326();
		} catch (@Pc(236) Throwable local236) {
		}
		this.aBoolean685 = false;
		this.aThread6 = new Thread(this);
		this.aThread6.setPriority(10);
		this.aThread6.setDaemon(true);
		this.aThread6.start();
	}

	@OriginalMember(owner = "loader!uf", name = "a", descriptor = "(IIBII)Lloader!bca;")
	private Class321 method7859(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 <= 75) {
			this.method7872((byte) 33);
		}
		return this.method7866(arg1 + (arg0 << 16), arg4 + (arg3 << 16), -71, 6, null);
	}

	@OriginalMember(owner = "loader!uf", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(18) Class321 local18;
			synchronized (this) {
				while (true) {
					if (this.aBoolean685) {
						return;
					}
					if (this.aClass321_3 != null) {
						local18 = this.aClass321_3;
						this.aClass321_3 = this.aClass321_3.aClass321_1;
						if (this.aClass321_3 == null) {
							this.aClass321_2 = null;
						}
						break;
					}
					try {
						this.wait();
					} catch (@Pc(36) InterruptedException local36) {
					}
				}
			}
			try {
				@Pc(48) int local48 = local18.anInt9420;
				if (local48 == 1) {
					if (aLong249 > Class325.method7843()) {
						throw new IOException();
					}
					local18.anObject19 = new Socket(InetAddress.getByName((String) local18.anObject20), local18.anInt9418);
				} else if (local48 == 2) {
					@Pc(541) Thread local541 = new Thread((Runnable) local18.anObject20);
					local541.setDaemon(true);
					local541.start();
					local541.setPriority(local18.anInt9418);
					local18.anObject19 = local541;
				} else if (local48 == 4) {
					if (aLong249 > Class325.method7843()) {
						throw new IOException();
					}
					local18.anObject19 = new DataInputStream(((URL) local18.anObject20).openStream());
				} else {
					@Pc(121) Object[] local121;
					if (local48 == 8) {
						local121 = (Object[]) local18.anObject20;
						if (((Class) local121[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local18.anObject19 = ((Class) local121[0]).getDeclaredMethod((String) local121[1], (Class[]) local121[2]);
					} else if (local48 == 9) {
						local121 = (Object[]) local18.anObject20;
						if (((Class) local121[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local18.anObject19 = ((Class) local121[0]).getDeclaredField((String) local121[1]);
					} else if (local48 == 18) {
						@Pc(500) Clipboard local500 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local18.anObject19 = local500.getContents(null);
					} else if (local48 == 19) {
						@Pc(163) Transferable local163 = (Transferable) local18.anObject20;
						@Pc(166) Clipboard local166 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local166.setContents(local163, null);
					} else {
						@Pc(300) String local300;
						if (local48 == 3) {
							if (aLong249 > Class325.method7843()) {
								throw new IOException();
							}
							local300 = (local18.anInt9418 >> 24 & 0xFF) + "." + (local18.anInt9418 >> 16 & 0xFF) + "." + (local18.anInt9418 >> 8 & 0xFF) + "." + (local18.anInt9418 & 0xFF);
							local18.anObject19 = InetAddress.getByName(local300).getHostName();
						} else if (local48 == 21) {
							if (Class325.method7843() < aLong249) {
								throw new IOException();
							}
							local18.anObject19 = InetAddress.getByName((String) local18.anObject20).getAddress();
						} else if (local48 == 5) {
							local18.anObject19 = this.aClass322_1.method7840();
						} else if (local48 == 6) {
							@Pc(211) Frame local211 = new Frame("Jagex Full Screen");
							local18.anObject19 = local211;
							local211.setResizable(false);
							this.aClass322_1.method7839(local18.anInt9418 & 0xFFFF, local18.anInt9418 >>> 16, local18.anInt9419 >> 16, local211, local18.anInt9419 & 0xFFFF);
						} else if (local48 == 7) {
							this.aClass322_1.method7837();
						} else {
							@Pc(264) Class327 local264;
							if (local48 == 12) {
								local264 = method7867(this.anInt9428, (String) local18.anObject20, this.aString227);
								local18.anObject19 = local264;
							} else if (local48 == 13) {
								local264 = method7867(this.anInt9428, (String) local18.anObject20, "");
								local18.anObject19 = local264;
							} else if (local48 == 14) {
								@Pc(413) int local413 = local18.anInt9418;
								@Pc(416) int local416 = local18.anInt9419;
								this.aClass326_1.method7844(local413, local416);
							} else if (local48 == 15) {
								@Pc(399) boolean local399 = local18.anInt9418 != 0;
								@Pc(403) Component local403 = (Component) local18.anObject20;
								this.aClass326_1.method7845(local399, local403);
							} else if (local48 == 17) {
								local121 = (Object[]) local18.anObject20;
								this.aClass326_1.method7846(local18.anInt9419, (int[]) local121[1], (Point) local121[2], local18.anInt9418, (Component) local121[0]);
							} else if (local48 == 16) {
								try {
									if (!aString225.startsWith("win")) {
										throw new Exception();
									}
									local300 = (String) local18.anObject20;
									if (!local300.startsWith("http://") && !local300.startsWith("https://")) {
										throw new Exception();
									}
									@Pc(314) String local314 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
									@Pc(316) int local316 = 0;
									while (true) {
										if (local316 >= local300.length()) {
											Runtime.getRuntime().exec("cmd /c start \"j\" \"" + local300 + "\"");
											local18.anObject19 = null;
											break;
										}
										if (local314.indexOf(local300.charAt(local316)) == -1) {
											throw new Exception();
										}
										local316++;
									}
								} catch (@Pc(357) Exception local357) {
									local18.anObject19 = local357;
									throw local357;
								}
							} else {
								throw new Exception("");
							}
						}
					}
				}
				local18.anInt9417 = 1;
			} catch (@Pc(558) ThreadDeath local558) {
				throw local558;
			} catch (@Pc(561) Throwable local561) {
				local18.anInt9417 = 2;
			}
			synchronized (local18) {
				local18.notify();
			}
		}
	}

	@OriginalMember(owner = "loader!uf", name = "a", descriptor = "(Ljava/awt/Component;IZ)Lloader!bca;")
	private Class321 method7861(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return arg1 < 92 ? (Class321) null : this.method7866(0, arg2 ? 1 : 0, -96, 15, arg0);
	}

	@OriginalMember(owner = "loader!uf", name = "c", descriptor = "(I)V")
	private void method7862(@OriginalArg(0) int arg0) {
		synchronized (this) {
			this.aBoolean685 = true;
			this.notifyAll();
		}
		try {
			this.aThread6.join();
		} catch (@Pc(21) InterruptedException local21) {
		}
		if (this.aClass327_1 != null) {
			try {
				this.aClass327_1.method7848();
			} catch (@Pc(31) IOException local31) {
			}
		}
		if (this.aClass327_3 != null) {
			try {
				this.aClass327_3.method7848();
			} catch (@Pc(40) IOException local40) {
			}
		}
		if (this.aClass327Array1 != null) {
			for (@Pc(45) int local45 = 0; local45 < this.aClass327Array1.length; local45++) {
				if (this.aClass327Array1[local45] != null) {
					try {
						this.aClass327Array1[local45].method7848();
					} catch (@Pc(63) IOException local63) {
					}
				}
			}
		}
		if (arg0 <= 27) {
			this.method7882(22, (byte) 57, -120, null);
		}
		if (this.aClass327_2 != null) {
			try {
				this.aClass327_2.method7848();
			} catch (@Pc(87) IOException local87) {
			}
		}
	}

	@OriginalMember(owner = "loader!uf", name = "a", descriptor = "(Ljava/lang/Class;B)V")
	private void method7863(@OriginalArg(0) Class arg0, @OriginalArg(1) byte arg1) throws Exception {
		@Pc(12) Class[] local12 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
		@Pc(14) Runtime local14 = Runtime.getRuntime();
		@Pc(25) Method local25 = Class.forName("java.lang.reflect.Method").getMethod("setAccessible", Boolean.TYPE);
		@Pc(36) Method local36;
		if (!aString225.startsWith("mac")) {
			local36 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", local12);
			local25.invoke(local36, Boolean.TRUE);
			local36.invoke(local14, arg0, "jawt");
			local25.invoke(local36, Boolean.FALSE);
		}
		local36 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local12);
		local25.invoke(local36, Boolean.TRUE);
		if (!aString225.startsWith("win")) {
			throw new Exception();
		}
		local36.invoke(local14, arg0, this.method7880("sw3d.dll").toString());
		if (arg1 == 45) {
			local25.invoke(local36, Boolean.FALSE);
		}
	}

	@OriginalMember(owner = "loader!uf", name = "a", descriptor = "(I)V")
	private void method7864(@OriginalArg(0) int arg0) {
		aLong249 = Class325.method7843() + 5000L;
		if (arg0 != 0) {
			this.method7881(66);
		}
	}

	@OriginalMember(owner = "loader!uf", name = "a", descriptor = "([Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;I)Lloader!bca;")
	private Class321 method7865(@OriginalArg(0) Class[] arg0, @OriginalArg(1) Class arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) {
		return arg3 >= -127 ? (Class321) null : this.method7866(0, 0, -65, 8, new Object[] { arg1, arg2, arg0 });
	}

	@OriginalMember(owner = "loader!uf", name = "a", descriptor = "(IIIILjava/lang/Object;)Lloader!bca;")
	private Class321 method7866(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Object arg4) {
		@Pc(3) Class321 local3 = new Class321();
		local3.anInt9418 = arg1;
		local3.anObject20 = arg4;
		local3.anInt9420 = arg3;
		local3.anInt9419 = arg0;
		synchronized (this) {
			if (this.aClass321_2 == null) {
				this.aClass321_2 = this.aClass321_3 = local3;
			} else {
				this.aClass321_2.aClass321_1 = local3;
				this.aClass321_2 = local3;
			}
			this.notify();
			if (arg2 > -51) {
				this.method7869(null, -45);
			}
			return local3;
		}
	}

	@OriginalMember(owner = "loader!uf", name = "a", descriptor = "(Ljava/net/URL;I)Lloader!bca;")
	private Class321 method7868(@OriginalArg(0) URL arg0) {
		return this.method7866(0, 0, -67, 4, arg0);
	}

	@OriginalMember(owner = "loader!uf", name = "a", descriptor = "(Ljava/lang/String;I)Lloader!bca;")
	private Class321 method7869(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		return arg1 == 0 ? this.method7866(0, 0, -128, 21, arg0) : (Class321) null;
	}

	@OriginalMember(owner = "loader!uf", name = "a", descriptor = "(Ljava/lang/String;IZ)Lloader!bca;")
	private Class321 method7870(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (arg1 <= 3) {
			this.anEventQueue2 = null;
		}
		return arg2 ? this.method7866(0, 0, -89, 12, arg0) : this.method7866(0, 0, -115, 13, arg0);
	}

	@OriginalMember(owner = "loader!uf", name = "a", descriptor = "(Ljava/lang/String;B)[B")
	private byte[] method7871(@OriginalArg(0) String arg0, @OriginalArg(1) byte arg1) {
		if (arg1 >= -50) {
			this.method7879(76, (byte) 60, null);
		}
		@Pc(17) Class321 local17 = this.method7876(arg0, 21, 0, 0, 0);
		return (byte[]) local17.anObject19;
	}

	@OriginalMember(owner = "loader!uf", name = "b", descriptor = "(B)Z")
	private boolean method7872(@OriginalArg(0) byte arg0) {
		if (arg0 > -104) {
			this.anInt9428 = 40;
		}
		return this.aClass322_1 != null;
	}

	@OriginalMember(owner = "loader!uf", name = "a", descriptor = "(Ljava/awt/datatransfer/Transferable;I)Lloader!bca;")
	private Class321 method7873(@OriginalArg(0) Transferable arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 2444) {
			this.method7876(null, 28, -10, 114, -25);
		}
		return this.method7866(0, 0, -60, 19, arg0);
	}

	@OriginalMember(owner = "loader!uf", name = "a", descriptor = "(B)Lloader!bca;")
	private Class321 method7874() {
		return this.method7866(0, 0, -55, 5, null);
	}

	@OriginalMember(owner = "loader!uf", name = "a", descriptor = "(Ljava/io/File;I[B)Z")
	private boolean method7875(@OriginalArg(0) File arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		try {
			if (arg1 == 2) {
				@Pc(9) FileOutputStream local9 = new FileOutputStream(arg0);
				local9.write(arg2, 0, arg2.length);
				local9.close();
				return true;
			} else {
				return false;
			}
		} catch (@Pc(20) IOException local20) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "loader!uf", name = "a", descriptor = "(Ljava/lang/Object;IIII)Lloader!bca;")
	private Class321 method7876(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(3) Class321 local3 = new Class321();
		synchronized (local3) {
			local3.anInt9418 = arg2;
			local3.anInt9420 = arg1;
			local3.anInt9419 = arg4;
			local3.anObject20 = arg0;
			synchronized (this) {
				if (this.aClass321_2 == null) {
					this.aClass321_2 = this.aClass321_3 = local3;
				} else {
					this.aClass321_2.aClass321_1 = local3;
					this.aClass321_2 = local3;
				}
				this.notify();
			}
			try {
				local3.wait();
			} catch (@Pc(54) InterruptedException local54) {
			}
			if (arg3 != 0) {
				this.aString227 = null;
			}
			return local3;
		}
	}

	@OriginalMember(owner = "loader!uf", name = "a", descriptor = "([ILjava/awt/Point;IILjava/awt/Component;B)Lloader!bca;")
	private Class321 method7877(@OriginalArg(0) int[] arg0, @OriginalArg(1) Point arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Component arg4, @OriginalArg(5) byte arg5) {
		return arg5 == -74 ? this.method7866(arg2, arg3, -54, 17, new Object[] { arg4, arg0, arg1 }) : (Class321) null;
	}

	@OriginalMember(owner = "loader!uf", name = "a", descriptor = "(II)Lloader!bca;")
	private Class321 method7878(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 <= 95 ? (Class321) null : this.method7866(0, arg0, -118, 3, null);
	}

	@OriginalMember(owner = "loader!uf", name = "a", descriptor = "(IBLjava/lang/Runnable;)Lloader!bca;")
	private Class321 method7879(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) Runnable arg2) {
		return arg1 == 26 ? this.method7866(0, arg0, -87, 2, arg2) : (Class321) null;
	}

	@OriginalMember(owner = "loader!uf", name = "b", descriptor = "(Ljava/lang/String;I)Ljava/io/File;")
	public File method7880(@OriginalArg(0) String arg0) {
		return method7860(arg0, this.aString227, this.anInt9428);
	}

	@OriginalMember(owner = "loader!uf", name = "d", descriptor = "(I)Lloader!bca;")
	private Class321 method7881(@OriginalArg(0) int arg0) {
		return arg0 == -30551 ? this.method7866(0, 0, arg0 + 30475, 18, null) : (Class321) null;
	}

	@OriginalMember(owner = "loader!uf", name = "a", descriptor = "(IBILjava/awt/Component;)Lloader!bca;")
	private Class321 method7882(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Component arg3) {
		if (arg1 != 113) {
			this.anInterface21_1 = null;
		}
		@Pc(9) Point local9 = arg3.getLocationOnScreen();
		return this.method7866(arg2 + local9.y, local9.x + arg0, arg1 ^ 0xFFFFFFE2, 14, null);
	}

	@OriginalMember(owner = "loader!uf", name = "a", descriptor = "(ILjava/awt/Frame;)Lloader!bca;")
	private Class321 method7883(@OriginalArg(1) Frame arg0) {
		return this.method7866(0, 0, -91, 7, arg0);
	}

	@OriginalMember(owner = "loader!uf", name = "c", descriptor = "(Ljava/lang/String;I)Lloader!bca;")
	private Class321 method7884(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (arg1 <= 78) {
			this.method7872((byte) -124);
		}
		return this.method7866(0, 0, -73, 16, arg0);
	}

	@OriginalMember(owner = "loader!uf", name = "a", descriptor = "(Ljava/lang/String;BI)Lloader!bca;")
	private Class321 method7885(@OriginalArg(0) String arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2) {
		if (arg1 != -96) {
			this.method7862(-72);
		}
		return this.method7866(0, arg2, -67, 1, arg0);
	}

	@OriginalMember(owner = "loader!uf", name = "b", descriptor = "(I)Lloader!ap;")
	private Interface21 method7886(@OriginalArg(0) int arg0) {
		return arg0 >= -65 ? (Interface21) null : this.anInterface21_1;
	}

	@OriginalMember(owner = "loader!uf", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;I)Lloader!bca;")
	private Class321 method7887(@OriginalArg(0) String arg0, @OriginalArg(1) Class arg1, @OriginalArg(2) int arg2) {
		if (arg2 > -43) {
			this.anApplet3 = null;
		}
		return this.method7866(0, 0, -91, 9, new Object[] { arg1, arg0 });
	}
}
