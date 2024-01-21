import java.applet.Applet;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.io.File;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!vi")
public final class Class105 implements Runnable {

	@OriginalMember(owner = "loader!vi", name = "r", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod3;

	@OriginalMember(owner = "loader!vi", name = "q", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod4;

	@OriginalMember(owner = "loader!vi", name = "m", descriptor = "Ljava/lang/String;")
	private static String aString8;

	@OriginalMember(owner = "loader!vi", name = "p", descriptor = "Ljava/lang/String;")
	public static String aString9;

	@OriginalMember(owner = "loader!vi", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString10;

	@OriginalMember(owner = "loader!vi", name = "s", descriptor = "I")
	private static final int anInt4716 = 1;

	@OriginalMember(owner = "loader!vi", name = "f", descriptor = "[Lloader!kd;")
	private Class103[] aClass103Array1;

	@OriginalMember(owner = "loader!vi", name = "d", descriptor = "Lloader!di;")
	private Interface4 anInterface4_1;

	@OriginalMember(owner = "loader!vi", name = "i", descriptor = "Ljava/io/File;")
	private File aFile5 = null;

	@OriginalMember(owner = "loader!vi", name = "o", descriptor = "Lloader!qe;")
	private Class104 aClass104_2 = null;

	@OriginalMember(owner = "loader!vi", name = "b", descriptor = "Lloader!kd;")
	private Class103 aClass103_1 = null;

	@OriginalMember(owner = "loader!vi", name = "e", descriptor = "Z")
	private boolean aBoolean237 = false;

	@OriginalMember(owner = "loader!vi", name = "a", descriptor = "Lloader!qe;")
	private Class104 aClass104_3 = null;

	@OriginalMember(owner = "loader!vi", name = "n", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3 = null;

	@OriginalMember(owner = "loader!vi", name = "c", descriptor = "Ljava/io/File;")
	public File aFile6 = null;

	@OriginalMember(owner = "loader!vi", name = "l", descriptor = "Lloader!kd;")
	private Class103 aClass103_2 = null;

	@OriginalMember(owner = "loader!vi", name = "j", descriptor = "Lloader!kd;")
	private Class103 aClass103_3 = null;

	@OriginalMember(owner = "loader!vi", name = "k", descriptor = "Ljava/awt/EventQueue;")
	private EventQueue anEventQueue2;

	@OriginalMember(owner = "loader!vi", name = "h", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread2;

	@OriginalMember(owner = "loader!vi", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
	public Class105(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4) {
		aString10 = "Unknown";
		aString9 = "1.1";
		this.anApplet3 = arg1;
		try {
			aString10 = System.getProperty("java.vendor");
			aString9 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			aString8 = System.getProperty("user.home");
			if (aString8 != null) {
				aString8 = aString8 + "/";
			}
		} catch (@Pc(59) Exception local59) {
		}
		if (aString8 == null) {
			aString8 = "~/";
		}
		try {
			this.anEventQueue2 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(70) Throwable local70) {
		}
		try {
			if (arg1 == null) {
				aMethod4 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				aMethod4 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(97) Exception local97) {
		}
		try {
			if (arg1 == null) {
				aMethod3 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				aMethod3 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(124) Exception local124) {
		}
		this.method3615(arg2, arg3, arg4);
		this.aBoolean237 = false;
		this.aThread2 = new Thread(this);
		this.aThread2.setPriority(10);
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "loader!vi", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(17) Class104 local17;
			synchronized (this) {
				while (true) {
					if (this.aBoolean237) {
						return;
					}
					if (this.aClass104_3 != null) {
						local17 = this.aClass104_3;
						this.aClass104_3 = this.aClass104_3.aClass104_1;
						if (this.aClass104_3 == null) {
							this.aClass104_2 = null;
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
				@Pc(45) int local45 = local17.anInt4713;
				if (local45 == 1) {
					local17.anObject5 = new Socket(InetAddress.getByName((String) local17.anObject6), local17.anInt4715);
				} else if (local45 == 2) {
					@Pc(74) Thread local74 = new Thread((Runnable) local17.anObject6);
					local74.setDaemon(true);
					local74.start();
					local74.setPriority(local17.anInt4715);
					local17.anObject5 = local74;
				} else if (local45 == 4) {
					local17.anObject5 = new DataInputStream(((URL) local17.anObject6).openStream());
				} else {
					@Pc(98) Object[] local98;
					if (local45 == 8) {
						local98 = (Object[]) local17.anObject6;
						if (((Class) local98[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local17.anObject5 = ((Class) local98[0]).getDeclaredMethod((String) local98[1], (Class[]) local98[2]);
					} else if (local45 == 9) {
						local98 = (Object[]) local17.anObject6;
						if (((Class) local98[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local17.anObject5 = ((Class) local98[0]).getDeclaredField((String) local98[1]);
					} else if (local45 == 3) {
						@Pc(202) String local202 = (local17.anInt4715 >> 24 & 0xFF) + "." + (local17.anInt4715 >> 16 & 0xFF) + "." + (local17.anInt4715 >> 8 & 0xFF) + "." + (local17.anInt4715 & 0xFF);
						local17.anObject5 = InetAddress.getByName(local202).getHostName();
					} else {
						throw new Exception();
					}
				}
				local17.anInt4714 = 1;
			} catch (@Pc(222) ThreadDeath local222) {
				throw local222;
			} catch (@Pc(225) Throwable local225) {
				local17.anInt4714 = 2;
			}
		}
	}

	@OriginalMember(owner = "loader!vi", name = "a", descriptor = "(ILjava/lang/String;II)V")
	private void method3615(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		if (arg0 < 32 || arg0 > 34) {
			arg0 = 32;
		}
		@Pc(43) String[] local43 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
		@Pc(78) String[] local78 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString8, "/tmp/", "" };
		for (@Pc(80) int local80 = 0; local80 < 2; local80++) {
			for (@Pc(85) int local85 = 0; local85 < local43.length; local85++) {
				for (@Pc(95) int local95 = 0; local95 < local78.length; local95++) {
					try {
						@Pc(103) String local103 = local78[local95];
						if (local103.length() > 0 && !(new File(local103)).exists()) {
							continue;
						}
						@Pc(131) File local131 = new File(local103 + local43[local85]);
						@Pc(143) boolean local143;
						if (local80 == 1 && !local131.exists()) {
							local143 = local131.mkdir();
							if (!local143) {
								continue;
							}
						}
						@Pc(155) File local155;
						if (this.aClass103_2 == null) {
							try {
								local155 = new File(local131, "random.dat");
								if (local80 == 1 || local155.exists()) {
									this.aClass103_2 = new Class103(local155, "rw", 25L);
								}
							} catch (@Pc(171) Exception local171) {
								this.aClass103_2 = null;
							}
						}
						if (this.aFile5 == null) {
							@Pc(223) int local223;
							try {
								local131 = new File(local131, arg1);
								if (local80 == 1 && !local131.exists()) {
									local143 = local131.mkdir();
									if (!local143) {
										continue;
									}
								}
								local155 = new File(local131, "main_file_cache.dat2");
								if (local80 == 0 && !local155.exists()) {
									continue;
								}
								this.aClass103_3 = new Class103(local155, "rw", 104857600L);
								this.aClass103Array1 = new Class103[24];
								for (local223 = 0; local223 < 24; local223++) {
									this.aClass103Array1[local223] = new Class103(new File(local131, "main_file_cache.idx" + local223), "rw", 1048576L);
								}
								this.aClass103_1 = new Class103(new File(local131, "main_file_cache.idx255"), "rw", 1048576L);
								this.aFile6 = this.aFile5 = local131;
							} catch (@Pc(269) Exception local269) {
								try {
									this.aClass103_3.method3604();
									for (local223 = 0; local223 < 24; local223++) {
										this.aClass103Array1[local223].method3604();
									}
									this.aClass103_1.method3604();
								} catch (@Pc(292) Exception local292) {
								}
								this.aFile6 = this.aFile5 = null;
								this.aClass103_3 = this.aClass103_1 = null;
								this.aClass103Array1 = null;
							}
						}
					} catch (@Pc(309) Exception local309) {
					}
					if (this.aClass103_2 != null && this.aFile5 != null) {
						return;
					}
				}
			}
		}
		if (this.aFile5 == null) {
			throw new RuntimeException();
		}
	}
}
