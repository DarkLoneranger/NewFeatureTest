package com.trs.bj.commonstructure.bezierCurve

/**
 * 记录动画的轨迹，可省略
 * Created by ZHAO on 2018/2/5.
 */
class AnimatorPath {
    //一系列的轨迹记录动作
    private val mPoints = arrayListOf<PathPoint>()
    /**
     *
     * @return  返回移动动作集合
     */
    val points: Collection<PathPoint>
        get() = mPoints

    /**
     * 移动位置到:
     * @param x
     * @param y
     */
    fun moveTo(x: Float, y: Float) {
        mPoints.add(PathPoint.moveTo(x, y))
    }

    /**
     * 直线移动
     * @param x
     * @param y
     */
    fun lineTo(x: Float, y: Float) {
        mPoints.add(PathPoint.lineTo(x, y))
    }

    /**
     * 二阶贝塞尔曲线移动
     * @param c0X
     * @param c0Y
     * @param x
     * @param y
     */
    fun secondBesselCurveTo(c0X: Float, c0Y: Float, x: Float, y: Float) {
        mPoints.add(PathPoint.secondBesselCurveTo(c0X, c0Y, x, y))
    }

    /**
     * 三阶贝塞尔曲线移动
     * @param c0X
     * @param c0Y
     * @param c1X
     * @param c1Y
     * @param x
     * @param y
     */
    fun thirdBesselCurveTo(c0X: Float, c0Y: Float, c1X: Float, c1Y: Float, x: Float, y: Float) {
        mPoints.add(PathPoint.thirdBesselCurveTo(c0X, c0Y, c1X, c1Y, x, y))
    }
}