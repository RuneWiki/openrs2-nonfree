import java.awt.DisplayMode;
import java.awt.Frame;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!e")
public final class Class223 {

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "Ljava/awt/DisplayMode;")
	private DisplayMode aDisplayMode1;

	@OriginalMember(owner = "loader!e", name = "b", descriptor = "Ljava/awt/GraphicsDevice;")
	private GraphicsDevice aGraphicsDevice1;

	@OriginalMember(owner = "loader!e", name = "<init>", descriptor = "()V")
	public Class223() throws Exception {
		@Pc(3) GraphicsEnvironment local3 = GraphicsEnvironment.getLocalGraphicsEnvironment();
		this.aGraphicsDevice1 = local3.getDefaultScreenDevice();
		if (!this.aGraphicsDevice1.isFullScreenSupported()) {
			@Pc(15) GraphicsDevice[] local15 = local3.getScreenDevices();
			for (@Pc(19) int local19 = 0; local19 < local15.length; local19++) {
				@Pc(27) GraphicsDevice local27 = local15[local19];
				if (local27 != null && local27.isFullScreenSupported()) {
					this.aGraphicsDevice1 = local27;
					return;
				}
			}
			throw new Exception();
		}
	}

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "(IILjava/awt/Frame;BII)V")
	public void method5728(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Frame arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.aDisplayMode1 = this.aGraphicsDevice1.getDisplayMode();
		if (this.aDisplayMode1 == null) {
			throw new NullPointerException();
		}
		arg2.setUndecorated(true);
		arg2.enableInputMethods(false);
		this.method5731(arg2);
		if (arg1 == 0) {
			@Pc(36) int local36 = this.aDisplayMode1.getRefreshRate();
			@Pc(40) DisplayMode[] local40 = this.aGraphicsDevice1.getDisplayModes();
			@Pc(42) boolean local42 = false;
			for (@Pc(44) int local44 = 0; local44 < local40.length; local44++) {
				if (local40[local44].getWidth() == arg3 && local40[local44].getHeight() == arg4 && arg0 == local40[local44].getBitDepth()) {
					@Pc(75) int local75 = local40[local44].getRefreshRate();
					if (!local42 || Math.abs(local75 - local36) < Math.abs(arg1 - local36)) {
						local42 = true;
						arg1 = local75;
					}
				}
			}
			if (!local42) {
				arg1 = local36;
			}
		}
		this.aGraphicsDevice1.setDisplayMode(new DisplayMode(arg3, arg4, arg0, arg1));
	}

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "(B)V")
	public void method5729() {
		if (this.aDisplayMode1 != null) {
			this.aGraphicsDevice1.setDisplayMode(this.aDisplayMode1);
			if (!this.aGraphicsDevice1.getDisplayMode().equals(this.aDisplayMode1)) {
				throw new RuntimeException("Did not return to correct resolution!");
			}
			this.aDisplayMode1 = null;
		}
		this.method5731(null);
	}

	@OriginalMember(owner = "loader!e", name = "b", descriptor = "(B)[I")
	public int[] method5730() {
		@Pc(10) DisplayMode[] local10 = this.aGraphicsDevice1.getDisplayModes();
		@Pc(16) int[] local16 = new int[local10.length << 2];
		for (@Pc(18) int local18 = 0; local18 < local10.length; local18++) {
			local16[local18 << 2] = local10[local18].getWidth();
			local16[(local18 << 2) + 1] = local10[local18].getHeight();
			local16[(local18 << 2) + 2] = local10[local18].getBitDepth();
			local16[(local18 << 2) + 3] = local10[local18].getRefreshRate();
		}
		return local16;
	}

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "(ILjava/awt/Frame;)V")
	private void method5731(@OriginalArg(1) Frame arg0) {
		@Pc(1) boolean local1 = false;
		try {
			@Pc(6) Field local6 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
			local6.setAccessible(true);
			@Pc(16) boolean local16 = (Boolean) local6.get(this.aGraphicsDevice1);
			if (local16) {
				local1 = true;
				local6.set(this.aGraphicsDevice1, Boolean.FALSE);
			}
		} catch (@Pc(28) Throwable local28) {
		}
		try {
			this.aGraphicsDevice1.setFullScreenWindow(arg0);
		} finally {
			if (local1) {
				try {
					@Pc(62) Field local62 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
					local62.set(this.aGraphicsDevice1, Boolean.TRUE);
				} catch (@Pc(69) Throwable local69) {
				}
			}
		}
	}
}
