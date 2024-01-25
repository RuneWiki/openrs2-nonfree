import java.awt.DisplayMode;
import java.awt.Frame;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!a")
public final class Class218 {

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "Ljava/awt/DisplayMode;")
	private DisplayMode aDisplayMode1;

	@OriginalMember(owner = "loader!a", name = "b", descriptor = "Ljava/awt/GraphicsDevice;")
	private GraphicsDevice aGraphicsDevice1;

	@OriginalMember(owner = "loader!a", name = "<init>", descriptor = "()V")
	public Class218() throws Exception {
		@Pc(3) GraphicsEnvironment local3 = GraphicsEnvironment.getLocalGraphicsEnvironment();
		this.aGraphicsDevice1 = local3.getDefaultScreenDevice();
		if (!this.aGraphicsDevice1.isFullScreenSupported()) {
			@Pc(14) GraphicsDevice[] local14 = local3.getScreenDevices();
			for (@Pc(18) int local18 = 0; local18 < local14.length; local18++) {
				@Pc(26) GraphicsDevice local26 = local14[local18];
				if (local26 != null && local26.isFullScreenSupported()) {
					this.aGraphicsDevice1 = local26;
					return;
				}
			}
			throw new Exception();
		}
	}

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(ZLjava/awt/Frame;)V")
	private void method6059(@OriginalArg(1) Frame arg0) {
		@Pc(1) boolean local1 = false;
		try {
			@Pc(6) Field local6 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
			local6.setAccessible(true);
			@Pc(16) boolean local16 = (Boolean) local6.get(this.aGraphicsDevice1);
			if (local16) {
				local6.set(this.aGraphicsDevice1, Boolean.FALSE);
				local1 = true;
			}
		} catch (@Pc(27) Throwable local27) {
		}
		try {
			this.aGraphicsDevice1.setFullScreenWindow(arg0);
		} finally {
			if (local1) {
				try {
					@Pc(56) Field local56 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
					local56.set(this.aGraphicsDevice1, Boolean.TRUE);
				} catch (@Pc(63) Throwable local63) {
				}
			}
		}
	}

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(IILjava/awt/Frame;III)V")
	public void method6060(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Frame arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aDisplayMode1 = this.aGraphicsDevice1.getDisplayMode();
		if (this.aDisplayMode1 == null) {
			throw new NullPointerException();
		}
		arg2.setUndecorated(true);
		arg2.enableInputMethods(false);
		this.method6059(arg2);
		if (arg3 == 0) {
			@Pc(31) int local31 = this.aDisplayMode1.getRefreshRate();
			@Pc(35) DisplayMode[] local35 = this.aGraphicsDevice1.getDisplayModes();
			@Pc(37) boolean local37 = false;
			for (@Pc(39) int local39 = 0; local39 < local35.length; local39++) {
				if (local35[local39].getWidth() == arg1 && local35[local39].getHeight() == arg0 && arg4 == local35[local39].getBitDepth()) {
					@Pc(66) int local66 = local35[local39].getRefreshRate();
					if (!local37 || Math.abs(local66 - local31) < Math.abs(arg3 - local31)) {
						arg3 = local66;
						local37 = true;
					}
				}
			}
			if (!local37) {
				arg3 = local31;
			}
		}
		this.aGraphicsDevice1.setDisplayMode(new DisplayMode(arg1, arg0, arg4, arg3));
	}

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(Z)[I")
	public int[] method6061() {
		@Pc(3) DisplayMode[] local3 = this.aGraphicsDevice1.getDisplayModes();
		@Pc(9) int[] local9 = new int[local3.length << 2];
		for (@Pc(11) int local11 = 0; local11 < local3.length; local11++) {
			local9[local11 << 2] = local3[local11].getWidth();
			local9[(local11 << 2) + 1] = local3[local11].getHeight();
			local9[(local11 << 2) + 2] = local3[local11].getBitDepth();
			local9[(local11 << 2) + 3] = local3[local11].getRefreshRate();
		}
		return local9;
	}

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(B)V")
	public void method6062() {
		if (this.aDisplayMode1 != null) {
			this.aGraphicsDevice1.setDisplayMode(this.aDisplayMode1);
			if (!this.aGraphicsDevice1.getDisplayMode().equals(this.aDisplayMode1)) {
				throw new RuntimeException("Did not return to correct resolution!");
			}
			this.aDisplayMode1 = null;
		}
		this.method6059(null);
	}
}
